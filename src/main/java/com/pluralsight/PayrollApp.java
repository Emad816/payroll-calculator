package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName;
        System.out.printf("Please enter your name: ");
        userName = scanner.nextLine();

        double userHours;
        System.out.printf("Please enter your hours: ");
        userHours = scanner.nextDouble();

        double userPayRate;
        System.out.printf("Please enter your pay rate: ");
        userPayRate = scanner.nextDouble()

    }
}
