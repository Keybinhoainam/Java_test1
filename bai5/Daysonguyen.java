package bai5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Daysonguyen {
    private int a[];
    private int n;
    private Scanner sc=new Scanner(System.in);
    public Daysonguyen()
    {
        System.out.printf("nhap n va day so:%d",sc.nextInt());
        a=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
    }
    public void tongds()
    {
        int tong=0;
        for(int i=0;i<n;i++)
        {
            tong+=a[i];
        }
        System.out.printf("tong day so: %d",tong);

    }
    public void tbds()
    {
        int tong=0;
        for(int i=0;i<n;i++)
        {
            tong+=a[i];
        }
        System.out.printf("trung binh: %d",tong/n);
    }
    public void maxmin()
    {
        Arrays.sort(a);
        System.out.printf("so min,so max: %d, %d",a[0],a[a.length-1]);
    }
    public void vtmaxmin()
    {
        int vtmin=0,vtmax=0;
        for(int i=0;i<n;i++)
        {
            if(a[vtmin]>a[i])vtmin=i;
            if(a[vtmax]<a[i])vtmax=i;
        }
        System.out.printf("vi tri min,max: %d, %d",vtmin,vtmax);

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
    public void snt()
    {
        System.out.printf("cac so nguyen to: ");
        for(int i=0;i<n;i++)
        {
            if(isPrime(a[i]))System.out.printf("%d ",a[i]);
        }
    }
    public int ktsx()
    {
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])return 0;
        }
        return 1;
    }
    public void sxtangdan()
    {
        Arrays.sort(a);
    }
    public void sxgiamdandan()
    {
        Arrays.sort(a);
        Collections.reverse(Arrays.asList(a));
    }

}
