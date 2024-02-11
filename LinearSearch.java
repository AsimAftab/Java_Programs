package programs;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int i,n,key;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of elements in the lists: ");
        n=ip.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
            a[i]=ip.nextInt();
        System.out.println("Enter the elements to search: ");
        key=ip.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                System.out.println("Key is found at location: "+i);
                break;
            }

        }
        if(i==n)
        {
            System.out.println("Key not found in the lists");
        }
    }
}
