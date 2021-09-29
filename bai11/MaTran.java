package bai11;

import java.util.Scanner;

public class MaTran {
    private int[][] a;
    private int n,m;
    private Scanner sc = new Scanner(System.in);
    
    public MaTran(){
        System.out.println("Nhap so hang, so cot cua ma tran : ");
        this.n = Integer.parseInt(sc.nextLine());
        this.m = Integer.parseInt(sc.nextLine());
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+i+"]"+"["+j+"] = " );
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
    }
    
    public MaTran(int n,int m){
        this.n = n;
        this.a = new int[n][m];
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    // public void nhap() {
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print("["+i+"]"+"["+j+"] = " );
    //             a[i][j] = Integer.parseInt(sc.nextLine());
    //         }
    //     }
    //     System.out.println("Ma Tran vua nhap: ");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print(a[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    public void hienthi() {
        System.out.println("Ma Tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public MaTran tong(int[][] b) {
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[i][j] + b[i][j];
            }
        }
        MaTran kq = new MaTran(n,m);
        kq.setA(t);
        return kq;
    }
    
    public MaTran tich(int[][] b) {
        int[][] t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    t[i][j] = t[i][j] + t[i][k] * t[k][j];
                }
            }
        }
        MaTran kq = new MaTran(n,m);
        kq.setA(t);
        return kq;
    }
    
    public void maTranChuyenVi(){
        System.out.println("Ma tran chuyen vi:");
        int[][] t = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];  
            }  
        }
        
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
   
    }
    
    public void maxDuong(){
        long sum;
        long res = 0;
        String tmp = "";
        
        for (int i = 0; i < n; i++) {
            sum = 0;
            String x = "";
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if(sum > res){
                res = sum;
                tmp = x;
            }
        }
        
        for (int j = 0; j < n; j++) {
            sum = 0;
            String x = "";
            for (int i = 0; i < n; i++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if(sum > res){
                res = sum;
                tmp = x;
            }
        }
        

        // // các phần tử nằm trên đường chéo chính
        // // là các phần tử có chỉ số dòng = chỉ số cột
        // sum = 0;
        // String x = "";
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j) {
        //             sum += a[i][j];
        //             x += String.valueOf(a[i][j]) + " ";
        //         }
        //     }
        // }
        // if(res < sum){
        //     res = sum;
        //     tmp = x;
        // }
        
        System.out.println("Tong lon nhat: " + res);
        System.out.println(tmp);
   
    }
    
    public void minDuong(){
        long sum;
        long res = 1000000;
        String tmp = "";
        
        for (int i = 0; i < n; i++) {
            sum = 0;
            String x = "";
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if(sum < res){
                res = sum;
                tmp = x;
            }
        }
        
        for (int j = 0; j < n; j++) {
            sum = 0;
            String x = "";
            for (int i = 0; i < n; i++) {
                sum += a[i][j];
                x += String.valueOf(a[i][j]) + " ";
            }
            if(sum < res){
                res = sum;
                tmp = x;
            }
        }
        

        // // các phần tử nằm trên đường chéo chính
        // // là các phần tử có chỉ số dòng = chỉ số cột
        // sum = 0;
        // String x = "";
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j) {
        //             sum += a[i][j];
        //             x += String.valueOf(a[i][j]) + " ";
        //         }
        //     }
        // }
        // if(res > sum){
        //     res = sum;
        //     tmp = x;
        // }
        
        System.out.println("Tong nho nhat: " + res);
        System.out.println(tmp);
   
    }
    
    public Boolean matrancon(int A[][],int B[][], int aRow, int aCol, int bRow, int bCol)
    {
        int iARow, iACol;
        int iBRow, iBCol;
        boolean flg;
        int cnt = 0;
    
        for (iBRow = 0; iBRow <= bRow - aRow; iBRow++)
        {
            for (iBCol = 0; iBCol <= bCol - aCol; iBCol++)
            {
                flg = true;
                for (iARow = 0; iARow < aRow; iARow++)
                {
                    for (iACol = 0; iACol < aCol; iACol++)
                    {
                        if (A[iARow][iACol] != B[iBRow + iARow][iBCol + iACol])
                        {
                            flg = false;
                            break;
                        }
                    }
                    if (flg == false)
                    {
                        break;
                    }
                }
                if (flg == true)
                {
                    cnt++;
                }
            }
        }
    
        return (cnt > 0);
    }
 
}
