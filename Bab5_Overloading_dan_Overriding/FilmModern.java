/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Overloading_dan_Overriding;

/**
 *
 * @author Zahrah
 */
class FilmModern extends Film {
    private boolean teknologiIMAX;

    public FilmModern(String judul, String genre, int durasi, boolean teknologiIMAX) {
        super(judul, genre, durasi);
        this.teknologiIMAX = teknologiIMAX;
    }

    public boolean isTeknologiIMAX() { return teknologiIMAX; }
    public void setTeknologiIMAX(boolean teknologiIMAX) { this.teknologiIMAX = teknologiIMAX; }

    // Method Overriding: Menampilkan info dengan status teknologi IMAX
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + ", Teknologi IMAX: " + (teknologiIMAX ? "Ya" : "Tidak");
    }
}
