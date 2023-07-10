package Lec_23;

public class Count_Subsequence
{
    public static void main(String[] args)
    {
        String que="abc";
        String ans="";
        System.out.println("\n"+PrintSub(que,ans));
        //System.out.println(count);
    }
    static int count=0;
    public static int PrintSub(String que, String ans)
    {
        if(que.length()==0)
        {
            System.out.println(ans+" ");
            //count++;
            return 1;
        }
        char ch=que.charAt(0);
        int a=PrintSub(que.substring(1),ans);
        int b=PrintSub(que.substring(1),ans+ch);
    return a+b;
    }
}
