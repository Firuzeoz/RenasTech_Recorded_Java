package Assignment_4;
import java.util.Scanner;/*Write a code where user is being asked to enter a name:
 if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result*/
public class Task1_hw14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.nextLine();
        if (name.charAt(0) == 'A') {
            if (name.charAt(name.length() - 1) == 'L') {
                String replaced = name.replaceFirst("A", "B");
                System.out.println("The rename is: " + replaced);
            } } else {
            System.out.println("The original name is: " + name);
        }
    }
}
