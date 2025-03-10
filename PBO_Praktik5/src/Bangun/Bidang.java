/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author munir
 */
package Bangun;
import Bidang.Bidang2D;
import Bidang.Bidang3D;
import java.util.Scanner;

public class Bidang {

    /**
     * @param args the command line arguments
     */
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
        
        Bidang2D p = new Bidang2D(sisi);
        Bidang2D pp = new Bidang2D(panjang, lebar);
        Bidang3D k = new Bidang3D(sisi);
        Bidang3D b = new Bidang3D(panjang, lebar, tinggi);
        
        p.infoPersegi();
        pp.infoPersegiPanjang();
        k.infoKubus();
        b.infoBalok();


    }
    
}
