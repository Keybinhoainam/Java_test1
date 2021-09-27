package ktra1;


import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        SoNguyen s=null;  
        Xau x=new Xau();
        MaTran m=null;
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap n");
            System.out.println("2. Chia het cho 7");
            System.out.println("3. giai thua");
            
            System.out.println("4. nhap xau");
            System.out.println("5. email");
            System.out.println("6. lay so");
            
            System.out.println("7. nhap Ma tran");
            System.out.println("8. Tong");
            System.out.println("9. ");
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:s=new SoNguyen();
                       break;
                case 2:s.chiahet7();
                       break;
                case 3:s.giaithua();
                       break;
                case 4:x.nhap();
                       break;
                case 5:x.email();
                       break;
                case 6:x.tachso();
                       break; 
                case 7:m=new MaTran();
                       m.nhap();
                       m.viet();
                       
                       break; 
                case 8:MaTran b=new MaTran(m.getN());
                       b.nhap();
                       MaTran t=m.tong(b.getMaTran());
                       //viet ra
                       m.viet();
                       b.viet();
                       t.viet();
                       break;        
                default:System.out.println("chi chon 0->4");
                      break; 
            }
        }
        
    }
    
}
