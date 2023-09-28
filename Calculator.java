/*
 * Write a program to Menu driven program using switch statement
 *  ( Find addition, subtraction, multiplication and division of to integer numbers )
 */

package com.anudip.test;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display the menu
        while(true) {
        System.out.println("Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        // Get the user's choice
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        // Use a switch statement to perform the mentioned task
        
        switch (ch) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
        }
    }
   }

    private static void add() {
        Scanner sc = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);
    }

    private static void subtract() {
        Scanner sc = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calculate the difference
        int diff = num1 - num2;

        // Display the result
        System.out.println("The difference is: " + diff);
    }

    private static void multiply() {
        Scanner sc = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calculate the product
        int pro = num1 * num2;

        // Display the result
        System.out.println("The product is: " + pro);
    }

    private static void divide() {
        Scanner sc = new Scanner(System.in);

        // Get the two numbers from the user
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Calculate the quotient
        int q = num1 / num2;

        // Display the result
        System.out.println("The quotient is: " + q);
    }
}
