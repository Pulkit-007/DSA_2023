package Lec_25;

public class Key_pad {
    static String [] code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String que="23";
        Printanswer(que,"");

    }
    public static void Printanswer(String que,String ans)
    {
        if(que.length()==0)
        {
            System.out.println(ans+" ");
            return;
        }
        char ch=que.charAt(0);//2--50
        String press=code[ch-48];//abc
        for(int i=0;i< press.length();i++)
        {
            Printanswer(que.substring(1),ans+press.charAt(i));

        }
    }
}
