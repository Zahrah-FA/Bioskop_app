/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5_Overloading_dan_Overriding;

/**
 *
 * @author Zahrah
 */
class FilmKlasik extends Film {
    private String sutradara;

    public FilmKlasik(String judul, String genre, int durasi, String sutradara) {
        super(judul, genre, durasi);
        this.sutradara = sutradara;
    }

    public String getSutradara() { return sutradara; }
    public void setSutradara(String sutradara) { this.sutradara = sutradara; }

    // Method Overriding: Menampilkan info dengan tambahan nama sutradara
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() + ", Sutradara: " + sutradara;
    }
}
