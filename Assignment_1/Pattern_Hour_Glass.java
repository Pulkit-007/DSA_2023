package Assignment_1;

import java.util.Scanner;

public class Pattern_Hour_Glass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int star=2*n-1;
        int space=0;
        int num=n;
        while(row<=2*n-1)
        {
            int x=num;
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=2*num+1)
            {
                if(x>=0) {
                    System.out.print(x+" ");
                    x--;
                }
                else
                {
                    System.out.print(num-(2*num+1-j)+" ");
                    ;
                }
                j++;

            }
            System.out.println();
            row++;
            if(i<=n) {
                space++;
                num--;
            }
            else {
                space--;
                num++;
            }
        }
    }
}
