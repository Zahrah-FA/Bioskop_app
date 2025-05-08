/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3_Inheritance;

/**
 *
 * @author Zahrah
 */
import javax.swing.*;
import java.awt.event.*;

public class FilmAppGUI extends JFrame {
    private JComboBox<String> comboBox;
    private JTextArea textArea;

    public FilmAppGUI() {
        setTitle("Pilih Film Berdasarkan Tahun");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Pilih Tahun Film:");
        label.setBounds(20, 20, 150, 30);
        add(label);

        comboBox = new JComboBox<>(new String[]{"2022", "2010", "1995"});
        comboBox.setBounds(150, 20, 150, 30);
        add(comboBox);

        textArea = new JTextArea();
        textArea.setBounds(20, 70, 300, 100);
        textArea.setEditable(false);
        add(textArea);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanInfoFilm(comboBox.getSelectedItem().toString());
            }
        });

        setVisible(true);
    }

    // Metode untuk menampilkan data film berdasarkan tahun
    public void tampilkanInfoFilm(String tahun) {
        switch (tahun) {
            case "2022":
                FilmModern modern = new FilmModern("Avatar 2", "Sci-Fi", 2022, "CGI 3D");
                textArea.setText(modern.getInfo());
                break;
            case "2010":
                FilmModern film2010 = new FilmModern("Inception", "Thriller", 2010, "IMAX");
                textArea.setText(film2010.getInfo());
                break;
            case "1995":
                FilmKlasik klasik = new FilmKlasik("Braveheart", "Drama", 1995, "Mel Gibson");
                textArea.setText(klasik.getInfo());
                break;
            default:
                textArea.setText("Data film tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        new FilmAppGUI();
    }
}
