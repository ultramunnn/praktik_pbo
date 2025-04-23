import java.util.Scanner;

public class Percobaan7c extends Percobaan7d implements Konstanta, konstantaBaru{
    private double x;
    private double y;
    
    public static void main(String[] args) {
        Percobaan7c obj = new Percobaan7c();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai x : ");
        double x = input.nextDouble();
        System.out.println("Masukkan nilai y");
        double y = input.nextDouble();
        
        double f1 = obj.fungsiLinear(x,y);
        System.out.println("(X+Y)^2 + CX + 2D + E = " + obj.fungsiKuadrat(f1));
        System.out.println("(CX) + F = " + obj.hitungFungsi());
        
    }
    
    @Override
    public double fungsiLinear(double x, double y){
        this.x = x;
        this.y = y;
        double f1 = this.x + this.y;
        return f1;
    }
    
    public double fungsiKuadrat(double f1){
        double f2 = Math.pow(f1, 2) + (KONST_C*this.x) + (2*KONST_D) + KONST_E;
        return f2;
    }
    
    @Override
    public double hitungFungsi(){
        double f3 = (KONST_C*this.x) + KONST_F;
        return f3;
    }
    
    
}

interface konstantaAwal{
    public double KONST_E = 3.0;
}

interface konstantaBaru extends konstantaAwal{
    public double KONST_F = 2.0;
}

abstract class Percobaan7d{
    public double z = 1.0;
    public abstract double hitungFungsi();
}