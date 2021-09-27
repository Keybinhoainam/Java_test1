package bai2;
import java.util.*;
public class Songuyen {
    private int n;
    private Scanner sc=new Scanner(System.in);

    public Songuyen()
    {
        System.out.print("nhap n: ");
        this.n=sc.nextInt();
    }
    public void tongchuso()
    {
        int n1=n;
        int tong=0;
        while(n1>0)
        {
            tong+=n1%10;
            n1/=10;
        }
        System.out.printf("tong chu so cua %d la: %d",n,tong);
    }
    public void phantichsoNguyento()
    {
        int n1=n;
        int start=1;
        for(int i=2;i<=n1;i++)
        {
            while(n1%i==0)
            {
                if(start==1)
                {
                    System.out.printf("%d ",i);
                    start=0;
                }
                else System.out.printf("x %d ",i);
                n1/=i;
            }
        }
    }
    public void soThuannghich()
    {
        String s=String.valueOf(n);
        int check=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                check=0;
                break;
            }
        }
        if(check==1)System.out.printf("%d la so thuan nghich",n);
        else System.out.printf("%d khong la so thuan nghich",n);
    }

}
