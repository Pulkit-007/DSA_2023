package Lec_14;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][i]=sc.nextInt();

            }
            
        }
        Display(arr);
    }
    public static void Display(int [][] pulkit)
    {
//        int row= pulkit.length;
//        int column= pulkit[0].length;
        for (int i = 0; i < pulkit.length; i++) {
            for (int j = 0; j < pulkit[0].length; j++) {
                System.out.print(pulkit[i][j]+" ");

            }
            System.out.println();

        }
    }
}
