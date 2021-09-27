package bai1;

import java.util.Scanner;

public class SoNguyen {
    private int n;
    private Scanner sc = new Scanner(System.in);
    
    public SoNguyen(){
        System.out.print("Nhap n: ");
        n = Integer.parseInt(sc.nextLine());
    }
    
    public void tong1DenN(){
        long sum = n*(n-1)/2;
        System.out.println("Tong tu 1 den n: " + sum);
    }
    
    public void tich1DenN(){
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        System.out.println("Tich tu 1 den n: " + tich);
    }
    
    public void tongSoChan(){
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if(i%2 == 0)
                sum += i;
        }
        System.out.println("Tong cac so chan: " + sum);
    }
    
    public void tongSoLe(){
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if(i%2 != 0)
                sum += i;
        }
        System.out.println("Tong cac so le: " + sum);
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
    
    public void soNguyenTo(){
        System.out.print("Cac so nguyen to nho hon n: ");
        for (int i = 2; i < n ; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void uocCuaN(){
        System.out.print("Cac uoc cua n: ");
        for (int i = 1; i <= n/2; i++) {
            if(n%i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void uocNguyenTo(){
        System.out.print("Cac uoc nguyen to cua n: ");
        for (int i = 1; i <= n/2; i++) {
            if(n%i == 0 && isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void fibo() {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        
        System.out.print("So fibonaci thu n: ");
        if(n == 0 || n == 1)
            System.out.println(n);
        else{
            for(int i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f1 + f0;
            }
        }
        System.out.println(fn);
    }
    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public void fiboNhoHonN(){
        System.out.print("So fibonaci nho hon n: ");
        int i = 0;
        while(fibonacci(i) < n){
            System.out.print(fibonacci(i) + " ");
            i++;
        }
        System.out.println();
    }
    
    public void fiboNhoHonNLaNguyenTo(){
        System.out.print("So fibonaci nho hon la so nguyen to n: ");
        int i = 0;
        while(fibonacci(i) < n){
            if(isPrime(fibonacci(i)))
                System.out.print(fibonacci(i) + " ");
            i++;
        }
        System.out.println();
    }
    
    public void chiHetCho1So(){
        System.out.print("Nhap vao so can chia: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.print("Day tim duoc la: ");
        for (int i = 0; i <= n; i++) {
            if(i%x == 0)
                System.out.print(i+ " ");
        }
        System.out.println();
    }
    
    public void chiHetCho2So(){
        System.out.print("Nhap vao so thu nhat: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao so thu hai: ");
        int y = Integer.parseInt(sc.nextLine());
        System.out.print("Day tim duoc la: ");
        for (int i = 0; i <= n; i++) {
            if(i%x == 0 && i%y == 0)
                System.out.print(i+ " ");
        }
        System.out.println();
    }
    
    public void nguyenToNChuSo(){
        System.out.println("Cac so nguyen to co n chu so:");
        int x = n;
        for (int i = (int)Math.pow(10, x-1); i <= (int)Math.pow(10, x); i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public boolean isTN(int i){
        String s = String.valueOf(i);
        StringBuilder tmp = new StringBuilder(s);  
        tmp.reverse();  
        String re = tmp.toString();  
        if(s.equals(re)) return true;  
        else return false;    
    }
    
    public void thuanNghichNChuSo(){
        System.out.println("Cac so thuan nghich co n chu so:");
        int x = n;
        for (int i = (int)Math.pow(10, x-1); i <= (int)Math.pow(10, x); i++) {
            if(isTN(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
}
