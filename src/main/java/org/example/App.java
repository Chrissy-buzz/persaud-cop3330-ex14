package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App {

    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static double calcTax (double amount)
    {
        return amount*0.055;
    }
    public static double total (double amount, double tax)
    {
        return amount+tax;
    }
    public static void main(String[] args) {

        double tax= 0; //initialize tax to 0

        Scanner scan1 = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amount = scan1.nextDouble();

        Scanner input = new Scanner(System.in);
        System.out.print("What is the state? ");
        String ans = input.nextLine();

        //WI resident
        if (ans.equals("WI") || ans.equals("Wi") || ans.equals("wI") || ans.equals("wi") || ans.equals("Wisconsin") || ans.equals("wisconsin") || ans.equals("WISCONSIN")) {
            System.out.print("The subtotal is: $" + df2.format(amount) +".\n");
            tax= calcTax(amount); //add in tax only when WI
            System.out.print("The tax is: $" + df2.format(tax)+".\n");
        }
        double total= total(amount, tax);
        System.out.print("The total is: $" + df2.format(total)+".\n");    }
}