/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4_Enkapsulasi;

/**
 *
 * @author Zahrah
 */
// Child Class: FilmModern
class FilmModern extends Film {
    private boolean teknologiIMAX;

    public FilmModern(String judul, String genre, int durasi, boolean teknologiIMAX) {
        super(judul, genre, durasi);
        this.teknologiIMAX = teknologiIMAX;
    }

    public boolean isTeknologiIMAX() { return teknologiIMAX; }
    public void setTeknologiIMAX(boolean teknologiIMAX) { this.teknologiIMAX = teknologiIMAX; }
}