package Assignment_6;/*write a code with following requirements
- define an array with following values {90,34,23,87,45,36,98}
- Print the values that can be divided by 2 or 3*/
public class Homework29 {
    public static void main(String[] args) {
        int [] arr={90,34,23,87,45,36,98};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0 || arr[i]%3==0){
            }
            System.out.println(arr[i]+ " value can be divided by 2 or 3 ");
        }

    }
}
