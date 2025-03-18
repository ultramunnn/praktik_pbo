/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang3D;

/**
 *
 * @author munir
 */
import Bidang.Bidang;
import Bidang2D.PersegiPanjang;
public class Balok extends PersegiPanjang{
    protected double tinggi;
    
    protected void setBalok(double t){
        this.tinggi = t;
    }
    
    protected double getTinggi(){
        return tinggi;
    } 
    
    protected double hitungVolume(){
        double V = super.hitungLuas() * tinggi;
        
        return V;
    }
    
    public void infoBalok(double p, double l, double t){
        super.setBidang("Balok", "Bidang 3D");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Jenis : " + super.getJenis());
        
        super.setPersegiPanjang(p,l);
        setBalok(t);
        
        System.out.println("Volume Balok dengan : " + super.getPanjang()
        + " Lebar : " + super.getLebar() + " dan Tinggi : " + getTinggi() + " adalah " + hitungVolume());
        
      
    }
}
