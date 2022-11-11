package Assignment_6;/*Write code where it shifts all the elements in array by one index
and put the first index at the end of the array
example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}*/
import java.util.Arrays;
public class Homework34 {
    public static void main(String[] args) {
      int [] arr1 ={2,3,4,5,6,7,8,9};
      int [] arr2= new int[arr1.length];
      arr2[arr1.length-1]=arr1[0];
      int j=0;
        for (int i = 1; i <arr1.length ; i++) {
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println("The original array is: "+ Arrays.toString(arr1));
        System.out.println("The new array is: "+ Arrays.toString(arr2));
    }
}
