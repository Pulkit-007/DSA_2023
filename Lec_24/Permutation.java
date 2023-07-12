package Lec_24;

public class Permutation {
    public static void main(String[] args) {
        String que="abc";
        Printanswer(que,"");

    }
    public static void Printanswer(String que,String ans)
    {
        if(que.length()==0)
        {
            System.out.println(ans+" ");
            return;
        }
        for (int i = 0; i < que.length(); i++) {
            char ch=que.charAt(i);
            String s1=que.substring(0,i);
            String s2=que.substring(i+1);
            Printanswer(s1+s2,ans+ch);
            
        }
    }
}
