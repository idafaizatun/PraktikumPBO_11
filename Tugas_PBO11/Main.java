/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Andrea Hirata");
        Pengarang pengarang2 = new Pengarang("Buya Hamka");

        Buku buku1 = new Buku("Laskar Pelangi", pengarang1);
        Buku buku2 = new Buku("Tenggelamnya Kapal Van Der Wijck", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        perpustakaan.infoPerpustakaan();
    }
}

