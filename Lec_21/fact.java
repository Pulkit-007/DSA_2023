package Lec_21;

public class fact {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fact(5));
    }
    public static int Fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fn=Fact(n-1);
        return n*fn;
    }
}
