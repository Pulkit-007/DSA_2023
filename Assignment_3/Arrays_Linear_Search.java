package Assignment_3;

import java.util.Scanner;

public class Arrays_Linear_Search {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    for (int i = 0; i < n; i++)
    {
        arr[i]=sc.nextInt();

    }
    int m=sc.nextInt();
        System.out.println(Search(arr,m));


    }
    public static int Search(int [] arr,int m)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==m)
            {
                return i;
            }

        }
        return -1;
    }

}
