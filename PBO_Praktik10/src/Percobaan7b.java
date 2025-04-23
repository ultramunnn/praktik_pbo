/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class Percobaan7b implements Konstanta{
    private double x;
    private double y;
    
    public static void main(String agrs[]){
        Percobaan7b obj = new Percobaan7b();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Massukkan nilai x :");
        double nilai_x = input.nextDouble();
        System.out.println("Masukkan nilai y :");
        double nilai_y = input.nextDouble();
        
        double f1 = obj.fungsiLinear(nilai_x, nilai_y);
        System.out.println("(X + Y)^2 + CX + D = " + obj.fungsiKuadrat(f1));
        
    }
    
    @Override
    public double fungsiLinear(double x, double y){
        this.x = x;
        this.y = y;
        double f1 = this.x + this.y;
        return f1;
           
    }
    
    public double fungsiKuadrat(double f1){
        double f2 = Math.pow(f1, 2) + (KONST_C*this.x) + KONST_D;
        return f2;
    }
}

interface Konstanta{
    public double KONST_C = 4.0;
    public double KONST_D = 3.0;
    public double fungsiLinear(double x, double y);
}
