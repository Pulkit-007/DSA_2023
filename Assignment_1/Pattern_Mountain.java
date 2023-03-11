package Assignment_1;

import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-3;
        while(row<=n)
        {
            int i=1;
            int val=1;
            while(i<=star)
            {
                System.out.print(val+" ");
                val++;
                i++;
            }
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            int k=1;
            int val2=val-1;
            if(row==n)
            {
                k=2;
                val2=val-2;
            }
            while(k<=star)
            {

                System.out.print(val2+" ");
                val2--;
                k++;
            }
            System.out.println();
            row++;
            star++;
            space-=2;
        }
    }
}
