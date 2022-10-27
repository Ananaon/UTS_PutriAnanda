package com.example.uts_putriananda;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public  class MainActivity2 extends AppCompatActivity {

    Context context;
    Toast toast;
    Button login;
    int duration;
    String myToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        login = (Button) findViewById(R.id.Login);
        context = getApplicationContext();
        myToast = "Login Berhasil";
        duration = Toast.LENGTH_LONG;
        toast = Toast.makeText(context, myToast, duration);
        toast.show();

        // arraylist untuk menampung data Film
        final ArrayList <Film> filmArrayList = new ArrayList<Film>();

        //menambahkan data Film ke FilmArrayList
        filmArrayList.add(new Film(R.drawable.idiot, "idiot", "Ini Adalah film Bollywood yang disutradarai " +
                "Vidhu Vinod Chopra. Jalan cerita film ini ditulis oleh Rajkumar Hirani. " +
                "Film ini dirilis pada 25 Desember 2009." +
                "Film ini diangkat dari novel Five Point Someone yang ditulis oleh Chetan Bhagat"));
        filmArrayList.add(new Film(R.drawable.john, "John", "John Wick adalah judul film Amerika Serikat produksi tahun 2014 bergenre thriller aksi yang disutradarai oleh " +
                "Chad Stahelski dan David Leitch dan beberapa bintang yang bermain dalam film ini antara lain " +
                "Keanu Reeves, Michael Nyqvist, Alfie Allen, Adrianne Palicki, Bridget Moynahan, Dean Winters, " +
                "Ian McShane, John Leguizamo, dan Willem Dafoe."));
        filmArrayList.add(new Film(R.drawable.effect, "Effect", "The Butterfly Effect adalah sebuah film fiksi ilmiah Amerika Serikat pada 2004 yang dibintangi oleh " + "Ashton Kutcher, Amy Smart, Eric Stoltz dan lain-lain. " +
                "Film ini disutradarai dan ditulis oleh Eric Bress dan J. Mackye Gruber."));
        filmArrayList.add(new Film( R.drawable.life, "Life", "Life of Pi adalah film drama fantasi petualangan Amerika Serikat tahun 2012 yang disutradarai oleh Ang Lee dan diproduseri oleh Ang Lee, Gil Netter dan David Womark. " +
                "Naskah film ini ditulis oleh David Magee berdasarkan buku Life of Pi karya Yann Martel."));
        filmArrayList.add(new Film(R.drawable.sherlock, "Sherlock", "Sherlock Holmes adalah sebuah film laga misteri tahun 2009 yang didasarkan pada karakter dengan nama yang sama yang dibuat oleh Sir Arthur Conan Doyle."));
        filmArrayList.add(new Film(R.drawable.snowden, "Snowden", "Film Snowden merupakan sebuah film yang bergenre Drama." + " Film ini disutradarai oleh Oliver Stone dan juga sebagai penulis naskah cerita dalam film Snowden ini. Film ini diproduksi oleh Rumah Produksi Open Road Film."));
        filmArrayList.add(new Film(R.drawable.taken, "Taken", "Taken (bahasa Indonesia: Diculik) adalah film thriller/action tahun 2008 yang dibintangi oleh Liam Neeson, Famke Janssen, dan Maggie Grace." + " Film ini disutradai oleh Pierre Morel dan ditulis & diproduksi oleh Luc Besson."));

        // Memasang FilmAdapter
        FilmAdapter FilmAdapter = new FilmAdapter(this, filmArrayList);

        // Menemukan ListView menggunakan id
        ListView listView = findViewById(R.id.listview);

        // pasang FilmAdapter ke listview.
        listView.setAdapter(FilmAdapter);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("UTS_PutriAnanda")
                .setMessage("Apakah Kamu Sudah selesai Membaca?")
                .setPositiveButton("sudah", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        finish();
                    }
                })
                .setNegativeButton("BELUM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                     dialogInterface.cancel();
                    }
                })
                .show();


        }
    }



