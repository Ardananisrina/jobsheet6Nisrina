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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class contohbufferreader {
    public static void main(String[] args) throws IOException {
        String nama;
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //membuat objek bufferedReader
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan Bufferreader
        System.out.print("inputkan nama: ");
        nama = br.readLine();
        //tampilkan output isi variabel nama
        System.out.println("nama kamu adalah " + nama);
    }
    
}
