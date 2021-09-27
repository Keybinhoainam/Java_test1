package bai6;

import java.util.Scanner;

public class Pi {
    private double epsilon, pi;
    private long n;
    private Scanner sc = new Scanner(System.in);
    
    public Pi(){
        System.out.print("Nhap epsilon: ");
        epsilon = Double.parseDouble(sc.nextLine());
    }
    
    public double Fpi(long n) {
        int a;
        if (n % 2 == 0)
            a = 1;
        else
            a = -1;
        return a * 1.0 / (2 * n + 1);
    }
    
    public void Pi(){
        pi = 0;
        n = 0;
        while(Math.abs(Fpi(n)) > 0.001) {
            pi += Fpi(n);
            n++;
        }
        pi *= 4;
        System.out.printf("%.4f\n", pi);
    }
}
