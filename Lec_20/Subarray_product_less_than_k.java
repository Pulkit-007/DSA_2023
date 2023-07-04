package Lec_20;

public class Subarray_product_less_than_k {
    public static void main(String[] args) {
        int [] arr={10,5,2,6};
        int k=100;
        System.out.println(count_subarray(arr,k));
    }
    public static int count_subarray(int [] arr,int k)
    {
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length && si<=ei)
        {
            //growing
            p*=arr[ei];
            //shrinking
            while(p>=k)
            {
                p=p/arr[si];
                si++;
            }
            //ans calculate
            ans+=(ei-si+1);//window size
            ei++;
        }
        return ans;
    }
}
