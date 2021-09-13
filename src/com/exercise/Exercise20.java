/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise20 {
    public static void main(String[] args) {
        double tax;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.printf("What is the order amount? ");
        float order = scan.nextFloat();
        System.out.printf("What state do you live in? ");
        String state = input.nextLine();
        if (state.equalsIgnoreCase("Wisconsin")){
            tax = 0.05;
            System.out.printf("What county do you live in? ");
            String county = input.nextLine();
            if(county.equalsIgnoreCase("Eau Claire")){
                tax = tax + 0.005;
            }
            else if(county.equalsIgnoreCase("Dunn")){
                tax = tax + 0.004;
            }
        }
        else if (state.equalsIgnoreCase("Illinois")) {
            tax = 0.08;
            }
        else {
            tax = 0;
        }
        if (state.equalsIgnoreCase("Wisconsin")){
            System.out.printf("The tax is $%.2f.\n", tax * order);
            System.out.printf("The total is $%.2f.\n", order + (order * tax));
        }
        else if (state.equalsIgnoreCase("Eau Claire")){
            System.out.printf("The tax is $%.2f.\n", tax * order);
            System.out.printf("The total is $%.2f.\n", order + (order * tax));
        } else System.out.printf("The total is $%.2f.\n", order + (order * tax));

    }
}