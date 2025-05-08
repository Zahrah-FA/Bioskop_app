/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3_Inheritance;

/**
 *
 * @author Zahrah
 */
// Child Class: Film Modern
public class FilmModern extends Film {
    private String teknologi;

    public FilmModern(String judul, String genre, int tahun, String teknologi) {
        super(judul, genre, tahun);
        this.teknologi = teknologi;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nTeknologi: " + teknologi;
    }
}
