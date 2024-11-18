/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO11;

/**
 *
 * @author ASUS
 */
import java.util.List;
import java.util.ArrayList;

public class Perpustakaan {
     private List<Buku> bukuList;
    
    public Perpustakaan(){
        this.bukuList = new ArrayList<>();
    }
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
    public void infoPerpustakaan(){
        for (Buku buku : bukuList){
            buku.infoBuku();
        }
    }
}

