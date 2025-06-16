package com.example.samir;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double amount = 0;
            System.out.print("Enter payment amount: $");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
            }
            scanner.nextLine();

            System.out.println("Select payment method:");
            System.out.println("1. PayPal");
            System.out.println("2. GPay");
            System.out.println("3. Credit Card");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            PaymentStrategy strategy = null;

            // We can use Factory Design Pattern for creating strategies
            switch (choice) {
                case 1:
                    System.out.print("Enter your PayPal email: ");
                    String email = scanner.nextLine();
                    strategy = new PaypalPayment(email);
                    break;
                case 2:
                    System.out.print("Enter your pin: ");
                    String pin = scanner.nextLine();
                    strategy = new GooglePayPayment(pin);
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your card number: ");
                    String card = scanner.nextLine();
                    System.out.print("Enter your CVV: ");
                    String cvv = scanner.nextLine();
                    System.out.print("Enter your expiry date (MM/YY): ");
                    String expiry = scanner.nextLine();
                    System.out.print("Enter your account type: ");
                    String cardType = scanner.nextLine();
                    System.out.print("Enter your Card Number: ");
                    String cardNumber = scanner.nextLine();


                    strategy = new CreditcardPayment(name, card, cvv, expiry,cardType);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting.");
                    return;
            }
            // Use context to process payment
            PaymentProcessor processor = new PaymentProcessor(strategy);
            processor.processPayment(amount);

            scanner.close();
        }
    }