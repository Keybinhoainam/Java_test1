package bai15;

import java.util.Scanner;

public class PhanSo {
    private int tu,mau;
    private Scanner sc=new Scanner(System.in);
    public int gettu()
    {
        return tu;
    }
    public int getmau()
    {
        return mau;
    }
    public void nhap()
    {
        System.out.printf("nhap tu, mau: ");
        tu=sc.nextInt();
        mau=sc.nextInt();
    }
    public int Gcd(int a,int b)
    {
        if(b==0)return a;
        return Gcd(b,a%b);

    }
    public void tong(PhanSo b)
    {
        int tu1=b.getmau()*tu+b.gettu()*mau;
        int mau1=mau*b.getmau();
        int uoc=Gcd(tu1,mau1);
        System.out.printf("tong 2 phan so la : %d/%d\n",tu1/uoc,mau1/uoc);
    }
    public void hieu(PhanSo b)
    {
        int tu1=b.getmau()*tu-b.gettu()*mau;
        int mau1=mau*b.getmau();
        int uoc=Gcd(tu1,mau1);
        System.out.printf("hieu 2 phan so la : %d/%d\n",tu1/uoc,mau1/uoc);
    }
    public void tich(PhanSo b)
    {
        int tu1=tu*b.gettu();
        int mau1=mau*b.getmau();
        int uoc=Gcd(tu1,mau1);
        System.out.printf("tich 2 phan so la : %d/%d\n",tu1/uoc,mau1/uoc);
    }
    public void thuong(PhanSo b)
    {
        int tu1=tu*b.getmau();
        int mau1=mau*b.gettu();
        int uoc=Gcd(tu1,mau1);
        System.out.printf("thuong 2 phan so la : %d/%d\n",tu1/uoc,mau1/uoc);
    }
    
}
