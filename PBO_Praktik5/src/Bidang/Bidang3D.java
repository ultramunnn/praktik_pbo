/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */

package Bidang;
public class Bidang3D {
    
    private int sisi, panjang, lebar, tinggi;
    public Bidang3D(int s){
        sisi = s;
    }
    
    public Bidang3D(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    private int getSisi(){
        return sisi;
    }
    
    private int getPanjang(){
        return panjang;
    }
    
    private int getLebar(){
        return lebar;
    }
    
    private int getTinggi(){
        return tinggi;
    }
    
    private int LuasKubus(){
        int LK = 6 *sisi * sisi;
        return LK;
    }
    
    
    private int VolumeKubus(){
        int VK = sisi *sisi*sisi;
        return VK;
    }
    
    private int LuasBalok(){
        int LB =  2*(panjang *lebar)+ (panjang*tinggi)+(lebar*tinggi);
        return LB;
    }
    
    private int VolumeBalok(){
        int VB = panjang * lebar * tinggi;
        return VB;
    }
    
    public void infoKubus(){
        System.out.println("Kubus dgn sisi : " + getSisi() 
        + " memiliki luas " + LuasKubus() + " dan Volume " + VolumeKubus());
    }
    
    public void infoBalok(){
        System.out.println("Balok dgn panjang : " + getPanjang() + " memiliki lebar " + 
        getLebar() + " dan tinggi " + getTinggi() + " memiliki luas " + LuasBalok() + 
        " dan Volume " + VolumeBalok());
    }
}
