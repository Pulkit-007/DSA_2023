package Lec_14;

public class Two_2d_arrays {
    public static void main(String[] args) {
        int [][] arr=new int[3][4];
        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[0]);
        System.out.println(arr[1][2]);
        int [] []other=arr;
        System.out.println(other);
        Display(arr);
    }
    public static void Display(int [][] pulkit)
    {
//        int row= pulkit.length;
//        int column= pulkit[0].length;
        for (int i = 0; i < pulkit.length; i++) {
            for (int j = 0; j < pulkit[0].length; j++) {
                System.out.print(pulkit[i][j]+" ");

            }
            System.out.println();

        }
    }

}
