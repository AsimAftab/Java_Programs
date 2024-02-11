package programs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static int binary(int[] a,int high,int low,int key)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==key)
                return mid;
            if(key>a[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;


    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int i,n,key;
        System.out.println("Enter number of element: ");
        n=ip.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
            a[i]=ip.nextInt();
        Arrays.sort(a);
        System.out.println("Sorted element List: ");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
        System.out.println("Enter the element to search: ");
        key=ip.nextInt();
        int high=n-1,low=0;
        int result=binary(a,high,low,key);
        if(result==-1)
        {
            System.out.println("Key not present in the list");
        }
        else{
            System.out.println("Key found at location: "+result);
        }
    }
}
