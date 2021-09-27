
package ktra;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        SoNguyen x = null;
        Xau s = new Xau();
        MaTran a = null;
        
        while(true) {
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap n");
            System.out.println("2. Chia het cho 7");
            System.out.println("3. Giai thua");
            
            System.out.println("4. Nhap xau");
            System.out.println("5. Tao email");
            System.out.println("6. Lay ki tu dac biet");
            System.out.println("7. Tach so");
            
            System.out.println("8. Nhap ma tran");
            System.out.println("9. Tong 2 ma tran");
            System.out.println("10. Tich 2 ma tran");
            
            System.out.println("0. Thoat");
            System.out.println("---------------");
            System.out.println("Ban chon 0 -> 9");
            
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0: System.out.println("BYE!!");
                        System.exit(0);
                case 1: x = new SoNguyen();
                        break;
                case 2: x.chiahetcho7();
                        break;
                case 3: x.giaithua();
                        break;
                case 4: s.nhap();
                        break;
                case 5: s.email();
                        break;
                case 6: s.laykitudb();
                        break;
                case 7: s.layso();
                        break;
                case 8: a = new MaTran();
                        a.nhap();
                        break;
                case 9: MaTran b = new MaTran(a.getN());
                        b.nhap();
                        MaTran tong = b.tong(a.getA());
                        
                        tong.hienthi();
                        break;
                case 10: MaTran c = new MaTran(a.getN());
                         c.nhap();
                         MaTran tich = a.tich(c.getA());
                         
                         tich.hienthi();
                         break;
                default:
                    System.out.println("Chi chon 0 -> 9");
                    break;
            }
        }
    }
    
}
