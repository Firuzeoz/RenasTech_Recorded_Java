package Assignment_6;/*//Write   a     program   to   with following requirements
1) user should be prompted about how many numbers is going to be entered
2) User should be prompted for the values of the numbers
3) Reverse the all the given numbers and print it*/
import java.util.Arrays;
import java.util.Scanner;
public class Homework32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the array size would you like to create: ");
        int [] arr1 = new int[scan.nextInt()];
        int [] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Please enter an integer number for your array: ");
            arr1[i]= scan.nextInt();
        }int j=0;
        for (int i = arr1.length-1; i >=0 ; i--) {
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println("Reversed array of your original array is : "+ Arrays.toString(arr2));
    }
}
