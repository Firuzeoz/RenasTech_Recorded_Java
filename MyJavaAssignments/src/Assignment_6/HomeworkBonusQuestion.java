package Assignment_6;/*Write a code where user is being asked to enter a word,
find home many 3 character palindrome substrings are in the given Word
and print each one of them
(example: Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD"
there are 6 Palindrome three Char substring)*/
import java.util.Scanner;
public class HomeworkBonusQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word : "); // BIBOBOBPIPDUD
        String word = scan.nextLine();
        String pal;
        int pald=0;
        for (int i =0; i <word.length() - 2 ; i++) {
            if (word.charAt(i) == word.charAt(i + 2)) {
                pal=word.substring(i,i+3);
                System.out.println(pal);
                pald++;
            }
        }
        System.out.println("There are "+ pald+ "  Palindrome three Char substring in your word.");
    }
}
















