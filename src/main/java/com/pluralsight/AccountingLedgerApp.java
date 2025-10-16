package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountingLedgerApp {
    //create scanner that can take user input
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


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




    }
}
