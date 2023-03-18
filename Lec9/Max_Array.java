package Lec9;

public class Max_Array {
    public static void main(String[] args) {
        int[] arr = {-2, 3, 1, -51, 7};
        System.out.println(Max(arr));


    }
//    public static int Max(int [] arr)
//    {
//        int max=arr[0];
//        for (int i = 1; i < arr.length ; i++) {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//            }
//
//        }
//        return max;

    public static int Max(int[] arr) {
        int max = Integer.MIN_VALUE; //  -2^31
        //Integer.MAX_VALUE;   2^31-1
        // array me negative value bhi ho skti hai negative infinity se chotta kuch nhi ye rakho then we can start loop from 0th index
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
            max=Math.max(arr[i],max );

        }
        return max;
    }
}

