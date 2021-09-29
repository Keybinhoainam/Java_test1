package bai6;

import java.util.Scanner;

public class Menubai6 {

    public static void main(String[] args) {
        
        sin_cos goc = null;
        Pi pi = null;
        
        while(true){
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap goc x");
            System.out.println("2. Tinh sinx");
            System.out.println("3. Tinh cosx");
            System.out.println("4. Tinh pi");
            System.out.println("0. Chi chon 0 -> 4");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0: System.out.println("BYE!!");
                        System.exit(0);
                case 1: goc = new sin_cos();
                        break;
                case 2: goc = new sin_cos();
                        goc.Sin();
                        break;
                case 3: goc = new sin_cos();
                        goc.Cos();
                        break;
                case 4: pi = new Pi();
                        pi.Pi();
                        break;
                default: System.out.println("Chi chon 0 -> 4");
                         break;
           }
       }
    }
    
}
