package bai4;

import java.util.Scanner;

public class SoThuc {
    private double a, b, c;
    private Scanner sc = new Scanner(System.in);
    
    public SoThuc(){
        System.out.println("Nhap vao 3 so thuc:");
        System.out.print("a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("b: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("c: ");
        c = Double.parseDouble(sc.nextLine());
        System.out.println("3 so vua nhap la: " + a + " " + b + " " + c);
    }
    
    public void giaiPTBac2() {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } 
        else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } 
        else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
    
    public void dienTich(){
        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("3 canh a, b, c khong thoa man");
        }
        else{
            double dientich;
            double p = (a+b+c)/2;
            dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Dien tich: " + dientich);
        }
        
    }
    
    public void chuVi(){
        System.out.println("Chu vi: " + (a+b+c));  
    }
}
