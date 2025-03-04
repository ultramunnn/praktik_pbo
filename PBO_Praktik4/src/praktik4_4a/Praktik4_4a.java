/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik4_4a;

/**
 *
 * @author munir
 */
import java.util.Scanner;
public class Praktik4_4a {
    
    public static int totalLuasPersegi(int min, int max){
        if(min > max){
            return 0;
        }
        return (min *min) + totalLuasPersegi(min + 1, max );
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         // Input nilai sisi awal dan akhir
          System.out.println("Masukkan nilai sisi awal!");
          int min = scanner.nextInt();
          
          System.out.println("Masukkan nilai sisi akhir!");
          int max = scanner.nextInt();
          
          // Hitung total luas persegi dengan metode rekursif
          int totalLuas = totalLuasPersegi(min, max);
          
          // Output hasil
          System.out.println("Total luas persegi: " + totalLuas);
    }
    
    
    
}
