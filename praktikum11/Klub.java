/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author ASUS
 */
import java.util.List;
import java.util.ArrayList;

public class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;
    
    public Klub(String namaKlub){
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }
    public void tambahAnggota(Anggota anggota){
        anggotaList.add(anggota);
    }
    public void infoKlub(){
        System.out.println("Nama Klub: " + namaKlub);
        for (Anggota anggota : anggotaList){
            anggota.infoAnggota();
        }
    }
}
