package bai1;

import java.util.Scanner;

public class SinhHoanVi {
    private int n;
    private int[] a;
    private boolean[] check;
    private Scanner sc = new Scanner(System.in);
    
    public SinhHoanVi(){
        System.out.print("Nhap n: ");
        this.n = Integer.parseInt(sc.nextLine());
        a = new int[n+1];
        check = new boolean[n+1];
    }
    
    public void Try(int i){
        for (int j = 1; j <= n; j++) {
            if(check[j] == false){
                a[i] = j;
                check[j] = true;
                if(i == n){
                    for (int k = 1; k <= n; k++) {
                        System.out.print(a[k]);
                    }
                    System.out.print(" ");
                }
                else
                    Try(i + 1);
                check[j] = false;
            }
        }
    }
    
    public void hoanVi(){
        System.out.println("Cac hoan vi phan tim duoc la:");
        Try(1);
        System.out.println();
    }
}
