/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktik4_1a;

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class Praktik2_1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gaji_pokok, tunjangan, pajak= 0.015, total_gaji;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jenis pegawai : ");
        int jenisPegawai = input.nextInt();
        
        switch(jenisPegawai){
            case 1: 
                System.out.println("PNS");
                gaji_pokok = 3000000;
                tunjangan = 600000;
                total_gaji = (gaji_pokok + tunjangan ) - (pajak*(gaji_pokok + tunjangan));
                
                System.out.println(total_gaji);
                
                break;
                
                case 2: 
                System.out.println("Tetap Non PNS");
                gaji_pokok = 2500000;
                tunjangan = 500000;
                total_gaji = (gaji_pokok + tunjangan ) - (pajak*(gaji_pokok + tunjangan));
                
                System.out.println(total_gaji);
                
                break;
        }
        
      
            
    }
    
    
    
}
