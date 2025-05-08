/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4_Enkapsulasi;

/**
 *
 * @author Zahrah
 */
// Parent Class: Film
class Film {
    private String judul;
    private String genre;
    private int durasi;

    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    // Getter dan Setter
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }
}