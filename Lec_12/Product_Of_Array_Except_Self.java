package Lec_12;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int [] arr={2,3,5,6,8};

    }
    public static int[] product(int [] arr)
    {
        int n= arr.length;
        int [] left=new int[n];
        left[0]=1;
        for (int i = 1; i < n; i++) {
            left[i]=left[i-1]*arr[i];

        }
        int [] right=new int[n];
        right[n-1]=1;
        for (int i = n-2; i >= 0; i--) {
            right[i]=right[i+1]*arr[i];

        }
        for (int i = 0; i < n; i++) {
            left[i]=left[i]*right[i];

        }
        return left;
    }
}
