/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author munir
 */

import java.util.Scanner;

class Pelanggan{
    protected double diskon, potonganHarga, hargaJual, hargaBeli;
    
    protected double getPotonganHarga(double hargaJual){
        hargaJual = hargaJual;
        diskon = 0.10;
        hargaBeli = hargaJual-(diskon*hargaJual);
        return hargaBeli;
    }
    
    protected double getPotonganHarga(double hargaJual, double potongan){
        hargaJual = hargaJual;
        potonganHarga = potongan;
        diskon = 0.10;
        hargaBeli = hargaJual-(diskon*hargaJual);
        return hargaBeli;
    }
    
}

class PelangganGold extends Pelanggan {
    @Override
    protected double getPotonganHarga (double hargaJual, double potongan){
        super.hargaJual = hargaJual;
        super.potonganHarga = potongan;
        super.diskon = 0.15;
        super.hargaBeli = super.hargaJual-(super.diskon * super.hargaJual) - (2 * potonganHarga);
        return super.hargaBeli;
        
    }
    
}

class PelangganPlatinum extends Pelanggan {
    @Override
    protected double getPotonganHarga (double hargaJual, double potongan){
        super.hargaJual = hargaJual;
        super.potonganHarga = potongan;
        super.diskon = 0.15;
        super.hargaBeli = super.hargaJual-(super.diskon * super.hargaJual) - (3 * potonganHarga);
        return super.hargaBeli;
    }   
    
}

class JenisMember{
    Pelanggan p = new Pelanggan();
    Pelanggan pg = new PelangganGold();
    Pelanggan pm = new PelangganPlatinum();
    double HargaBeli;
    
    double getJenisPotongan(double harga_jual, String jenis, double potongan){
        if (jenis.equalsIgnoreCase("Member")){
            HargaBeli = p.getPotonganHarga(harga_jual, potongan);
        } else if (jenis.equalsIgnoreCase("Member Gold")){
            HargaBeli = p.getPotonganHarga(harga_jual, potongan);
        } else if (jenis.equalsIgnoreCase("Member Platinum")){
            HargaBeli = p.getPotonganHarga(harga_jual, potongan);
        } else {
            HargaBeli = p.getPotonganHarga(harga_jual);
        } 
        
        return HargaBeli;
        
    }
    
}

    
  
public class Kasir {
    
    public static void main(String[] args) {
        
        JenisMember jm = new JenisMember();
        double Potongan = 10000;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("<=====Jenis Member=====>");
        System.out.println("1. Member ");
        System.out.println("2. Member Gold ");
        System.out.println("3. Member Platinum ");
        
        System.out.println("\n");
        
        System.out.print("Masukkan Jenis Member : ");
        String Jenis = input.nextLine();
        
        System.out.print("Masukkan Total Belanja : ");
        double TotalBelanja = input.nextDouble();
        
        System.out.println("Total Belanja yang harus dibayar adalah : " + jm.getJenisPotongan(TotalBelanja, Jenis, Potongan));
        
        
    }
    
}