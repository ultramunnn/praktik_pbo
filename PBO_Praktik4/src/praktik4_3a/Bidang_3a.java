/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik4_3a;

import static praktik4_2b.Bidang_2b.sisi;

/**
 *
 * @author munir
 */
public class Bidang_3a {
    public int sisi;
    
    Bidang_3a(int s){
      sisi = s;
    }
     
    public void setBidang(int s){
        this.sisi = s;
        
    }
    
    public int getLuas(){
     return sisi * sisi;
     
    }
}
