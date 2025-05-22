/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7_Polimorfisme;

/**
 *
 * @author Zahrah
 */
public abstract class Film {
    protected String judul;
    protected String genre;
    protected int durasi;

    public Film(String judul, String genre, int durasi) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
    }

    public abstract String getKategori();  // Abstract method

    public String getInfo() {
        return "Judul: " + judul + ", Genre: " + genre + ", Durasi: " + durasi + " menit";
    }
}
