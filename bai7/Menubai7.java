package bai7;

import java.util.Scanner;

/**
 *
 * @author Nhuan's computer
 */
public class Menubai7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Bai7 b=new Bai7();
        int temp;
        while(true){
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. Nhập vào 1 đoạn");
            System.out.println("2. Đưa ra độ dài xâu");
            System.out.println("3. Đưa ra số từ");
            System.out.println("4. Đưa ra số câu");
            System.out.println("5. Tách các từ trong đoạn (có cả số và dấu cách)");
            System.out.println("6. Tách số trong đoạn (có cả chữ và dấu cách)");
            System.out.println("7. Tách các ký tự đặc biệt trong 1 đoạn (có cả chữ, số và dấu cách)");
            System.out.println("8. Tính tổng các số trong 1 đoạn (có cả chữ và dấu cách)");
            System.out.println("9. Đưa ra các từ trong 1 đoạn và số lần xuất hiện của nó");
            System.out.println("10.  Nhập thêm 1 đoạn, đưa ra các từ xuất hiện trên cả 2 đoạn");
            System.out.println("Moi ban chon ?");
            temp=in.nextInt();
            switch(temp){
                case 1: b.nhap();break;
                case 2: b.doDaiXau();break;
                case 3: b.soTu();break;
                case 4: b.soCau();break;
                case 5: b.tachTu();break;
                case 6: b.tachSo();break;
                case 7: b.tachKiTu();break;
                case 8: b.tinhTong();break;
                case 9: b.demSoLanXuatHien();break;
                case 10: b.soTu2Doan();break;
                case 0: return;
                default: System.out.print("Nhap tu 1-17 hoac 0");
            }
        }
    }
}
