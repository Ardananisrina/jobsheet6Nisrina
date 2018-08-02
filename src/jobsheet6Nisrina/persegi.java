/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6Nisrina;
import java.io.*;
/**
 *
 * @author Nisrina Izdihar
 */
public class persegi {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = " ";
        int hitungluas=0;
        System.out.println("---Luas Persegi---");
        System.out.print("masukkan nilai sisi: " );
        
    try {
        x = data.readLine();
        int angka = Integer.parseInt(x);
        hitungluas = angka * angka;
    } catch (Exception e) {
        System.out.println("Error");
    }
        System.out.println("Luas Persegi dengan sisi " + x + hitungluas);
        
    }
    
}
