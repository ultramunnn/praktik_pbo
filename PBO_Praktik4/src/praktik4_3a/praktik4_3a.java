/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik4_3a;

/**
 *
 * @author munir
 */


import java.util.Scanner;
public class praktik4_3a {
    
    static void modifikasiSisi(int sb){
      Bidang_3a s = new Bidang_3a(sb);  
      
      System.out.println("Setelah Modifikasi (pass by val)--> Persegi dengan sisi " + s.sisi + " memiliki Luas : " + s.getLuas());
    }
    
    public static void modifikasiSisi(Bidang_3a sb ,int a){
        sb.setBidang(a);
        
        System.out.println("Setelah Modifikasi (pass by ref)--> Persegi dengan sisi " + sb.sisi + " memiliki Luas : " + sb.getLuas());
        
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
      
       
        System.out.print("Masukkan nilai sisi : ");
        int sisi = input.nextInt();
        
        Bidang_3a s = new Bidang_3a(sisi);
        System.out.println("Sebelum modifikasi -->  Persegi dengan sisi : " + s.sisi + " memiliki luas " + s.getLuas());
        
         modifikasiSisi(sisi);
         
         modifikasiSisi(s, 8);
    }
    
}
