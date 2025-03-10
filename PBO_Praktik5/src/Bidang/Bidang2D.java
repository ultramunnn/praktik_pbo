/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */

    package Bidang;
    public class Bidang2D {

        private int sisi, panjang, lebar;

        public Bidang2D(int s){
            sisi = s;
        }

        public  Bidang2D(int p, int l){
            panjang = p;
            lebar = l;
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

        private int KelilingPersegi(){
            int KelilingPersegi = 4 * sisi;
            return KelilingPersegi;
        }

        private int LuasPersegi(){
            int LuasPersegi = sisi * sisi;
            return LuasPersegi;
        }

        private int KelilingPersegiPanjang(){
            int K = 2 *(panjang + lebar);
            return K;
        }

        private int LuasPersegiPanjang(){
            int LP = panjang * lebar;
            return LP;
        }

      // Menampilkan informasi persegi
    public void infoPersegi() {
        System.out.println("Persegi dengan sisi: " + getSisi() +
                           " memiliki keliling: " + KelilingPersegi() +
                           " dan luas: " + LuasPersegi());
    }

    // Menampilkan informasi persegi panjang
    public void infoPersegiPanjang() {
        System.out.println("Persegi panjang dengan panjang: " + getPanjang() +
                           ", lebar: " + getLebar() +
                           " memiliki keliling: " + KelilingPersegiPanjang() +
                           " dan luas: " + LuasPersegiPanjang());
    }


    }
