/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang2D;

/**
 *
 * @author munir
 */
import Bidang.Bidang;                    
public class Lingkaran extends Bidang {
    
    protected double radius;
    
    protected void setLingkaran(double r){
        this.radius = r;
    }
    
    protected double getRadius(){
        return radius;
    }
    
    protected double hitungLuas(){
        double L = Math.PI * radius * radius;
        return radius;
    }
    
    protected double hitungKeliling(){
        double L = Math.PI * radius;
        
        return L;
    }
    
    public void infoLingkaran(double r){
        
        super.setBidang("Lingkaran", "Bidang 2 Dimensi");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Jenis : " + super.getJenis());
       
        
        setLingkaran(r);
        
        System.out.println("Luas Lingkaran dengan radius : " + getRadius()
         + " adalah " + hitungLuas());
        
        System.out.println("Keliling Lingkaran dengan : " + getRadius()
        + " adalah " + hitungKeliling());
    }
}
