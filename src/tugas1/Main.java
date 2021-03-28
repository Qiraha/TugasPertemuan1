/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;


/**
 *
 * @author Qiraha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, nim;
        int usia, uts, uas, pilih;
        double nilaiAkhir;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("----Input data-----");
        System.out.print("Nama\t: ");nama = input.nextLine();
        System.out.print("NIM\t: ");nim = input.nextLine();
        System.out.print("Usia\t: ");usia = input.nextInt();
        System.out.print("UTS\t: ");uts = input.nextInt();
        System.out.print("UAS\t: ");uas = input.nextInt();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
        
        do{
            System.out.print("\n\n\n\n\n----Menu-----\n1. Tampilkan data\n2. Edit data\n3. Exit\nPilih  : ");
            pilih=input.nextInt();
            
            if(pilih==1){
                System.out.println("Perkenalkan nama saya "+ mahasiswa.nama + ", NIM "+mahasiswa.nim);
                System.out.println("Usia           : "+ mahasiswa.usia);
                System.out.println("Nilai Akhir    : "+ mahasiswa.nilaiAkhir());
            }
            else if(pilih==2){
                input = new Scanner(System.in);
                System.out.println("\n\n----Input Data----");
                System.out.print("Nama\t: ");mahasiswa.nama = input.nextLine();
                System.out.print("NIM\t: ");mahasiswa.nim = input.nextLine();
                System.out.print("Usia\t: ");mahasiswa.usia = input.nextInt();
                System.out.print("UTS\t: ");mahasiswa.uts = input.nextInt();
                System.out.print("UAS\t: ");mahasiswa.uas = input.nextInt();
            }
            else if(pilih<1 || pilih > 3){
                System.out.println("\nAngka yang anda masukkan salah!\n");
            }
            
        }while(pilih != 3);
    }
    
}
