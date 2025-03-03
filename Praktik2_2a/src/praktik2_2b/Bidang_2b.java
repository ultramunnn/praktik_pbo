/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik2_2b;

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
    
    public int kelilingPersegi(){
        return 4 * sisi;
    }
    
    public int LuasKubus(){
        return  6 * sisi * sisi;
    }
    
    public int volumeKubus(){
        return sisi * sisi * sisi;
    }
    
    public int luasPersegiPanjang(){
        return panjang * lebar;
    }
    
    public int kelilingPersegiPanjang(){
        return 2 * (panjang + lebar);
    }
    
    public int luasBalok(){
        return 2 * ((panjang + lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    public int volumeBalok(){
       return panjang * lebar * tinggi;
    }
    
    public double luasLingkaran(){
       return Math.PI * radius * radius;
    }
    
    public double kelilingLingkaran(){
        return 2 * Math.PI * radius;
    }
    
    public double luasBola(){
        return 4 * Math.PI * radius * radius;
    }
    
    public double volumeBola(){
        return (4 * Math.PI * radius *radius * radius);
    }
}
