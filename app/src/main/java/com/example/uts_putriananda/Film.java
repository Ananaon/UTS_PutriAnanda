package com.example.uts_putriananda;

public class Film {
    // private field gambar (int), namaFilm (String).
    private int gambar;
    private String namaFilm;

    /** public constructor
     *  @param gambar
     * @param effect
     * @param namaFilm
     */
    public Film(int gambar, String effect, String namaFilm) {
        this.gambar = gambar;
        this.namaFilm = namaFilm;
    }

    /** getNama Film
     *
     * @return namaFilm
     */
    public String getNamaFilm() {
        return namaFilm;
    }

    /** getGambar
     *
     * @return gambar
     */
    public int getGambar() {
        return gambar;}
    }
