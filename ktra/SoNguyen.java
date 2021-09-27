
package ktra;

import java.util.Scanner;


public class SoNguyen {
    private int n;
    
    public SoNguyen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = Integer.parseInt(sc.nextLine());
    }
    
    public void chiahetcho7(){
        System.out.print("Day so chia het cho 7 la: ");
        for (int i = 1; i <= n; i++) {
            if(i%7 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void giaithua() {
        System.out.print("Giai thua cua n = ");
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        System.out.println(tich);
    }
    
    
}
