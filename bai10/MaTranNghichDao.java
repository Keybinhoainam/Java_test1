package bai10;

public class MaTranNghichDao 
{
    public void PrintMatrix(float ar[][], int n, int m)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        return;
    }
    public void PrintInverse(float ar[][], int n, int m)
    {
        for (int i = 0; i < n; i++) {
            for (int j = n; j < m; j++) {
                System.out.printf("%.3f  ", ar[i][j]);
            }
            System.out.printf("\n");
        }
        return;
    }
    public void InverseOfMatrix(int matrix1[][], int order)
    {
        float matrix[][]=new float [order*2][order*2];
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                matrix[i][j]=(float)(matrix1[i][j]);
            }
        }
        float temp;
        for (int i = 0; i < order; i++) {
    
            for (int j = 0; j < 2 * order; j++) {
                if (j == (i + order))
                    matrix[i][j] = 1;
            }
        }
        for (int i = order - 1; i > 0; i--) {
            if (matrix[i - 1][0] < matrix[i][0]) {
                float temp1[] = matrix[i];
                matrix[i] = matrix[i - 1];
                matrix[i - 1] = temp1;
            }
        }
        for (int i = 0; i < order; i++) {
    
            for (int j = 0; j < order; j++) {
    
                if (j != i) {
    
                    temp = matrix[j][i] / matrix[i][i];
                    for (int k = 0; k < 2 * order; k++) {
    
                        matrix[j][k] -= matrix[i][k] * temp;
                    }
                }
            }
        }
        for (int i = 0; i < order; i++) {
    
            temp = matrix[i][i];
            for (int j = 0; j < 2 * order; j++) {
    
                matrix[i][j] = matrix[i][j] / temp;
            }
        }
        System.out.printf("\n=== Ma tran nghich dao ===\n");
        PrintInverse(matrix, order, 2 * order);
    
        return;
    }
    
}

