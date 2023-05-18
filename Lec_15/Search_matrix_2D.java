package Lec_15;

import java.util.Scanner;

public class Search_matrix_2D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        System.out.println(Search(arr, x));

    }
    public static boolean Search(int [][]arr,int x)
    {
        int row=0;
        int col=arr[0].length-1;
        while(row< arr.length && col>=0)
        {
            if(arr[row][col]==x)
            {
                return true;
            } else if (arr[row][col]>x) {
                col--;
                
            }
            else {
                row++;
            }
        }
        return false;
    }
}
