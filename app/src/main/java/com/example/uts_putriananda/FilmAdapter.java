package com.example.uts_putriananda;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FilmAdapter extends ArrayAdapter<Film>

    {

        /**
         *
         * @param activity
         * @param FilmAdapter
         */
    public FilmAdapter(Activity activity, ArrayList<Film> FilmAdapter) {
        super(activity, 0, FilmAdapter);
    }

        /**
         *
         * @param position
         * @param convertView
         * @param parent
         * @return
         */
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Membuat view berisisi converView
        View view = convertView;

        // Jika tidak ada view atau view sama dengan null maka buat lagi view yang baru
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        // dapatkan posisi data di kelas TempatWisata
        Film film = getItem(position);

        // Menemukan imageView pada view menggunakan id
        ImageView imageView = view.findViewById(R.id.image_view);
        imageView.setImageResource(film.getGambar());

        // Menemukan textViewName pada view menggunakan id
        TextView textViewName = view.findViewById(R.id.tvName);
        textViewName.setText(film.getNamaFilm());


        // Mengembalikan view
        return view;
        }
    }
