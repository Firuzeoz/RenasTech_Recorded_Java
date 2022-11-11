package Assignment_6;/*Write   a   program   that   creates   an   array   of   10   elements   size.
 Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then
 display   the   sum   of   all
array   elements. ( we already did this in the class but try to do it again)*/
import java.util.Scanner;
public class Homework31 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double [] arr = new double[10];
        double sum=0;
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Please enter a number: ");
            arr[i]= scan.nextDouble();
            sum=sum+arr[i];
        } System.out.println("The sum is: "+sum);
    }}
