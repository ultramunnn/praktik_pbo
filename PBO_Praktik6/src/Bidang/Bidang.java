/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang;

/**
 *
 * @author munir
 */
public class Bidang {
    protected String nama, jenis;
    
    protected void setBidang(String nm, String jns){
        this.nama = nm;
        this.jenis = jns;
    }
    
    protected String getNama(){
        return nama;
    }
    
    protected String getJenis(){
        return jenis;
    }
}
