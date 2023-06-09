package Lec_22;

public class Subsequence {
    public static void main(String[] args) {
        String que="abc";
        String ans="";
        PrintSub(que,ans);
    }
    public static void PrintSub(String que, String ans)
    {
        if(que.length()==0)
        {
            System.out.println(ans+" ");
            return;
        }
        char ch=que.charAt(0);
        PrintSub(que.substring(1),ans);
        PrintSub(que.substring(1),ans+ch);
    }
}
