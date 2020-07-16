package com.javacoding;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("BitsAI","2003457891");
        bankAccount.showMenu();

    }
}

class BankAccount {
    String customerName;
    String customerId;
    int balance;
    int previousTransaction;

    BankAccount(String cName,String cID){
        this.customerName = cName;
        this.customerId = cID;
    }

    void deposit(int amount){
        if (amount !=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount !=0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited: "+ previousTransaction);
        } else if (previousTransaction < 0){
            System.out.println("Withdrawn:" + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void showMenu(){

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" + customerName);
        System.out.println("Your Customer ID is: " + customerId );
        System.out.println("\n");
        System.out.println("A. Balance Enquiry");
        System.out.println("B. Amount Deposit");
        System.out.println("C. Amount Withdrawl");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("*******************************************");
            System.out.println("Enter an option");
            System.out.println("********************************************");
            option = scanner.next().charAt(0);

            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("*************************************");
                    System.out.println("Your Account Balance is "+balance);
                    System.out.println("*************************************");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("*************************************");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("*************************************");
                    System.out.println("\n");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("*************************************");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("*************************************");
                    System.out.println("\n");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("*************************************");
                    getPreviousTransaction();
                    System.out.println("*************************************");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("*************************************");
                    break;
                default:
                    System.out.println("*************************************");
                    System.out.println("Invalid Option : Please try again");
                    System.out.println("Please try any of the below options :");
                    System.out.println("\n");
                    System.out.println("A  or B or C or D and E for Exit :");
                    System.out.println("*************************************");
                    break;
            }
        }
        while(option !='E');
        System.out.println("Thank you for using our services, Stay safe");

    }

}