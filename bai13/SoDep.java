package bai13;

import java.util.Scanner;

public class SoDep {
    private int n;
    private Scanner sc=new Scanner(System.in);
    public void nhap()
    {
        System.out.print("nhap 1 so nguyen duong: " );
        n=sc.nextInt();
    }
    public SoDep()
    {
        
    }
    public int Sodep2()
    {
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++)
        {
            int tmp=s.length()-i-1;
            if(s.charAt(i)!=s.charAt(tmp)&&Integer.parseInt(Character.toString(s.charAt(i)))%2!=0)
            {
                return 0;
            }
        }
        return 1;
    }
    public void Cau2()
    {
        if(Sodep2()==1)System.out.printf("%d là số đẹp\n",n);
        else System.out.printf("%d không là số đẹp\n",n);
    }
    public int Sodep3()
    {
        String s=String.valueOf(n);
        int tong=0;
        if(s.charAt(0)!='8'&&s.charAt(s.length()-1)!='8')return 0;
        for(int i=0;i<s.length();i++)
        {
            tong+=(int)(s.charAt(i)-'0');
            int tmp=s.length()-i-1;
            if(s.charAt(i)!=s.charAt(tmp))
            {
                return 0;
            }
        }
        if(tong%10!=0)return 0;
        return 1;
    }
    public void Cau3()
    {
        if(Sodep3()==1)System.out.printf("%d là số đẹp\n",n);
        else System.out.printf("%d không là số đẹp\n",n);
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
    public void Cau4()
    {
        String s=String.valueOf(n);
        int check=1;
        for(int i=0;i<s.length();i++)
        {
            if(!isPrime((int)(s.charAt(i)-'0')))
            {
                check=0;
                break;
            }
        }
        if(check==1)System.out.printf("%d là số đẹp\n",n);
        else System.out.printf("%d không là số đẹp\n",n);
    }
    
}
