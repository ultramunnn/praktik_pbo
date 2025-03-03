/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_praktik3;

/**
 *
 * @author munir
 */
import java.util.Scanner;
public class balok {
    
    public static double panjang, lebar, tinggi;
    
    public void setBalok(double panjang, double lebar, double tinggi){
        
        balok.lebar = lebar;
        balok.panjang = panjang;
        balok.tinggi = tinggi;
        
    }
    
    public double getLuas(){
        
        return 2 * (panjang * lebar + panjang * tinggi + tinggi * lebar);
        
    }
    
    public double getVolume(){
        return panjang * lebar * tinggi;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       balok luas = new balok();
       balok volume = new balok();
              
        System.out.print("Masukkan panjang balok : ");
        double panjang = scanner.nextDouble();
        
        System.out.print("Masukkan lebar balok : ");
        double lebar = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();
        
        luas.setBalok(panjang, lebar, tinggi);
        volume.setBalok(panjang, lebar, tinggi);
        
        double hasilLuas = luas.getLuas();
        double hasilVolume = luas.getVolume();
        
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Tinggi : " + tinggi);
        
        System.out.println("Luas balok adalah " + hasilLuas);
        System.out.println("Volume balok adalah " + hasilVolume);
        
        
    }
    
}
