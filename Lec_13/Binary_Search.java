package Lec_13;

public class Binary_Search {
    public static void main(String[] args) {
        int [] arr={2,3,5,6,7,8,9,11,13,15,18};
        int item =11;
        System.out.println(Search(arr,item));

    }
    public static int Search(int [] arr,int item)
    {
        int lo=0;
        int hi= arr.length-1;
        while (lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(arr[mid]==item)
            {
                return mid;
            }
            else if(arr[mid]>item)
            {
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        return -1;

    }
}
