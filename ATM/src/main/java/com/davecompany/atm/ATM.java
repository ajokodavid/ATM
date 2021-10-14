/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davecompany.atm;

import java.util.Scanner;

/**
 *
 * @author user
 */
final class ATM {

    public static void main(String args[]) {
        int balance = 100000, withdraw, deposit;

        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n___Automated Teller Machine___");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            int choice = myScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn: ");
                    withdraw = myScanner.nextInt();

                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficent fund");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit = myScanner.nextInt();

                    if (balance > deposit || balance < deposit) {
                        balance += deposit;
                        System.out.println("Your money has been deposited successfully");
                    }
                    break;

                case 3:
                    System.out.println("Your balance is " + balance);
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }
}
