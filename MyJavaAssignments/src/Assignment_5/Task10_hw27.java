package Assignment_5;

import java.util.Scanner;

public class Task10_hw27 {
    /*
    Write a code which asks user to enter a String and removes all the duplicate characters from the String
     and prints the result
ex. "AAAAAVVVCCDDAA" ==> "AVCD"*/
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Please enter a String : " );
       String string= scan.nextLine();  //"AAAAAVVVCCDDAA"
       System.out.println("The original string is: " + string);
        String newStr = "";
        for (int i = 0; i < string.length(); i++) {
            if (!newStr.contains(String.valueOf(string.charAt(i)))) {
                newStr += String.valueOf(string.charAt(i));
            }
        }
        System.out.println("The string that removed from duplicated characters is: " + newStr);
    }
}
