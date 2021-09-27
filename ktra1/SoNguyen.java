
package ktra1;

import java.util.Scanner;

public class SoNguyen {
    private int n;

    public SoNguyen() {
        Scanner in=new Scanner(System.in);
        System.out.print("nhap n:");
        n=Integer.parseInt(in.nextLine());
    }
    public void chiahet7(){
        System.out.print("Day so chia het 7:");
        for (int i = 1; i <=n; i++) {
            if(i%7==0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public void giaithua(){
        long t=1;
        for (int i = 1; i <=n; i++) {
            t*=i;
        }
        System.out.println("Giai thua:"+t);
    }
    
}
