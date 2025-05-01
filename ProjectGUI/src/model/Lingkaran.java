/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author munir
 */
public class Lingkaran {
    private double Radius;
    private double PHI = 3.14;
    
    public void setRadius(double r){
        this.Radius = r;
    }
    
    public double getLuas(){
        double Luas = PHI * this.Radius * this.Radius;
        return Luas;
    }
    
    public double getKeliling(){
        double Keliling = 2 * PHI * this.Radius;
        return Keliling;
    }
    
}
