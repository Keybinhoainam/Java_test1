package bai1;

import java.util.Scanner;

public class XauNhiPhan {
    private int n;
    private int[] a;
    private Scanner sc = new Scanner(System.in);
    
    public XauNhiPhan(){
        System.out.print("Nhap n: ");
        this.n = Integer.parseInt(sc.nextLine());
        a = new int[n+1];
    }
    
    public void Try(int i){
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            if(i == n){
                for (int k = 1; k <= n; k++) {
                    System.out.print(a[k]);
                }
                System.out.print(" ");
            }
            else
                Try(i + 1);
        }
    }
    
    public void nhiPhan(){
        System.out.println("Cac xau nhi phan tim duoc la:");
        Try(1);
        System.out.println();
    }
}
