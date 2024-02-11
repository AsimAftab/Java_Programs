package programs;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int row1, col1, row2, col2,i,j,k;
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter rows for first matrix : ");
        row1 = ip.nextInt();
        System.out.println("Enter column for first matrix: ");
        col1 = ip.nextInt();
        System.out.println("Enter Rows for Second Matrix: ");
        row2 = ip.nextInt();
        System.out.println("Enter Column for Second Matrix: ");
        col2 = ip.nextInt();
        if (col1 != row2)
        {
            System.out.println("Matrix Multiplication not Possible!");
            System.exit(0);
        }
        int [][] a = new int[row1][col1];
        int [][] b = new int[row2][col2];
        int [][] c = new int[row1][col2];
        System.out.println("Enter the elements of Matrix A: ");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
                a[i][j]=ip.nextInt();
        }
        System.out.println("Enter the elements of Matrix B: ");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
                b[i][j]=ip.nextInt();
        }
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col2;j++)
            {
                c[i][j]=0;
                for(k=0;k<col1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }

        }
        System.out.println("Matrix Multiplication is: ");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
