package Lec_2;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=0;
        int star=n;
        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            int j=1;
            while (j<=space)
            {
                System.out.print("  ");
                j++;
            }
            row++;
            space++;
            star--;
            System.out.println();

        }
    }
}
