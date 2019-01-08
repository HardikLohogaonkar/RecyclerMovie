package com.hul.recyclermovie.Api;

import com.hul.recyclermovie.MainActivity;
import com.hul.recyclermovie.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    String API_KEY = "da138928e4657134276cb03e5966b444";

//    @GET("3/movie/upcoming/")
//    Call<Movie> getUpcomingMovies(@Query("api_key") String api_key);

    @GET("movie/{id}")
    Call<Movie> getMovieDetails(@Path("id") int id, @Query("api_key") String api_key);

    @GET("?api_key="+API_KEY)
    Call<Movie>getMovieResults();
}
