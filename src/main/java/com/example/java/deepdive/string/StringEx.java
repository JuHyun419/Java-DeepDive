package com.example.java.deepdive.string;

public class StringEx {

    public static void main(String[] args) {
        final String str1 = "JuHyun";
        final String str2 = "JuHyun";
        final String str3 = new String("JuHyun");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3)); // true
    }

}
