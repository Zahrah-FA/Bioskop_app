/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Overloading_dan_Overriding;

/**
 *
 * @author Zahrah
 */
public class Film {
    private String judul;
    private String genre;
    private int durasi;

    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    // Method Overloading: Menampilkan detail film dengan/ tanpa nama studio
    public String tampilkanInfo() {
        return "Judul: " + judul + ", Genre: " + genre + ", Durasi: " + durasi + " menit";
    }

    public String tampilkanInfo(String studio) {
        return tampilkanInfo() + ", Studio: " + studio;
    }

    // Getter dan Setter
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }
}
