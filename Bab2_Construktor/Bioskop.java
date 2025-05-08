/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2_Construktor;

/**
 *
 * @author Zahrah
 */
// Driver Class: Bioskop
// Kelas ini berfungsi sebagai kelas utama yang menjalankan program
public class Bioskop {
    // Atribut untuk informasi tentang bioskop
    private String namaBioskop;
    private String alamat;
    private int jumlahStudio;

    // Constructor untuk inisialisasi data bioskop
    public Bioskop(String namaBioskop, String alamat, int jumlahStudio) {
        this.namaBioskop = namaBioskop;
        this.alamat = alamat;
        this.jumlahStudio = jumlahStudio;
    }

    // Method untuk menampilkan detail bioskop
    public void tampilkanInfoBioskop() {
        System.out.println("\nInformasi Bioskop:");
        System.out.println("Nama Bioskop: " + namaBioskop);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Studio: " + jumlahStudio);
    }

    public static void main(String[] args) {
        // Membuat objek Bioskop
        Bioskop bioskop = new Bioskop("Cinema XXI", "Jl. Sudirman No.45", 5);
        bioskop.tampilkanInfoBioskop();

        // Membuat daftar film menggunakan array
        Film[] daftarFilm = {
            new Film("Avengers: Endgame", "Action", 181),
            new Film("Spirited Away", "Animation", 125),
            new Film("The Conjuring", "Horror", 112)
        };

        // Menampilkan daftar film yang tersedia
        System.out.println("\nDaftar Film yang Tersedia:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i].getJudul());
        }

        // Menampilkan detail film langsung tanpa input pengguna
        System.out.println("\nDetail Semua Film:");
        for (Film film : daftarFilm) {
            film.tampilkanDetail();
            System.out.println(); // Spasi antar film
        }
    }
}

