package bai9;
import java.util.Scanner;
public class DaThuc {

    private double[] a;

    public DaThuc(int n) {
        a = new double[n + 1];
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }

    public void nhap() {
        System.out.println("Nhap cac he so da thuc");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + ": ");
            a[i] = Double.parseDouble(scanner.nextLine());
        }
    }

    public void in() {
        System.out.println("In cac he so da thuc");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void giaTri(int x) {//tính giá trị đa thức với x0=x
        double res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[i] * Math.pow(x, i);
        }
    }

    public void daoHam() {
        System.out.println("He so sau khi dao ham cap 1 la");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] * i+" ");
            
        }
        System.out.println();
    }

    public DaThuc tong(double[] b) {
        double[] c;
        DaThuc res = null;
        
        if (a.length > b.length) {
            c = new double[a.length];
            c = a;
            for (int i = 0; i < b.length; i++) {
                c[i]+=b[i];
            }
            res=new DaThuc(c.length-1);
            res.setA(c);
        }
        else{
            c=new double[b.length];
            c=b;
            for (int i = 0; i < a.length; i++) {
                c[i]+=a[i];
            }
            res=new DaThuc(c.length-1);
            res.setA(c);
        }
        return res;
    }
    
    public DaThuc tru(double[] b) {
        double[] c;
        DaThuc res=null;
        
        if (a.length > b.length) {
            c = new double[a.length];
            c = a;
            for (int i = 0; i < b.length; i++) {
                c[i]-=b[i];
            }
            res=new DaThuc(c.length-1);
            res.setA(c);
        }
        else{
            c=new double[b.length];
            c=b;
            for (int i = 0; i < a.length; i++) {
                c[i]=a[i]-c[i];
            }
            for(int i=a.length;i<c.length;i++){
                c[i]=0-c[i];
            }
            res=new DaThuc(c.length-1);
            res.setA(c);
        }
        return res;
    }
    
    public DaThuc nhan(double[] b){
        double[] c=new double[a.length+b.length-1];
        DaThuc res=new DaThuc(a.length+b.length-1);
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < b.length; j++) {
                c[i+j]+=a[i]*b[j];
            }
        }
        res.setA(c);
        return res;
    }
    
    public void chia(double[] b){
        
        
        DaThuc kq = new DaThuc(a.length-b.length);
        
        DaThuc sc = new DaThuc(a.length-1);
        sc.setA(a);
        
        DaThuc sbc=new DaThuc(b.length-1);
        sbc.setA(b);
        
        DaThuc du=new DaThuc(a.length-b.length);
        
        int i=kq.a.length-1;
        int j=sc.a.length-1;
        int k=a.length-b.length+1;
        
        while(sc.a.length>=sbc.a.length&&i>=0&&j>=0){
            kq.a[i]=(double)sc.a[j]/sbc.a[sbc.a.length-1];
            
            double[] c=new double[k];
            c[k-1]=kq.a[i];
            
            du.setA(c);
            du=du.nhan(sbc.a);
            
            sc=sc.tru(du.a);
 
            i--;
            j--;
            k--;
        }
        
        System.out.println("Da thuc ket qua");
        kq.in();
        System.out.println("Da thuc du");
        sc.in();

    }
    

}