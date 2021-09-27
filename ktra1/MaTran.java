/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra1;

import java.util.Scanner;

public class MaTran {
    private int[][] a;
    private int n;
    private Scanner in=new Scanner(System.in);;
    
    public MaTran() {
        
        System.out.print("nhap so phan tu:");
        n=Integer.parseInt(in.nextLine());
        a=new int[n][n];
    }

    public MaTran(int n) {
        this.n=n;
        a=new int[n][n];
    }

    public int[][] getMaTran() {
        return a;
    }

    public void setMaTran(int[][] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhap(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+i+"]["+j+"] =");
                a[i][j]=Integer.parseInt(in.nextLine());
            }
        }
    }
    public void viet(){
        System.out.println("MA TRAN");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public MaTran tong(int[][] b){
        int[][] t=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j]=a[i][j]+b[i][j];
            }
        }
        MaTran m=new MaTran(n);
        m.setMaTran(t);
        return m;
    }
    public MaTran hieu(int[][] b){
        int[][] t=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j]=a[i][j]-b[i][j];
            }
        }
        MaTran m=new MaTran(n);
        m.setMaTran(t);
        return m;
    }
    
}
