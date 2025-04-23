/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
import java.util.Scanner;
public class Percobaan7a {
    public static void main(String[] args) {
        double KONST_C = 4.0;
        double KONST_D = 3.0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Massukkan nilai x :");
        double x = input.nextDouble();
        System.out.println("Masukkan nilai y :");
        double y = input.nextDouble();
        
        double f1 = x+y;
        
        double f2 = Math.pow(f1, 2) + (KONST_C*x) +(KONST_D);
        System.out.println("(X + Y)^2 + CX + D = " +f2);
    }
    
}
