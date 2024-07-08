package javaString;

import com.sun.security.jgss.GSSUtil;

public class immutableCheck {
    public static void main(String[] args) {
        String s="shawon";
        s.concat("hasan");
        System.out.println(s);
        //string is a immutable objects;
        s=s.concat("hasan");
        System.out.println(s);
    }
}
