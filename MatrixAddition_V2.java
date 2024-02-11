package programs;

import java.util.Scanner;

public class MatrixAddition_V2 {

        public static void main(String args[])
        {
            int i,j,k=0,r,c;
            System.out.print("enter no rows and colums to both the matrix one and two: ");
            Scanner sc=new Scanner(System.in);
            r=sc.nextInt();
            c=sc.nextInt();
            int[][] mat1 =new int[10][10];
            int[][] mat2 =new int[10][10];
            int[][] mat3 =new int[10][10];
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    mat1[i][j]=Integer.parseInt(args[k]);
                    k++;
                }
            }

            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    mat2[i][j]=Integer.parseInt(args[k]);
                    k++;
                }
            }

            System.out.println("according to command line arguments given\nmatrix 1 is : ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(mat1[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println("matrix 2 is: ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(mat2[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println("addition of 2 matrix is: ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    mat3[i][j]=mat1[i][j]+mat2[i][j];
                    System.out.print(mat3[i][j]+"\t");
                }
                System.out.println();
            }

        }
    }

