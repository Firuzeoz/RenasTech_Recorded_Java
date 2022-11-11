
    /*Write a calculator program by following instructions:
1) Ask the user to enter 1st number
2) Ask the user to enter second number
3) Ask the user to select the operation ( ask user to enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.)
4) based on the selection perform operation and print the result of the operation
(Ex. enter 1st number : 20
	enter 2nd number: 25
	Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
	The result is : 45.)
	*/
    package Assignment_3;
    import java.util.Scanner;
    public class Task5_hw13 {
    public static void main(String[] args) {
        Scanner scan4=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double first=scan4.nextDouble();
        System.out.println("Please enter the second number: ");
        double second=scan4.nextDouble();
        System.out.println("Please select 1 for Summation,2 for Subtraction, 3 for Multiplication, and 4 for division.: ");
        int opr=scan4.nextInt();
        switch(opr) {
            case 1:
                System.out.println("The result is : " + (first+second));
                break;
            case 2:
                System.out.println("The result is : " + (first-second));
                break;
            case 3:
                System.out.println("The result is : " + (first*second));
                break;
            case 4:
                System.out.println("The result is : " +(first/second));
                break;
            default:{
                System.out.println(" -- Please enter a valid data -- ");
            } } } }
