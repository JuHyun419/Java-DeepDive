package com.example.java.deepdive.string;

public class StringMethod {

    public static final String test = "original";

    public static void main(String[] args) {
//        charAt();
//        charAtBytes();
//        System.out.println(compareTo());
//        startsWith();
//        indexOf();
//        replace();
//        toLowerCase();

        repeat();

    }

    private static void charAt() {
        final String str = "original";

        System.out.println(str.charAt(0)); // 'o'
        System.out.println(str.charAt(1)); // 'r'
    }

    private static void charAtBytes() {
        System.out.println((byte) 127); // 127
        System.out.println((byte) 128); // -128
        System.out.println((byte) 255); // -1
        System.out.println((byte) 257); // 1

        System.out.println((byte) 128 & 0xff); // 128
        System.out.println((byte) 255 & 0xff); // 255
    }

    private static int compareTo() {
        String str1 = "original";
        String str2 = "original1234";
        return str1.compareTo(str2);
    }

    private static void startsWith() {
        String str = "original";

        System.out.println(str.startsWith("or"));
    }

    private static void indexOf() {
        String str = "original";

        System.out.println(str.indexOf("o")); // 0
        System.out.println(str.indexOf("r")); // 1
        System.out.println(str.indexOf("k")); // -1
    }

    private static void replace() {
        String str = "original";
        str = str.replace('i', 'p');
        System.out.println(str); // orPgPnal
    }

    private static void toLowerCase() {
        String str = "ABCD";

        str = str.toLowerCase();

        System.out.println(str);
    }

    private static void repeat() {
        String str = "ab";

        str = str.repeat(3);

        System.out.println(str); // ababab
    }

}
