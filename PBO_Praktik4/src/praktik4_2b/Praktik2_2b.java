/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik4_2b;

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class Praktik2_2b {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan nilai sisi : ");
        int sisi = input.nextInt();
        
        System.out.print("Masukkan nilai panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan nilai lebar : ");
        int lebar = input.nextInt();
        
        System.out.print("Masukkan nilai tinggi : ");
        int tinggi = input.nextInt();
        
        System.out.print("Masukkan nilai radius : ");
        double radius = input.nextDouble();
        
        
        Bidang_2b rumus = new Bidang_2b(sisi, panjang, tinggi, lebar, radius);
        
        
        System.out.println("Persegi dengan sisi : " + sisi + " memiliki luas : " + rumus.getLuasPersegi() + " dan keliling : " + rumus.getKelilingPersegi());
        System.out.println("Kubus dengan sisi : " + sisi + " memiliki " + rumus.getLuasKubus() + " dan volume : " + rumus.getVolumeKubus());
        System.out.println("Persegi Panjang dengan panjang : " + panjang + " lebar : " + lebar + " memiliki luas : " + rumus.getLuasPersegiPanjang() + " dan keliling : " + rumus.getKelilingPersegi());
        System.out.println("Balok dengan panjang : " + panjang + " lebar : " + lebar + " memiliki luas : " + rumus.getLuasBalok()+ " dan volume : " + rumus.getVolumeBalok());
        System.out.println("Lingkaran dengan radius : " + radius + " memiliki luas : " + rumus.getLuasLingkaran() + " dan keliling : " + rumus.getKelilingLingkaran() );
        System.out.println("Bola dengan radius : " + radius + " memiliki luas : " + rumus.getLuasBola() + " dan volume : " + rumus.getVolumeBola());
        
    }
    
}
