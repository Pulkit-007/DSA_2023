package Lec_11;

public class Insertion_Sort {
    public static void main(String[] args) {
        int [] arr={2,13,-4,5,7};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void Sort(int [] arr)
    {
        //single element always sort hoga due to this reason loop one se start hoga
        for (int i = 1; i < arr.length; i++)
        {
            int picked=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>picked)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=picked;


        }
    }
}
