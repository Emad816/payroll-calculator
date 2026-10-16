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
        userPayRate = scanner.nextDouble();
// ///////////add an overtime calculation
        double overTime;
        overTime = (userHours - 40) * (userPayRate * 1.5);

        double grossPay;
        grossPay = userHours * userPayRate;
// /////////added an if statment to check if the employee worked overtime
        if (userHours > 40) {
            grossPay = 40 * userPayRate;
            grossPay = grossPay + overTime;
        }

        System.out.printf("\nEmployee %s Gross Pay %.2f ",userName ,grossPay);

    }

}
