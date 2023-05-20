package Lec_16;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int nos = sc.nextInt();//number of stalls
        int noc = sc.nextInt(); //number of cows
        int[] stall = new int[nos];
        for (int i = 0; i < stall.length; i++) {
            stall[i]= sc.nextInt();
        }
        Arrays.sort(stall);
    }
    public static int MinDistance(int [] stall,int noc)
    {
        int lo=stall[0];
        int hi= stall[stall.length-1];
        int ans=0;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(isitPossible(stall,noc,mid)==true)
            {
                ans=mid;
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }

        }
        return ans;
    }
    public static boolean isitPossible(int [] stall,int noc, int mid)
    {
        int pos=stall[0];
        int cowcount=1;
        for (int i = 1; i < stall.length; i++) {
            if(stall[i]-pos>=mid)
            {
                cowcount++;
                pos=stall[i];

            }
            if(cowcount==noc)
            {
                return true;
            }
            
        }
        return false;
    }
}
