
package ktra;

import java.util.Arrays;
import java.util.Scanner;

public class Xau {
    private String s;
    
    public Xau(){
        
    }
    
    public void nhap(){
        System.out.print("Nhap xau: ");
        Scanner sc = new Scanner(System.in);
        this.s = sc.nextLine().trim();
    }
    
    public void email(){
        String[] tmp = s.toLowerCase().split("\\s+");
        String em = tmp[tmp.length - 1];
        for (int i = 0; i < tmp.length - 1; i++) {
            em += tmp[i].charAt(0);
        }
        em += "@ptit.edu.vn";
        System.out.println("Email duoc tao: " + em);
    }
    
    public void laykitudb(){
        System.out.print("Ki tu dac biet la: ");
        String[] kitu = s.toLowerCase().split("[\\w\\s]+");
        for(String i: kitu){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void layso() {
        System.out.print("Cac so co trong chuoi: ");
        String[] so = s.toLowerCase().split("[\\D\\s]+");
        for(String i: so){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
