package Assignment_5;
import java.util.Scanner;
public class Task9_hw26 {
    /* Write a code where it ask user to enter an integer number
- Reverse the given number and print the result
- Example input ( 5678 )
- Example output ( 8765 )*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer number : ");
        int num= scan.nextInt();
        int reversed=0;
        while (num !=0){
        int lastDigit=num%10;
        reversed =reversed*10 +lastDigit;
        num/=10;
        }
        System.out.println("Reversed number is : " +reversed);
    }
}
