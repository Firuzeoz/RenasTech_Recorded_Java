package Assignment_5;
import java.util.Scanner;
public class Task3_hw20 {/*Write a code where user is asked to enter a number.
Find the sum of all the even numbers between 0 to that number (included)
Find the sum of all the odd numbers between 0 to that number (included)
*/    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number : ");
        int num=scan.nextInt();
        int sum=0;
        int sum1=0;
        for (int i = 0; i <=num ; i++) {
            if(i%2 ==0){
                sum += i;
            }else {
                sum1=sum1+i;
            }
        }
        System.out.println("Sum of all the even numbers between 0 and "+num+" is : "+sum);
        System.out.println("Sum of all the odd numbers between 0 and "+num+" is : "+sum1);
    }
}
