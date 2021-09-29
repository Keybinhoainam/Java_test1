package bai10;

import java.util.Scanner;

public class PhuongTrinhTuyenTinh {
    private static int N;
    private static double  mat[][];
    
    private Scanner sc=new Scanner(System.in);

    public PhuongTrinhTuyenTinh(int[][] a, int n) {
        N=n;
        System.out.println("nhap ma tran cot B:");
        double b[]=new double [N];
        for(int i=0;i<N;i++)
        {
            b[i]=sc.nextInt();
        }
        mat=new double [N][N+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                if(j==n)mat[i][j]=b[i];
                else mat[i][j]=a[i][j];
            }
        }
    }
    static void gaussianElimination()
    {
        // int order =N;
        // double mat[][]=new double [order][order];
        // for(int i=0;i<order;i++)
        // {
        //     for(int j=0;j<order;j++)
        //     {
        //         mat[i][j]=(double)(matrix1[i][j]);
        //     }
        // }
        int singular_flag = forwardElim();
        if (singular_flag != -1)
        {
        if (mat[singular_flag][N] != 0)
            System.out.println("Hệ phương trình Vô nghiệm");
        else
            System.out.println("Hệ phương trình Vô Số nghiệm");
    
        return;
        }
        backSub();
    }
    static void swap_row(double mat[][], int i, int j,int N)
    {
    
        for (int k = 0; k <= N; k++)
        {
        double temp = mat[i][k];
        mat[i][k] = mat[j][k];
        mat[j][k] = temp;
        }
    }
    static void print()
    {
        for (int i = 0; i < N; i++, System.out.println())
        for (int j = 0; j <= N; j++)
            System.out.print(mat[i][j]);
        System.out.println();
    }
    static int forwardElim()
    {
        for (int k = 0; k < N; k++)
        {
        int i_max = k;
        int v_max = (int)mat[i_max][k];
        for (int i = k + 1; i < N; i++)
            if (Math.abs(mat[i][k]) > v_max)
            {
            v_max = (int)mat[i][k];
            i_max = i;
            }
        if (mat[k][i_max] == 0)
            return k; 
        if (i_max != k)
            swap_row(mat, k, i_max,N);
    
        for (int i = k + 1; i < N; i++)
        {
            double f = mat[i][k] / mat[k][k];
            for (int j = k + 1; j <= N; j++)
            mat[i][j] -= mat[k][j] * f;
            mat[i][k] = 0;
        }
        }
        return -1;
    }
    static void backSub()
    {
        double x[]
        = new double[N];
        for (int i = N - 1; i >= 0; i--)
        {
        x[i] = mat[i][N];
        for (int j = i + 1; j < N; j++)
        {
            x[i] -= mat[i][j] * x[j];
        }
        x[i] = x[i] / mat[i][i];
        }
    
        System.out.println();
        System.out.println("Nghiem cua he phuong trinh la:");
        for (int i = 0; i < N; i++)
        {
        System.out.format("%.6f", x[i]);
        System.out.println();
        }
    }
    
}
