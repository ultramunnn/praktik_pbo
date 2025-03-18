/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FungsiUtama;

/**
 *
 * @author munir
 */
import Bidang2D.*;
import Bidang3D.*;
import java.util.Scanner;
public class FungsiUtama {
    
    public static void main(String[] args) {
        
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran ln = new Lingkaran();
        Balok bl = new Balok();
        Tabung tb = new Tabung();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang : ");
        double p = input.nextDouble();
        
        System.out.print("Masukkan Lebar : ");
        double l = input.nextDouble();
        
        System.out.print("Masukkan Tinggi : ");
        double t = input.nextDouble();
        
        System.out.print("Masukkan Radius : ");
        double r = input.nextDouble();
        
        System.out.println("\n");
        
        pp.infoPersegiPanjang(p,l);
        
        System.out.println("\n");
        
        ln.infoLingkaran(r);
        
        System.out.println("\n");
        
        bl.infoBalok(p,l,t);
        
        System.out.println("\n");
        
        tb.infoTabung(r, t);
       
        
    }
    
}
