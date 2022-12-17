package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int quantity;
        double coupon;
        Scanner quantityInput, couponInput;
        computeBills sale = new computeBills();
        
        System.out.println("The price per book is £14.99\nIncluding tax it is £" + sale.computeBill());
        quantityInput = new Scanner(System.in);
        System.out.println("How many books would you like?\nPlease enter a number >>");
        quantity = quantityInput.nextInt();
        System.out.println("The price for your desired quantity including tax is £" + sale.computeBill(quantity));
        couponInput = new Scanner(System.in);
        System.out.println("How much is your coupon worth?\nPlease enter a number >>");
        coupon = couponInput.nextDouble();
        System.out.println("The total price for " + quantity + " books and your coupon discount is £" + sale.computeBill(quantity, coupon));



    }
}