package SchildtReference.day_03;

import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {



String s1 = "Marines!";
String s2 = "Marines!";

int i = 100;

         System.out.println(s1.endsWith("!"));
         System.out.println(s1.replace('M','b'));
         System.out.println(s1.replace('b','M'));


        System.out.println(String.valueOf(i));
        System.out.println(s1.replace("M","m"));
        System.out.println(s2.contains("i"));
        System.out.println("printing equality of strings "+s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println(s1.length());
        System.out.println(s2.substring(2));


    }
}
