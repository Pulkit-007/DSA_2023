package Lec_22;

public class Fib {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fibo(n));
    }
    public static int Fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fib1=Fibo(n-1);
        int fib2=Fibo(n-2);
        return fib1+fib2;
    }

}
