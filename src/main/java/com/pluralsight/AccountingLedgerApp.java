package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountingLedgerApp {
    //create scanner that can take user input
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean working = true;
        while (working) {


            String option = homeScreen();

            switch (option.toUpperCase()) {
                case "A":
                    System.out.println("In case A");
                    break;

                case "P":
                    System.out.println("In case P");
                    break;

                case "V":
                    System.out.println("In case V");
                    break;
                case "E":
                    System.out.println("In case E");
                    working = false;
                    break;

                default:
                    System.out.println("invalid selection");

            }
        }


    }
    public static String homeScreen(){
        //intro to user menu
        //What would you like to do
        //list options
        //
        System.out.println("Welcome to the main menu ");
        System.out.println("What would you like to do? ");
        System.out.println("""
               \tAdd Deposit(A)
               \tAdd Payment(P)
               \tView Receipts(V)
               \tExit menu(E)
                """);;
        // user makes selection
        return scanner.nextLine();

    }

}
