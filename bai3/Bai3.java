package bai3;

import java.util.Scanner;

public class Bai3 {
    private int n,m;
    private Scanner sc=new Scanner(System.in);
    public Bai3()
    {
        System.out.print("nhap 2 so nguyen n,m: ");
        n=sc.nextInt();
        m=sc.nextInt();
    }
    public int gcd(int n1,int m1)
    {
        if(m1==0)return n1;
        return gcd(m1,n1%m1);
    }
    public void uocboi()
    {
        int gcd=gcd(n,m);
        System.out.printf("gcd: %d, lcm: %d",gcd,n*m/gcd);
    }
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n <= 3) return true;
        if(n%2 == 0 || n%3==0) return false;

        for(int i = 5; i*i <= n; i += 6)
            if(n%i==0 || n%(i+2)==0)
                return false;
        return true;
    }
    public void nguyentoTuMDenN()
    {
        System.out.printf("So nguyen to tu %d den %d: ",n,m);
        for(int i=n;i<=m;i++)
        {
            if(isPrime(i))System.out.print(i+" ");
        }
    }
    public boolean isTN(int i){
        String s = String.valueOf(i);
        StringBuilder tmp = new StringBuilder(s);  
        tmp.reverse();  
        String re = tmp.toString();  
        if(s.equals(re)) return true;  
        else return false;    
    }
    public void thuanNghichM_N()
    {
        System.out.printf("so thuan nghich tu %d den %d: ",n,m);
        for(int i=n;i<=m;i++)
        {
            if(isTN(i))System.out.print(i+" ");
        }
    }
}
