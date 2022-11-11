package Assignment_5;
import java.util.Scanner;
public class Task6_hw23 {/*Write a program where the user is being asked to enter a String
 and that   will   count   how   many   times   "a" or 'A'   is   found   in that entered String*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String:");
        String str= scan.nextLine();
        int chA=0;
        int cha=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                cha=cha+1;
            }else if(str.charAt(i)=='A'){
                chA=chA+1;
            }
        }
        System.out.println("There is "+cha+" 'a', and " +chA+" 'A' entered in the String str.");
    }
}
