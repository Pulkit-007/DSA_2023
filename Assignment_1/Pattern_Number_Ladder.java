package Assignment_1;

import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int count=1;
        while(row<=n)
        {
            //star
            int i=1;

            while(i<=star)
            {
                System.out.print(count+" ");
                count++;
                i++;
            }
            //next row prep
            row++;
            star++;
            System.out.println();
        }
    }
}
