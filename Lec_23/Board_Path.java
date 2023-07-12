package Lec_23;

public class Board_Path {
    public static void main(String[] args) {
        int n=4;
        Board_Path(n,0,"");
    }
    public static void Board_Path(int n,int curr,String ans)
    {
        if(curr==n)
        {
            System.out.println(ans+" ");
            return;
        }
        if(curr>n)
        {
            return;
        }
        Board_Path(n,curr+1,ans+1);
        Board_Path(n,curr+2,ans+2);
        Board_Path(n,curr+3,ans+3);
    }
}
