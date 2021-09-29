package bai8;

import bai10.MaTran;
import java.util.Scanner;

public class MenuBai8 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        bai8 a = new bai8();
        while(true){
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. Nhập dãy số thực");
            System.out.println("2. Liệt kê các phần tử xuất hiện 1 lần");
            System.out.println("3. Đưa ra số lần xuất hiện của các phần tử");
            System.out.println("4. Kiểm tra xem dãy số đã sắp xếp? (hoặc sắp xếp tăng dần? giảm dần?)");
            System.out.println("5. Sắp xếp dãy số (tăng dần hay giảm dần)");
            System.out.println("6. Sắp xếp dãy số (tăng dần hay giảm dần");
            
            int temp;
            System.out.println("Moi ban chon ?");
            temp=in.nextInt();
            switch(temp){
                case 1: a.nhap();
                        break;
                case 2: a.phanTu1Lan();
                        break;
                case 3: a.soLanXuatHien();
                        break;
                case 4: 
//                case 4: a.tachTu();break;
//                case 6: b.tachSo();break;
//                case 7: b.tachKiTu();break;
                
                case 0: return;
                default: System.out.print("Nhap tu 1-17 hoac 0");
            }
        }
    }
}
