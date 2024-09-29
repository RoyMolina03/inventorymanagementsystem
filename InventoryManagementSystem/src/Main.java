/**
 * Created by Roy Molina on 01-16-24
 *
 * Inventory.Inventory Management System
 *    - Stores name, SKU, quantity, and price of every product
 *    - Allows users to add, remove, and print list of products at will
 *    - Input validation to store correct values
 *    - Object-Oriented Approach with Inventory.Inventory Class and simplified Main Method
 *
 * Latest Version : v2.0 (09-??-24)
 */

import Inventory.*;
import Util.*;
import java.util.*;

public class Main {

    //static objects for use in all methods
    public static Scanner user = new Scanner(System.in);
    public static Inventory stock = new Inventory();

    public static void main(String[] args) {

        //int for menu choice
        int choice;

        //menu loop - loop terminates once user decides to input the kill command
        do {
            System.out.println("Welcome to IMS (Inventory Management System)! Please input the number corresponding with the menu choice you'd like to select.");
            System.out.println("1. Input Inventory");
            System.out.println("2. Remove inventory");
            System.out.println("3. Check Inventory");
            System.out.println("0. Quit Program");

            choice = user.nextInt();

            //switch menu to loop options until user selects to terminate the program
            switch (choice) {

                case 1:
                    addStock();
                    break;
                case 2:
                    removeStock();
                    break;
                case 3:
                    printStock();
                case 0:
                    System.out.println("Thanks for using IMS"); // farewell message
                    break;
                default:
                    System.out.println("That isn't an option. Please try again.");

            }

        }while (choice != 0);
    }

    //add product to the arrayList
    public static void addStock() {

        //variable declaration
        String name;
        int id;
        int amount;
        int cost;
        char exit;

        //rework

    }

    //remove product from the arrayList
    public static void removeStock() {

        //rework
    }

    //print stock of all items in the ArrayList
    public static void printStock() {

        //rework
    }

}