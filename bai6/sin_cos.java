package bai6;

import java.util.Scanner;

public class sin_cos {
    private double x, sin, cos, pi, epsilon;
    private long n;
    private Scanner sc = new Scanner(System.in);
    
    public sin_cos(){
        System.out.print("Nhap goc(Đơn vị Rad): ");
        this.x = Double.parseDouble(sc.nextLine());
        System.out.printf("Nhap epsilon: ");
        epsilon = Double.parseDouble(sc.nextLine());
    }
    
    public double Fsin(long n) {
        int a;
        if (n % 2 == 0)
            a = 1;
        else
            a = -1;
        double temp = 1;
        for (int i = 1; i <= 2 * n + 1; i++)
            temp = temp * x / i;
        return a * temp;
    }
    
    public double Fcos(long n) {
        int a;
        if (n % 2 == 0)
            a = 1;
        else
            a = -1;
        double temp = 1;
        for (int i = 1; i <= 2 * n; i++)
            temp = temp * x / i;
        return a * temp;
    }
    
    public void Sin(){
        sin = 0;
        n = 0;
        while(Math.abs(Fsin(n)) > epsilon) {
            sin += Fsin(n);
            n++;
        }
        System.out.printf("%.4f\n", sin);
    }
    
    public void Cos(){
        cos = 0;
        n = 0;
        while(Math.abs(Fcos(n)) > epsilon) {
            cos += Fcos(n);
            n++;
        }
        System.out.printf("%.4f\n", cos);
    }
    
}
