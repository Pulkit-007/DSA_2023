package Assignment_3;

import java.util.Scanner;

public class Arrays_Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        Sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void Sort(int [] arr)
    {
        //single element always sort hoga due to this reason loop one se start hoga
        for (int i = 1; i < arr.length; i++)
        {
            int picked=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>picked)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=picked;


        }
    }
}
