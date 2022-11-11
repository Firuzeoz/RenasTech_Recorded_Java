package Assignment_5;
import java.util.Scanner;
public class Task1_hw18 {/*Write a code where user is asked to enter an integer number:
Using the given number find the factorial of that number and Print the result.
example: 5 ==> 5! = 5*4*3*2*1 = 120 */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int num=scan.nextInt();
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println("The factorial of that number is : "+fact);
    }
}
