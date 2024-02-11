package programs;

import java.util.Scanner;

public class MatrixAdditionCommandLine {
    public static void main(String[] args) {
        int i,j;
        if (args.length != 4)
        {
            System.out.println("Invalid Argument Input for Matrix Order");
            System.exit(0);
        }
        int rows1 = Integer.parseInt(args[0]);
        int col1 = Integer.parseInt(args[1]);
        int row2 = Integer.parseInt(args[2]);
        int col2 = Integer.parseInt(args[3]);
        int[][] a = new int[rows1][col1];
        int[][] b = new int[row2][col2];
        int[][] c = new int[rows1][col2];
        if(col1!=row2)
        {
            System.out.println("Matrix Addition Not possible");
            System.exit(0);
        }
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Matrix A: ");
        for(i=0;i<rows1;i++)
        {
            for(j=0;j<col1;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        System.out.println("Enter the Matrix B: ");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                b[i][j]=ip.nextInt();
            }
        }

        for(i=0;i<rows1;i++)
        {
            for(j=0;j<col2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix Addition is: ");
        for(i=0;i<rows1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(c[i][j] +" ");
            }
            System.out.println("\n");
        }
    }
}
