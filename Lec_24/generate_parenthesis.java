package Lec_24;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        Parentheses(n,0,0,"");
    }
    public static void Parentheses(int n,int open,int close,String ans)
    {
        if(open==n && close==n)
        {
            System.out.println(ans+" ");

        }
        if(open<n)
        {
            Parentheses(n,open+1,close,ans+"(");
        }
        if(close<open)
        {
            Parentheses(n,open,close+1,ans+")");
        }

    }
}
