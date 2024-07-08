package javaString;

public class javaString {
    public static void main(String[] args) {
        String str="hello world";
        String str2="HELLO WORLD";
        System.out.println(str.length());//string length
        System.out.println(str.toUpperCase());//convert all letter to uppercase
        System.out.println(str.toLowerCase());
        String text="hi i am shawon";
        System.out.println(text.indexOf("am"));//its return firt character of the text string;
       char ch[]={'i','j','k'};
       String s=new String(ch);//converting char array to string
        System.out.println(s);
    }
}
