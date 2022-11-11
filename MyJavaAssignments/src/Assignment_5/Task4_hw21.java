package Assignment_5;
import java.util.Scanner;
public class Task4_hw21 {/*Write a code where user is asked to enter a number:
     Calculate the square of all the numbers from 0 to given number
     and print the result for each number,
    (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int num= scan.nextInt();
        int result=0;
        for (int i = 0; i <=num ; i++) {
            result = i *i;
        }
        System.out.println("Square of "+num+" is :"+result);
    }
}
