/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8_Exception;

/**
 *
 * @author Zahrah
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class BioskopAppException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jenis film (klasik/modern): ");
            String jenis = scanner.nextLine();

            System.out.print("Masukkan judul: ");
            String judul = scanner.nextLine();

            System.out.print("Masukkan genre: ");
            String genre = scanner.nextLine();

            System.out.print("Masukkan durasi (angka): ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            Film film;

            if (jenis.equalsIgnoreCase("klasik")) {
                System.out.print("Masukkan nama sutradara: ");
                String sutradara = scanner.nextLine();
                film = new FilmKlasik(judul, genre, durasi, sutradara);
            } else if (jenis.equalsIgnoreCase("modern")) {
                System.out.print("Apakah menggunakan teknologi IMAX? (true/false): ");
                boolean imax = scanner.nextBoolean();
                film = new FilmModern(judul, genre, durasi, imax);
            } else {
                throw new IllegalArgumentException("Jenis film tidak valid. Harus 'klasik' atau 'modern'.");
            }

            System.out.println("\nInformasi Film:");
            System.out.println(film.getInfo());
            System.out.println("Kategori: " + film.getKategori());

        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan input: durasi harus berupa angka atau input IMAX harus benar.");
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan lain: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program selesai dijalankan.");
        }
    }
}
