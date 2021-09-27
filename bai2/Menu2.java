package bai2;
import java.util.Scanner;

import bai1.SoNguyen;
public class Menu2 {
    public static void main(String[] args) {
        System.out.println("1 : nhap vao so nguyen n");
        System.out.println("2 : tong cac chu so cua n");
        System.out.println("3 : phan tich so nguyen to");
        System.out.println("4 : kiem tra thuan nghich\n");
        while(true)
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("lua chon cua ban la: ");
            int luachon=Integer.parseInt(sc.nextLine());
            Songuyen n=null;
            switch (luachon) {
                case 1:
                    n=new Songuyen();
                    break;
                case 2:
                    n=new Songuyen();
                    n.tongchuso();
                    break;
                case 3:
                    n=new Songuyen();
                    n.phantichsoNguyento();
                    break;
                case 4:
                    n=new Songuyen();
                    n.soThuannghich();
                    break;
                default:
                System.out.println("thoat");
                    System.exit(0);
                
            }
            System.out.println();
        }
    }
}
