/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_praktik3;

/**
 *
 * @author munir
 */

import java.util.Scanner;
public class konversiSuhu {
    
    public static double celcius, fahrenheit;
    public static final double K = 32;
    
    public void setSuhu(double celcius, double fahrenheit){
        konversiSuhu.celcius = celcius;
        konversiSuhu.fahrenheit = fahrenheit;
      
 
    }
    
    public double konversiCelciusFahrenheit(){
        return K + ((9/5) * celcius);
    }
    
    public double konversiFahrenheitCelcius(){
        return (fahrenheit - K) * (5.0 / 9.0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai celcius : ");
        double c = scanner.nextDouble();
        
        System.out.print("Masukkan nilai fahrenheit : ");
        double f = scanner.nextDouble();
        
        konversiSuhu konversi = new konversiSuhu();
     
        
        konversi.setSuhu(c, f);
        
        
        double hasilFahrenheit = konversi.konversiCelciusFahrenheit();
        double hasilCelcius = konversi.konversiFahrenheitCelcius();
        
        System.out.println("Konversi suhu celcius ke fahrenheit adalah " + hasilFahrenheit + " F ");
        System.out.println("Konversi suhu fahrenheit ke celcius adalah " + hasilCelcius + "C");
    }
}
