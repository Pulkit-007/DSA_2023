package Assignment_3;

import java.util.Scanner;

public class Arrays_Selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        Sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
    public static void Sort(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int mini=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i])
                {
                    mini=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;

        }
    }
}
