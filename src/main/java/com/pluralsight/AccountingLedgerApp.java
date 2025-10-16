package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
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
                    System.out.println("What is the vendor?");
                    String vendor = scanner.nextLine();
                    System.out.println("What is the item description?");
                    String description = scanner.nextLine();
                    System.out.println("How much are you paying?");
                    double amout = scanner.nextDouble();

                    //the will eat the next like to avoid problems
                    scanner.nextLine();

                    // creating receipt from user input
                    Receipts newDeposit = new Receipts(LocalDate.now(),LocalTime.now(),description,vendor,amout);

                    try{
                        BufferedWriter receiptsCsv = new BufferedWriter(new FileWriter("src/main/resources/receipts.csv",true));
                        //add new line to csv file
                        receiptsCsv.newLine();
                        receiptsCsv.write(newDeposit.getDate()+"|"+newDeposit.getTime()+"|"+newDeposit.getDescription()+"|"+newDeposit.getVendor()+"|"+newDeposit.getAmount());
                        System.out.println("Thank you for making a deposit");
                        receiptsCsv.close();

                    }catch (IOException e){
                        System.out.println("could not complete action"+e);
                    }

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
