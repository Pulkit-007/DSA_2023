package Lec_2;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        while(row<=n)
        {
            //star
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            //next row prep
            row++;
            star++;
            System.out.println();
        }
    }
}
