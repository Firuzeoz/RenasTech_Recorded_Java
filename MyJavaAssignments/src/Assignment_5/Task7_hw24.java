package Assignment_5;
import java.util.Scanner;
public class Task7_hw24 { /*Write a code where user is being asked to enter a String and that checks if the String is Palindrome
PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
 such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String : ");
        String str=scan.nextLine();
        String reverse="";
        for (int i = str.length()-1 ; i >=0  ; i--) {
            reverse = reverse + str.charAt(i);
        }    if (str.equalsIgnoreCase(reverse)) {
               System.out.println( str + " is a Palindrome!");
            } else {
                System.out.println( str + " is NOT a Palindrome!");
            }
    }
}
