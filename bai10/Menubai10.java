package bai10;

import bai7.Bai7;
import java.util.Scanner;

public class Menubai10 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MaTran a = null;
        while(true){
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. Nhập ma trận vuông cấp n");
            System.out.println("2. Tìm hàng, cột hoặc đường chéo có tổng các phần tử lớn nhất");
            System.out.println("3. Tìm ma trận chuyển vị của A");
            System.out.println("4. Đưa ra hàng hoặc cột hoặc đường chéo chính có tổng nhỏ nhất (có thể lớn hơn 1)");
            System.out.println("5. Kiểm tra xem ma trận có phải là ma trận đối xứng không");
            System.out.println("6. Tìm định thức của A");
            System.out.println("7. Tìm ma trận nghịch đảo của A");
            
            int temp;
            System.out.println("Moi ban chon ?");
            temp=in.nextInt();
            switch(temp){
                case 1: a = new MaTran();
                        a.nhap();
                        break;
//                case 2: a.doDaiXau();break;
                case 2: a.maTranChuyenVi();
                        break;
                case 3: a.maxDuong();
                        break;
                case 4: a.minDuong();
                        break;
                case 5: a.checkDoiXung();
                        break;
                case 6: a.tinhDinhThuc();
                        break;
                
                case 0: return;
                default: System.out.print("Nhap tu 1-17 hoac 0");
            }
        }
    }
}
