/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6Nisrina;

/**
 *
 * @author Nisrina Izdihar
 */
import java.util.Scanner;
public class datasiswa {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, alamat;
        int usia, absen;
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        //tampilkan output ke user
        System.out.println("### data siswa smk telkom malang ###");
        System.out.print("nama siswa: ");
        //menggunakan Scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        //tampilkan output lagi
        System.out.print("alamat: ");
        //menggunakan Scanner lagi
        alamat = keyboard.next();
        System.out.print("absen: ");
        usia = keyboard.nextInt();
        System.out.print("usia: ");
        absen = keyboard.nextInt();
        //menampilkan apa yang sudah simpan di variabel
        System.out.println("-------------------");
        System.out.println("nama siswa: " + nama);
        System.out.println("alamat: " + alamat);
        System.out.println("absen: " + usia);
        System.out.println("usia: " + absen + "tahun");
        
    }
    
}
