package Assignment_3;

import java.util.Scanner;

public class Task2_hw10 {
    /*Write a code where user is being asked to enter a number
    and based on the entered number print the number is positive,
     negative or zero*/
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number=scan1.nextInt();
        if (number >0) {
            System.out.println("Entered number is positive: " + number);
        }else if (number<0){
            System.out.println("Entered number is negative: " + number);

        }else{
            System.out.println("Entered number is zero!");
        }

    }
}





