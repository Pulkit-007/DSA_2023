package Lec_15;

public class Spiral_print {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                      };
        spiral(arr);
    }
    public static void spiral(int [][] arr)
    {
        int minr=0;
        int maxr= arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int totalele= arr.length*arr[0].length;
        int count=0;
        while(count<totalele)
        {
            for (int i = minc; i <= maxc && count<totalele; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;

            }
            minr++;
            for (int i = minr; i <= maxr && count<totalele; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;

            }
            maxc--;
            for (int i = maxc; i >= minc && count<totalele; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;

            }
            maxr--;
            for (int i = maxr; i >= minr && count<totalele; i--) {
                System.out.print(arr[i][minc]+" ");
                count++;

            }
            minc++;
        }

    }
}
