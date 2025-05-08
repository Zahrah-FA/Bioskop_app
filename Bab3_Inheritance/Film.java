/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3_Inheritance;

/**
 *
 * @author Zahrah
 */
// Parent Class: Film
public class Film {
    protected String judul;
    protected String genre;
    protected int tahun;

    public Film(String judul, String genre, int tahun) {
        this.judul = judul;
        this.genre = genre;
        this.tahun = tahun;
    }

    public String getInfo() {
        return "Judul: " + judul + "\nGenre: " + genre + "\nTahun: " + tahun;
    }
}
