package bai4;

import java.util.Scanner;

public class Menubai4 {

    public static void main(String[] args) {
        
        SoThuc x = null; 
        
        while(true){
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap 3 so thuc");
            System.out.println("2. Tim nghiem ax^2 + bx + c");
            System.out.println("3. Tinh dien tich tam giac");
            System.out.println("4. Tinh chu vi");
            System.out.println("0. Chi chon 0 -> 4");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0: System.out.println("BYE!!");
                        System.exit(0);
                case 1: x = new SoThuc();
                        break;
                case 2: x.giaiPTBac2();
                        break;
                case 3: x.dienTich();
                        break;
                case 4: x.chuVi();
                        break;
                default: System.out.println("Chi chon 0 -> 4");
                         break;
           }
       }
    }
    
}
