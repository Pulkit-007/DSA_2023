package Lec_17;

public class String_Method {
    public static void main(String[] args) {
        String str="hello";
        String str1=new String("hello");
        String str2="hello";
        String str3=new String("hello");
        System.out.println(str==str1);
        System.out.println(str==str2);    //same address
        System.out.println(str3==str1);
        System.out.println(str.equals(str2));  // content same
        String s = "hellobyeokayhey";
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(5));
        System.out.println(s.substring(2, 2));
    }
}
