/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4_Enkapsulasi;

/**
 *
 * @author Zahrah
 */
// Child Class: FilmKlasik
class FilmKlasik extends Film {
    private String sutradara;

    public FilmKlasik(String judul, String genre, int durasi, String sutradara) {
        super(judul, genre, durasi);
        this.sutradara = sutradara;
    }

    public String getSutradara() { return sutradara; }
    public void setSutradara(String sutradara) { this.sutradara = sutradara; }
}
