package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int t= sc.nextInt();
        Arrays.sort(arr);
        Pairs(arr,t);
    }
    public static void Pairs(int[] arr,int t)
    {
        for (int i = 0; i < arr.length-1; i++) {
            {
                for (int j = i+1; j < arr.length; j++)
                {
                    if(arr[i]+arr[j]==t)
                    {
                        System.out.println(arr[i]+" and "+arr[j]);
                    }

                }
            }

        }
    }
}
