package Lec_2;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n/2;
        int star=1;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            if(row<=n/2)
            {
                space--;
                star+=2;

            }
            else {
                space++;
                star-=2;
            }
            row++;
            System.out.println();

        }
    }
}
