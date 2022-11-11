package Assignment_3;

import java.util.Scanner;

public class Task3_hw11 {
    /*Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product.
     Then Calculate the revenue based on giving information (hint: Revenue = quantity x price) */

    public static void main(String[] args) {
        Scanner scan2=new Scanner(System.in);

        System.out.println("Please enter the quantity of the sold products: ");
        int Psold=scan2.nextInt();
        System.out.println("Please enter the price of the each product: ");
        double Pprice=scan2.nextDouble();
        double revenue= Psold*Pprice;
        System.out.println("The revenue is : $"+revenue);

    }
}
