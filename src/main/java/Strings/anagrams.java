package Strings;

import java.util.Arrays;

public class anagrams {

    public static void main(String[] args) {
	// write your code here

        String a = "BAT";
        String b = "TRB";
        Boolean flag = false;
      // convert string into character array

        char[] firstString =  a.toLowerCase().toCharArray();
        char[] secondString = b.toLowerCase().toCharArray();


        // verify the lengths of the string are equal
        if ( a.length() != b.length())
        {
            System.out.println("The lengths of the string is not equal, Hence not anagramic");
        }
        // verify the string is not empty
        else if ( firstString == null || secondString == null)
        {
            System.out.println("Enter the Valid Strings");
        }
        else
        {
            Arrays.sort(firstString);
            Arrays.sort(secondString);
            flag = Arrays.equals(firstString,secondString);
        }

        if ( flag )
        {
            System.out.println(" Strings are Strings.anagrams");
        }
        else
        {
            System.out.println("Strings are not Strings.anagrams");
        }
    }
}
