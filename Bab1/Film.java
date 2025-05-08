/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author Zahrah
 */
// Object Class: Film
// Kelas ini merepresentasikan sebuah film yang tersedia di bioskop
public class Film {
    // Atribut untuk menyimpan informasi tentang film
    private String judul;
    private String genre;
    private int durasi; // dalam menit

    // Konstruktor untuk menginisialisasi data film
    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    // Metode untuk menampilkan detail film
    public void tampilkanDetail() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Durasi: " + durasi + " menit");
    }

    // Getter untuk judul film
    public String getJudul() {
        return judul;
    }
}
