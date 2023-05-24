package Lec_18;

public class Print_Substring_len {
    public static void main(String[] args) {
        String str="84513";
        PrintSubString(str);
    }
    public static void PrintSubString(String str)
    {
        for(int len=1;len<=str.length();len++)
        {
            for (int j = len; j <=str.length() ; j++) {
                int i=j-len;
                System.out.print(str.substring(i,j)+"  ");

            }
            System.out.println();
        }
    }
}
