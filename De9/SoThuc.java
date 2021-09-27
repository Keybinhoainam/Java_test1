package De9;

import java.util.ArrayList;
import java.util.Scanner;

public class SoThuc {
    private int n;
    private double[] a;
    private Scanner sc = new Scanner(System.in);
    
    public SoThuc(){
        
    }
    
    public void nhap(){
        System.out.print("Nhap so phan tu: ");
        n = Integer.parseInt(sc.nextLine());
        a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a" + "[" + i + "]: ");
            a[i] = Double.parseDouble(sc.nextLine());
        }
        
        System.out.println("Day so thuc:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public void phanTuNhoNhat(){
        System.out.print("Phan tu nho nhat la:");
        double min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(a[i], min);
        }
        
        System.out.println(min);
    }
    
    public void sapXepGiamGian(){
        System.out.println("Day so sau khi sap xep giam dan:");
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i] < a[j]){
                    double tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
}
