/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik4_1b;

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class praktik2_1b {
    
    private static String jenis;
    private static double gaji_pokok, tunjangan;
    private static final double PAJAK = 0.015;
    
    public void setJenisPegawai(String jenis, double gaji_pokok, double tunjangan){
        this.jenis = jenis;
        this.gaji_pokok = gaji_pokok;
        this.tunjangan = tunjangan;
        
        
    }
    
    public String getJenisPegawai(){
        
        return jenis;
        
    }
    
    
      public double getTotalGaji(){
          
        double totalGaji = (gaji_pokok + tunjangan) - (PAJAK * (gaji_pokok + tunjangan));

        return totalGaji;

      }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        praktik2_1b pegawai = new praktik2_1b();
       
        System.out.print("Masukkan jenis Pegawai : ");
        String inputPegawai = input.nextLine();
        
      
        
        if (inputPegawai.equals("1")) {
            pegawai.setJenisPegawai("PNS", 3000000, 600000);
        }else if (inputPegawai.equals("2")){
            pegawai.setJenisPegawai("Non PNS", 2500000, 500000);

        }else {
            System.out.println("input tidak valid");
            return;
        }
        
          System.out.println("Total gaji pegawai " + pegawai.getJenisPegawai() + " adalah " + pegawai.getTotalGaji());
        
    }
}
