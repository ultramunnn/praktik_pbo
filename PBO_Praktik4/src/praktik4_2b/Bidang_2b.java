/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik4_2b;

/**
 *
 * @author munir
 */

public class Bidang_2b {
    public static int sisi, panjang, lebar, tinggi;
    public static double radius;
    
    Bidang_2b(int s, int p, int l, int t, double r){
        sisi = s;
        panjang = p;
        lebar = l;
        tinggi = t;
        radius = r;
        
    }
    
    public int getLuasPersegi(){
        return sisi * sisi;
    }
    
    public int getKelilingPersegi(){
        return 4 * sisi;
    }
    
    public int getLuasKubus(){
        return  6 * sisi * sisi;
    }
    
    public int getVolumeKubus(){
        return sisi * sisi * sisi;
    }
    
    public int getLuasPersegiPanjang(){
        return panjang * lebar;
    }
    
    public int getKelilingPersegiPanjang(){
        return 2 * (panjang + lebar);
    }
    
    public int getLuasBalok(){
        return 2 * ((panjang + lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    public int getVolumeBalok(){
       return panjang * lebar * tinggi;
    }
    
    public double getLuasLingkaran(){
       return Math.PI * radius * radius;
    }
    
    public double getKelilingLingkaran(){
        return 2 * Math.PI * radius;
    }
    
    public double getLuasBola(){
        return 4 * Math.PI * radius * radius;
    }
    
    public double getVolumeBola(){
        return (4 * Math.PI * radius *radius * radius);
    }
}
