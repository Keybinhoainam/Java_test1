package bai1;

import bai6.Pi;
import bai6.sin_cos;
import java.util.Scanner;

public class Menubai1 {

    public static void main(String[] args) {
        SoNguyen n = null;
        XauNhiPhan n1 = null;
        SinhHoanVi n2 = null;
        while(true){
            System.out.println("-------MENU-------");
            System.out.println("1. Nhap n");
            System.out.println("2. Tong 1 den n");
            System.out.println("3. Tich 1 den n");
            System.out.println("4. Tong cac so chan");
            System.out.println("5. Tong cac so le");
            System.out.println("6. Cac so nguyen to nho hon n");
            System.out.println("7. Cac uoc cua n");
            System.out.println("8. Cac uoc nguyen to nho hon n");
            System.out.println("9. So fibonaci thu n");
            System.out.println("10. Day so fibonaci nho hon n");
            System.out.println("11. Day so fibonaci la so nguyen to nho hon n");
            System.out.println("12. Day so nho hon n chia het cho 1 so");
            System.out.println("13. Day so nho hon n chia het cho 2 so");
            System.out.println("14. Xau nhi phan do dai n");
            System.out.println("15. Hoan vi do dai n");
            System.out.println("16. Cac so nguyen to co n chu so");
            System.out.println("17. Cac so thuan nghich co n chu so");
            System.out.println("0. Chi chon 0 -> 13");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0: System.out.println("BYE!!");
                        System.exit(0);
                case 1: n = new SoNguyen();
                        break;
                case 2: n.tong1DenN();
                        break;
                case 3: n.tich1DenN();
                        break;
                case 4: n.tongSoChan();
                        break;
                case 5: n.tongSoLe();
                        break;
                case 6: n.soNguyenTo();
                        break;
                case 7: n.uocCuaN();
                        break;  
                case 8: n.uocNguyenTo();
                        break;  
                case 9: n.fibo();
                        break;
                case 10: n.fiboNhoHonN();
                        break;    
                case 11: n.fiboNhoHonNLaNguyenTo();
                        break;
                case 12: n.chiHetCho1So();
                        break;   
                case 13: n.chiHetCho2So();
                        break;    
                case 14: n1 = new XauNhiPhan();
                         n1.nhiPhan();
                         break; 
                case 15: n2 = new SinhHoanVi();
                         n2.hoanVi();
                         break; 
                case 16: n.nguyenToNChuSo();
                         break; 
                case 17: n.thuanNghichNChuSo();
                         break;          
                default: System.out.println("Chi chon 0 -> 13");
                         break;
           }
       }
    }
    
}
