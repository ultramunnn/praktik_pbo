package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */
public class PersegiPanjang {
    private int panjang, lebar;
    
    public void setPersegiPanjang(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    
    public int getLuas(){
        int Luas = this.panjang * this.lebar;
        return Luas;
    }
    
    public int getKeliling(){
        int Keliling = 2*(this.panjang +this.lebar);
        return Keliling;
    }
}
