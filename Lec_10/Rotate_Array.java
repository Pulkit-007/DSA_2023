package Lec_10;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        Rotate(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
    public static void Rotate(int [] arr,int k)
    {
        int n=arr.length;
        k=k%n;
        for (int i = 0; i < k; i++) {
            int last_ele=arr[n-1];
            for(int j=n-2;j>=0;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[0]=last_ele;

        }

    }
}
