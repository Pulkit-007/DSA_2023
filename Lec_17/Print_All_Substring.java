package Lec_17;

import java.util.Scanner;

public class Print_All_Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Substring(s);

    }
    public static void Substring(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
                
            }
            
        }


    }
}
