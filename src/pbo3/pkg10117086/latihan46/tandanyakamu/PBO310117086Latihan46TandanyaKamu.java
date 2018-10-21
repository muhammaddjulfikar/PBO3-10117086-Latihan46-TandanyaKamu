/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM :
 */
public class PBO310117086Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        
        Kamu objKamu = new Kamu(2018);
        System.out.print("Masukan tahun Lahir Anda : ");
        objKamu.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objKamu.getYearBirth());
        System.out.println("Hari ini Tahun : "+objKamu.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "
                +objKamu.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "
                +objKamu.tandanyaKamu(objKamu.hitungUmur()));
    }
    
}
