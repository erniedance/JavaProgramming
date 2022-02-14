package Strings;

import java.util.Locale;

public class StringStuff {

    public static void main(String[] args) {

        String firstName = "Ernie    ";
        String lastName  = "Dance";
        String fullName  = (firstName + " " + lastName);

        int fullNameLength = fullName.length();
        System.out.println(fullNameLength);

        //System.out.println(fullName.charAt(7));

        //System.out.println(fullName.toUpperCase(Locale.ROOT));
        System.out.println(firstName.charAt(2));
    }
}
