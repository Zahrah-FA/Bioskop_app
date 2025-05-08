/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3_Inheritance;

/**
 *
 * @author Zahrah
 */
// Child Class: Film Klasik
public class FilmKlasik extends Film {
    private String sutradara;

    public FilmKlasik(String judul, String genre, int tahun, String sutradara) {
        super(judul, genre, tahun);
        this.sutradara = sutradara;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nSutradara: " + sutradara;
    }
}
