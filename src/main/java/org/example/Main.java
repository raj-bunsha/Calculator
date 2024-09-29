package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//new modification
public class Main {

//    private static final Logger logger = LogManager.getLogger(Main.class);
    // Method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }
    public static double naturalLogarithm(double num) {
        return Math.log(num);
    }
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power (x^y)");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Square root
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    if (num >= 0) {
                        System.out.println("Square root of " + num + " is: " + squareRoot(num));
                    } else {
                        System.out.println("Square root of negative number is not defined.");
                    }
                    break;

                case 2: // Factorial
                    System.out.print("Enter an integer: ");
                    int n = scanner.nextInt();
                    if (n >= 0) {
                        System.out.println("Factorial of " + n + " is: " + factorial(n));
                    } else {
                        System.out.println("Factorial of negative number is not defined.");
                    }
                    break;

                case 3: // Natural logarithm
                    System.out.print("Enter a number: ");
                    double x = scanner.nextDouble();
                    if (x > 0) {
                        System.out.println("Natural logarithm of " + x + " is: " + naturalLogarithm(x));
                    } else {
                        System.out.println("Natural logarithm is not defined for non-positive numbers.");
                    }
                    break;

                case 4: // Power
                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (y): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));
                    break;

                case 5: // Exit
                    System.out.println("Exiting the calculator.");
                    continueCalculation = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
        scanner.close();
    }
}
