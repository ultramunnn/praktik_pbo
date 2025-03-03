/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_praktik3;

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class lingkaran {
    
    public static double radius;
    public static final double PI = 3.14;
    
    public void setRadius(double radius){
        
       lingkaran.radius = radius; 
    }
    
    public double getLuas(){
         
        return PI * radius * radius;
    }
    
 
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan jari - jari lingkaran : ");
        double input = scanner.nextDouble();
        
        lingkaran lingkaran = new lingkaran();
        lingkaran.setRadius(input);
        
        double hasil = lingkaran.getLuas();
        
        System.out.println("Luas lingkaran adalah " + hasil + "cm" );
    }
    
}
