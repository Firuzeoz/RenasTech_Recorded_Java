package Assignment_4;
import java.util.Scanner;/*Write a code where it meets the below requirements
- a couple just got married and goes to city hall to get their last name changed
- the officer who works there asks the couple about their first name and last name for each
- also asks if they want to use the same last name or keep their original last names ( for the same last name you can use either one of them)
- based on the answer print the couples first names and last names*/
public class Task3_hw16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Could you please tell us your first and last names ? : ");
        System.out.println("My first name is: ");
        String woman= scan.nextLine();
        System.out.println("And my last name is: ");
        String lwoman=scan.nextLine();
        System.out.println("First name is: ");
        String man=scan.nextLine();
        System.out.println("My last name is: ");
        String lman= scan.nextLine();
        System.out.println("Would you like to keep your original last name please confirm with saying yes!");
        String last=scan.nextLine();
        String ans="Yes";
        if(last==ans){
            System.out.println("You didn't change your last name. Your names are :" +woman +" "+lwoman + ", and "+man+" "+lman);
        }else {
            System.out.println("You have changed your last name.Your names are : "+woman+" "+lman+", and "+man+" "+lman);
        }
        System.out.println("Congratulations!");
    }
}

