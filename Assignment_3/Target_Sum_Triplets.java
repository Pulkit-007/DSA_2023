package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Triplets {
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
        Triplets(arr,t);
    }
    public static void Triplets(int []arr,int t)
    {
        for (int i = 0; i < arr.length-2; i++) {
            {
                for (int j = i+1; j < arr.length-1; j++) {
                    for (int k = j+1; k < arr.length; k++) {
                        if(arr[i]+arr[j]+arr[k]==t)
                        {
                            System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                        }

                    }

                }

        }


    }

    }
}
