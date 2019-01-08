package com.hul.recyclermovie;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.hul.recyclermovie.Api.ApiInterface;
import com.hul.recyclermovie.adapter.MovieAdapter;
import com.hul.recyclermovie.constant.SERVICE_URL;
import com.hul.recyclermovie.model.Movie;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progress_spinner);

        new MovieAsynTask().execute();

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_bottom);
        recyclerView.setAnimation(animation);
    }

    @NonNull
    @Override
    public Loader onCreateLoader(int i, @Nullable Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader loader, Object o) {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onLoaderReset(@NonNull Loader loader) {

    }


    public class MovieAsynTask extends AsyncTask<Void, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Void... voids) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(SERVICE_URL.url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            ApiInterface movieInterface = retrofit.create(ApiInterface.class);

            Call<Movie> call = movieInterface.getMovieResults();

            call.enqueue(new Callback<Movie>() {
                @Override
                public void onResponse(Call<Movie> call, Response<Movie> response) {

                    Movie movie = response.body();
                    recyclerView.setAdapter(new MovieAdapter(MainActivity.this, movie.getResults()));
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Movie> call, Throwable t) {

                    Toast.makeText(MainActivity.this, "Error while parsing", Toast.LENGTH_SHORT).show();
                }
            });

            return false;
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);

            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(staggeredGridLayoutManager);

        }
    }
}
