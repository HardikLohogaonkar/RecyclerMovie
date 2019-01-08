package com.hul.recyclermovie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hul.recyclermovie.R;
import com.hul.recyclermovie.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolderMovie> {

    Context context;
    List<Movie.ResultsBean> movieList;

    public MovieAdapter(Context context, List<Movie.ResultsBean> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public ViewHolderMovie onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_main_activity, viewGroup, false);
        ViewHolderMovie viewHolderMovie = new ViewHolderMovie(view);
        return viewHolderMovie;
    }

    @Override
    public void onBindViewHolder(ViewHolderMovie holder, int position) {

        final Movie.ResultsBean movie = movieList.get(position);

        holder.txtTitle.setText(movie.getTitle());
        holder.txtYear.setText("Year: " + movie.getRelease_date());
        holder.txtLanguage.setText("Language: " + movie.getOriginal_language());
        holder.txtOverview.setText("Overview: " + movie.getOverview() + "...");
        if (movie.isAdult()) {
            holder.txtCertificate.setText("(A)");
        } else {
            holder.txtCertificate.setText("(U)");

        }
        holder.imgPoster.layout(0, 0, 0, 0);
        Picasso.with(context).load("https://image.tmdb.org/t/p/w500" + movie.getPoster_path()).into(holder.imgPoster);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolderMovie extends RecyclerView.ViewHolder {

        TextView txtTitle, txtYear, txtLanguage, txtOverview, txtCertificate;
        ImageView imgPoster;

        public ViewHolderMovie(View itemView, TextView txtTitle, TextView txtYear, TextView txtLanguage, TextView txtOverview, TextView txtCertificate, ImageView imgPoster) {
            super(itemView);
            this.txtTitle = txtTitle;
            this.txtYear = txtYear;
            this.txtLanguage = txtLanguage;
            this.txtOverview = txtOverview;
            this.txtCertificate = txtCertificate;
            this.imgPoster = imgPoster;
        }

        public ViewHolderMovie(View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtLanguage = itemView.findViewById(R.id.txtLanguage);
            txtOverview = itemView.findViewById(R.id.txtOverview);
            txtCertificate = itemView.findViewById(R.id.txtCertificate);
            imgPoster = itemView.findViewById(R.id.imgPoster);
        }
    }
}
