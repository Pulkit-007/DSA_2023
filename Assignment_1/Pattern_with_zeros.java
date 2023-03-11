package Assignment_1;

import java.util.Scanner;

public class Pattern_with_zeros {
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
                if(i==1 || i==star)
                {
                    System.out.print(row+" ");
                }
                else {
                    System.out.print("0 ");
                }
                i++;
            }
            //next row prep
            row++;
            star++;
            System.out.println();
        }
    }
}
