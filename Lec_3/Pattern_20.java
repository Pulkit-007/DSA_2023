package Lec_3;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space1=n/2;
        int space2=-1;
        while(row<=n)
        {
            //space
            int i=1;
            while(i<=space1)
            {
                System.out.print("  ");
                i++;
            }
            //star

                System.out.print("* ");


            //between space
            int j=1;
            while(j<=space2)
            {
                System.out.print("  ");
                j++;
            }
            if (row >=2 && row < n) {
                System.out.print("* ");
            }
            if(row<=n/2)
            {
                space1--;
                space2+=2;

            }
            else
            {
                space1++;
                space2-=2;
            }
            row++;
            System.out.println();
        }
    }
}
