package Lec_17;

public class StringDemo {
    public static void main(String[] args) {
        String str="Hello";
        String str1=new String("Hello");
        String str2="Hello";
        String str3=new String("Hello");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        String s3="hello";
        String s4="world";
        //concat method 2
        s3=s3.concat(s4);
        System.out.println(str.intern() == str1);
        System.out.println(s3);


    }
}
