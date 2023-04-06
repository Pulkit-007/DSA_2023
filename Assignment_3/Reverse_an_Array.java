package Assignment_3;

import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");

        }
    }
    public static void Reverse(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
}
