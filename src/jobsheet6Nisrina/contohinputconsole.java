/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6Nisrina;
import java.io.Console;
/**
 *
 * @author Nisrina Izdihar
 */
public class contohinputconsole {
    public static void main(String[] args) {
        String nama; 
        int usia;
        String alamat;
        //membuat objek console
        Console con = System.console();
        //mengisi variabel nama usia alamat dengan console
        System.out.print("inputkan nama anda: ");
        nama = con.readLine();
        System.out.print("inputkan usia: ");
        usia = Integer.parseInt(con.readLine());
        System.out.print("inputkan alamat anda: ");
        alamat = con.readLine();
        //menampilkan isi variabel nama usia dan alamat
        System.out.println("nama kamu adalah: " + nama);
        System.out.println("saat ini berusia " + usia);
        System.out.println("alamat kanu berada di: " + alamat);
    }
}
