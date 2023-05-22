package Lec_17;

import java.util.Scanner;

public class Is_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Palindrome(s));
    }
    public static boolean Palindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
