/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktik2_2a;

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class Praktik2_2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sisi, panjang, lebar, tinggi;
       double radius;
       
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan nilai sisi : ");
        sisi = input.nextInt();
        
        System.out.print("Masukkan nilai panjang : ");
        panjang = input.nextInt();
        
        System.out.print("Masukkan nilai lebar : ");
        lebar = input.nextInt();
        
        System.out.print("Masukkan nilai tinggi : ");
        tinggi = input.nextInt();
        
        System.out.print("Masukkan nilai radius : ");
        radius = input.nextDouble();
        
        int luasPersegi = sisi * sisi;
        int kelilingPersegi = 4 * sisi;
        int luasKubus = 6 * sisi * sisi;
        int volumeKubus = sisi * sisi * sisi;
        int luasPersegiPanjang = panjang * lebar;
        int kelilingPersegiPanjang = 2 * (panjang + lebar);
        int luasBalok = 2 * ((panjang + lebar) + (panjang * tinggi) + (lebar * tinggi));
        int volumeBalok = panjang * lebar * tinggi;
        
        double luasLingkaran = Math.PI * radius * radius;
        double kelilingLingkaran = 2 * Math.PI * radius;
        double luasBola = 4 * Math.PI * radius * radius;
        double volumeBola =(4 * Math.PI * radius *radius * radius);
        
        System.out.println("Persegi dengan sisi : " + sisi + " memiliki luas : " +luasPersegi + " dan keliling : " + kelilingPersegi);
        System.out.println("Kubus dengan sisi : " + sisi + " memiliki " + luasKubus + " dan volume : " + volumeKubus);
        System.out.println("Persegi Panjang dengan panjang : " + panjang + " lebar : " + lebar + " memiliki luas : " + luasPersegiPanjang + " dan keliling : " + kelilingPersegiPanjang );
        System.out.println("Balok dengan panjang : " + panjang + " lebar : " + lebar + " memiliki luas : " + luasBalok+ " dan volume : " + volumeBalok);
        System.out.println("Lingkaran dengan radius : " + radius + " memiliki luas : " + luasLingkaran + " dan keliling : " + kelilingLingkaran );
        System.out.println("Bola dengan radius : " + radius + " memiliki luas : " + luasBola + " dan volume : " + volumeBola);
        
        
         
       
       
       
    }
    
}
