/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String temp1 = scanner.nextLine();
        int item_1 = Integer.parseInt(temp1);

        System.out.print("Enter the quantity of item 1: ");
        String temp1_1 = scanner.nextLine();
        int q_1 = Integer.parseInt(temp1_1);

        System.out.print("Enter the price of item 2: ");
        String temp2 = scanner.nextLine();
        int item_2 = Integer.parseInt(temp2);
        System.out.print("Enter the quantity of item 2: ");
        String temp2_1 = scanner.nextLine();
        int q_2 = Integer.parseInt(temp2_1);

        System.out.print("Enter the price of item 3: ");
        String temp3 = scanner.nextLine();
        int item_3 = Integer.parseInt(temp3);

        System.out.print("Enter the quantity of item 3: ");
        String temp3_1 = scanner.nextLine();
        int q_3 = Integer.parseInt(temp3_1);

        // 25,2 10,1 4,1
        final float subtotal = (item_1 * q_1) + (item_2 * q_2) + (item_3 * q_3);
        final float tax = (float) 0.055 * subtotal;
        final float total = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal) + "\nTax: $" + tax +
                "\nTotal: $" + total);
    }
}