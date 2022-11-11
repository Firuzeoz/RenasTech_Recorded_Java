package Assignment_5;
import java.util.Scanner;
public class Task2_hw19 {/*Write a code where user is asked to enter a number
    and check for every number between 0 to that number to see how many numbers between 0 to that number
    can be divided to 3 and 5 and sum all those numbers, Print the result
    */  public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num= scan.nextInt();
        int sum=0;
        for (int i = 0; i <num ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("The number can be divided by 3 and 5 is : " +i);
                sum+=i;
             }
        }
        System.out.println("The sum of all the numbers between 0 and "+num+" can be divided by 3 and 5 is : " + sum);
    }
}
