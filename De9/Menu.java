package De9;

import bai10.MaTran;
import java.util.Scanner;
import ktra1.SoNguyen;

public class Menu {

    public static void main(String[] args) {
        SoThuc a = null;
        VanBan x = null;
        DaThuc p = null;
        DaThuc q = null;
        while(true){
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. Nhập vào dãy số thực");
            System.out.println("2. Viết ra phần tử nhỏ nhất của số");
            System.out.println("3. Sắp xếp và đưa ra dãy số giảm dần");
            System.out.println("4. Nhập vào 1 đoạn văn bản");
            System.out.println("5. Đưa ra số câu (kết thúc bởi dấu .?!)");
            System.out.println("6. Chuẩn hóa và viết ra (các từ cách nhau 1 dấu cách, trước các dấu câu không có dấu cách, sau các dấu câu có 1 dấu cách)");
            System.out.println("7. Nhập vào 1 đa thức (Pn(x))");
            System.out.println("8. Tính Pn(x) + Qm(x)");
            System.out.println("9. Tính Pn(x) / Qm(x) và đa thức dư");
            System.out.print("Ban chon (0->9): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1: a = new SoThuc();
                        a.nhap();
                        break;
                case 2: a.phanTuNhoNhat();
                        break;
                case 3: a.sapXepGiamGian();
                        break;
                case 4: x = new VanBan();
                        x.nhap();
                        break;
                case 5: x.demSoCau();
                        break;
                case 6: x.chuanHoa();
                        break; 
                case 7: p = new DaThuc(sc.nextLine());
                        q = new DaThuc(sc.nextLine());
                        break; 
                case 8: DaThuc res = p.cong(q);
                        res.getDaThuc();
                        break;    
                case 9:
                       break;  
                default:System.out.println("chi chon 0->9");
                      break; 
            }
        }
        
    }
    
}

