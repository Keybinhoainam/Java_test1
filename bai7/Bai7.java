package bai7;

import java.util.Scanner;

/**
 *
 * @author Nhuan's computer
 */
public class Bai7 {
    Scanner in=new Scanner(System.in);
    private String s;
    public void nhap(){
        System.out.println("Nhap doan:");
        s=in.nextLine();
        System.out.println("Doan vua nhap:");
        System.out.println(s);
    }
    public void doDaiXau(){
        System.out.println("Chieu dai sau: "+s.length());
    }
    public void soTu(){
        s=s.trim();
        String S=s;
        String[] tu=S.split("[^a-zA-Z0-9]");
        int dem=0;
        for(int i=0; i<tu.length; i++)
            if(tu[i].length()!=0) dem+=1;
        System.out.println("So tu: "+dem);
    }
    public void soCau(){
        s=s.trim();
        String[] cau = s.split("[\\.\\?\\!]");
        int dem=0;
        for(int i=0; i<cau.length; i++)
            if(cau[i].length()!=0) dem+=1;
        System.out.println("So cau: "+dem);
    }
    public void tachTu(){
        s=s.trim();
        String S=s;
        System.out.println("Cac tu:");
        String[] str=S.split("[^a-zA-Z]");
        for(int i=0; i<str.length; i++){
            if(str[i].length()!=0)
            System.out.println(str[i]);
        }
    }
    public void tachSo(){
        s=s.trim();
        String S=s;
        System.out.println("Tach so:");
        String[] str=S.split("[^0-9]");
        for(int i=0; i<str.length; i++){
            if(str[i].length()!=0)
            System.out.println(str[i]);
        }
    }
    public void tachKiTu(){
        s=s.trim();
        String S=s;
        System.out.println("Tach ki tu:");
        String[] str=S.split("[a-zA-Z0-9\\s+]");
        for(int i=0; i<str.length; i++){
            if(str[i].length()!=0)
            System.out.println(str[i]);
        }
    }
    public void tinhTong(){
        s=s.trim();
        String S=s;
        System.out.println("Tach so:");
        String[] str=S.split("[^0-9]");
        int sum=0;
        for(int i=0; i<str.length; i++){
            if(str[i].length()!=0) sum+=Integer.parseInt(str[i]);
        }
        System.out.println("Tong cac chu so: "+sum);
    }
    public void demSoLanXuatHien(){
        s=s.trim();
        String S=s;
        String[] tu=S.split("[^a-zA-Z0-9]");
        int dem=0;
        for(int i=0; i<tu.length-1; i++){
            dem=1;
            for(int j=i+1; j<tu.length; j++){
                if(tu[i].equals(tu[j])==true){
                    dem+=1;
                    tu[j]="";
                }
            }
            if(tu[i].length()!=0) System.out.println(tu[i]+" "+dem);
        }
    }
    public void soTu2Doan(){
        System.out.println("Nhap them doan:");
        String x=in.nextLine();
        s=s.trim();
        String S=s+" "+x;
        String[] tu=S.split("[^a-zA-Z0-9]");
        int dem=0;
        System.out.println("So tu trong ca 2 doan:");
        for(int i=0; i<tu.length; i++)
            if(tu[i].length()!=0) 
            System.out.println(tu[i]);
    }
}
