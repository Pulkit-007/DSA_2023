package Lec_20;

import java.util.Scanner;

public class Kartik_Bhaiya_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.next();
        int flip_a=Max(s,'a',k);
        int flip_b=Max(s,'b',k);
        System.out.println(Math.max(flip_a,flip_b));
    }
    public static int Max(String s,char ch,int k)
    {
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        while (ei<s.length())
        {
            //growing
            if(s.charAt(ei)==ch)
            {
                flip++;
            }
            //shrink
            while(flip>k && si<ei )
            {
                if(s.charAt(si)==ch)
                {
                    flip--;
                }
                si++;
            }
            ans=Math.max(ei-si+1,ans);
        }
        return ans;
    }
}
