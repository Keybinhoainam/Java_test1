
package ktra;

import java.util.Scanner;


public class MaTran {
    private int[][] a;
    private int n;
    private Scanner sc = new Scanner(System.in);
    
    public MaTran(){
        System.out.println("Nhap so phan tu cua ma tran vuong: ");
        
        this.n = Integer.parseInt(sc.nextLine());
        a = new int[n][n];
    }
    
    public MaTran(int n){
        this.n = n;
        this.a = new int[n][n];
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+i+"]"+"["+j+"] = " );
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Ma Tran vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void hienthi() {
        System.out.println("Ma Tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public MaTran tong(int[][] b) {
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[i][j] + b[i][j];
            }
        }
        MaTran m = new MaTran(n);
        m.setA(t);
        return m;
    }
    
    public MaTran tich(int[][] b) {
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    t[i][j] = t[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        MaTran m = new MaTran(n);
        m.setA(t);
        return m;
    }
    
}
