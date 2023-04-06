package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        Sorted(arr);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
    public static void Sorted(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];

        }
    }
}
