package Assignment_6;/*Write a code where user is asked to enter for 5 employee salaries
 and store those salaries.Then find the average salary of those 5 employees*/
import java.util.Scanner;
public class Homework33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double [] salary=new double[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Please enter the employee number " + (i+1) +"'s salary : ");
            salary[i]=scan.nextDouble();
        }
        double sum=0.0;
        for (int j = 0; j <5 ; j++) {
            sum=sum+salary[j];
        }
        System.out.println("The average salary of 5 employees is : " +(sum/5));
    }
}
