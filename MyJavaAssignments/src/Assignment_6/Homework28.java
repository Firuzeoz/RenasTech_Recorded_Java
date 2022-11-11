package Assignment_6;

import java.util.Arrays;

/*Write a code with following requirements:
- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
- Print the minimum number in the given array */
public class Homework28 {
    public static void main(String[] args) {

        int [] arr= {6,7,2,3,90,-2,-90,-122,96,35};

        Arrays.sort(arr);
        System.out.println("arr = " + arr[0]);

    }
}
