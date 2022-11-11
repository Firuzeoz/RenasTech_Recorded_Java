package Assignment_3;
import java.util.Scanner;
public class Task1_hw9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*Write a code where User is being asked for the first number, second number and third number.
 Then Compare those number print the maximum number.*/
        System.out.println("Please enter the first number: ");
    int numb1= scan.nextInt();
    System.out.println("The first number is : "+numb1);
    System.out.println("Please enter the second number: ");
    int numb2=scan.nextInt();
    System.out.println("The second number is : "+numb2);
    System.out.println("Please enter the third number: ");
    int numb3=scan.nextInt();
    System.out.println("The third number is : "+numb3);

    if (numb1>numb2 && numb1>numb3){
    System.out.println("The maximum number is num1: "+numb1);
    }else if (numb2>numb1 && numb2>numb3){
    System.out.println("The maximum number is num2: "+numb2);
    }else if (numb3>numb1 && numb3>numb2){
    System.out.println("The maximum number is num3: "+numb3);
    }else{  System.out.println("All the numbers are equal!");}
    } }
