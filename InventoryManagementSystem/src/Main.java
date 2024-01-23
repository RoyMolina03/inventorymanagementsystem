/**
 * Created by Roy Molina on 01-16-24
 *
 * Inventory Management System
 *    - Allows users to add, remove, and check on products at will
 *    - Input validation to not allow mis-inputs
 *    - Object-Oriented Parallel arrayLists
 *
 *
 *                      LEGEND
 *    GREEN - no immediate need, purely for optimization / user interaction experience
 *    YELLOW - needs fixing when possible - program works but have the potential to mess up for user
 *    RED - needs fixing NOW - program will not work without it
 *
 * Latest Version : v1.0 (01-21-24)
 */

import java.util.*;

public class Main {

    //static objects for use in all methods
    public static Inventory Company = new Inventory();
    public static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {

        //int for menu choice
        int choice;

        //menu loop - loop terminates once user decides to input the kill code
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
                    Company.printProduct(); //runs the Inventory Class print method, displaying all stock
                case 0:
                    System.out.println("Thanks for using IMS"); // farewell message
                    break;
                default:
                    System.out.println("That isn't an option. Please try again.");

            }

        }while (choice != 0);
    }

    public static void addStock() {

        // object and variable declaration
        String code;
        int amount;
        char exit;

        //loop to allow the user to input until they're satisfied
        do {
            System.out.print("Input the product followed by it's amount.");

            System.out.print("\nProduct: ");
            code = user.next();
            code.toLowerCase(); // convert letters to lowercase for ASCII value
            System.out.print("\nAmount: ");
            amount = user.nextInt();

            Company.addProduct(code, amount);


            //give user the option to stop input
            do {
                System.out.println("Input another product? Y / N");
                exit = user.next().charAt(0);
                Character.toLowerCase(exit); // convert to lowercase to simply while statement
            }while (exit != 'y' && exit != 'n');

        }while (Character.compare(exit, 'n') != 0);

        System.out.println("Successfully Inputted: ");
        Company.printProduct();
    }


    public static void removeStock() {

        //variable for user input
        int index, choice;

        //print the current inventory stock alongside numbers for the user to select from
        Company.printProduct();

        System.out.println("Please input the number of which product you'd like to modify: ");

        // allow the user to select which product they're erasing
        index = user.nextInt();
        //subtract 1 to match the actual index of where the product is in the array
        index -= 1;

        /**
         * YELLOW
         * Input validation either here in in the object's method
         * User can currently input an invalid number and throw an exception for out of range
         * 01-23-24
         */

        //input validation for choice of what user would like to do with selected product
        do {
            System.out.println("Select your intent: ");
            System.out.println("1. Remove Product \n2. Remove Quantity");
            choice = user.nextInt();

            if (choice != 1 && choice != 2)
            {
                System.out.println("Not a valid option, try again");
            }
        }while (choice != 1 && choice != 2);

        switch (choice)
        {
            case 1:
                Company.removeProduct(index);
                break;
            case 2:
                Company.changeStock(index);
            default:
                System.out.println("Not a valid option, try again");
        }

        System.out.println("Updated Stock List: ");
        Company.printProduct();
    }

}