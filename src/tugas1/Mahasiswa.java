/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author hp
 */
public class Mahasiswa {
    
    String nama, nim;
    int usia, uts, uas;
    
    Mahasiswa(String nama, String nim, Integer usia, Integer uts, Integer uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    int nilaiAkhir(){
        int nilaiakhir;
        nilaiakhir = (uts+uas)/2;
        return nilaiakhir;
    }
}
