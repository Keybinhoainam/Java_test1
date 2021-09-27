/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra1;

import java.util.Arrays;
import java.util.Scanner;

public class Xau {
    private String xau;

    public Xau() {
    }
    public void nhap(){
        Scanner in=new Scanner(System.in);
        System.out.print("nhap xau:");
        xau=in.nextLine().trim();
    }
    public void email(){
        //Trinh   thi Van   anh  anhttv@ptit.edu.vn
        String[] x=xau.toLowerCase().split("\\s+");
        String e=x[x.length-1];
        for (int i = 0; i < x.length-1; i++) {
            e+=x[i].charAt(0);
        }
        e+="@ptit.edu.vn";
        System.out.println(e);
    }
    public void tachso(){
        String[] so=xau.toLowerCase().split("[a-z\\s]+");
        System.out.println(Arrays.toString(so));
    }
}
