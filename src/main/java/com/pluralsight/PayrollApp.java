package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name please: ");
        String name = scanner.nextLine();

        System.out.print("Enter how many hours you worked: ");
        float hours = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter you pay rate: ");
        float payRate = scanner.nextFloat();
        scanner.nextLine();

        double grossPay =  payRate * hours;

        System.out.println(name + " your gross pay is " + grossPay);

    }
}
