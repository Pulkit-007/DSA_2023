package Lec_13;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSum(arr));
    }
    public static int MaxSum(int [ ] arr)
    {
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                ans=Math.max(sum,ans);

            }

        }
        return ans;
    }
}
