/**
 * Created by Roy Molina on 01-16-24
 *
 * Inventory Management System
 *    - Stores name, SKU, quantity, and price of every product
 *    - Allows users to add, remove, and print list of products at will
 *    - Input validation to store correct values
 *    - Object-Oriented Approach with Inventory Class and simplified Main Method
 *
 * Latest Version : v1.2 (03-02-24)
 */

import java.util.*;

public class Main {

    //static objects for use in all methods
    public static Scanner user = new Scanner(System.in);
    public static ArrayList<Inventory> productList = new ArrayList<>();

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

        //loop to allow the user to input until they're satisfied
        do {
            System.out.print("Enter Product Name: ");
            name = user.next();

            System.out.print("Enter Product SKU: ");
            id = user.nextInt();
            id = idCheck(id);

            System.out.print("Enter Product Quantity: ");
            amount = user.nextInt();
            amount = amountCheck(amount);

            System.out.print("Enter Product Price: ");
            cost = user.nextInt();
            cost = costCheck(cost);

            //input into arraylist of products
            productList.add(new Inventory(name, id, amount, cost));

            //give user the option to stop input
            do {
                System.out.println("Input another product? Y / N");
                exit = user.next().charAt(0);
                Character.toLowerCase(exit); // convert to lowercase to simplify while statement
            }while (exit != 'y' && exit != 'n');

        }while (Character.compare(exit, 'n') != 0);

    }

    //remove product from the arrayList
    public static void removeStock() {

        //variable declaration
        int choice;
        int i = 0;
        int target = 0;

        //print product list for user to select which sku
        printStock();
        System.out.println("Please input the SKU of the product you'd like to remove: ");
        choice = user.nextInt();

        for (Inventory c: productList)
        {
            int id = c.getSku();
            if (choice == id)
            {
                target = i;
            }
            i++;
        }

        productList.remove(target);
    }

    //print stock of all items in the ArrayList
    public static void printStock() {

        //variable declaration
        int i = 1;

        //loop to step through arrayList
        for (Inventory c: productList)
        {
            System.out.println("\n" + i + ". ");
            c.printProduct();
            i++;
        }
    }

    //sku check
    public static int idCheck(int id)
    {
        if ( (id < 1 ) || (id > 999) )
        {
            do {
                System.out.print("SKU cannot be less than 1 or greater than 999. Please re-enter SKU: ");
                id = user.nextInt();
            }while ( (id < 1 ) || (id > 1000) );
        }

        return id;
    }

    //quantity check
    public static int amountCheck(int amount)
    {
        if ( (amount < 1) || (amount > 99999) )
        {
            do {
                System.out.print("Quantity cannot be less than 1 or greater than 99,999. Please re-enter Quantity: ");
                amount = user.nextInt();
            }while ( (amount < 1) || (amount > 99999) );
        }

        return amount;
    }

    //price check
    public static int costCheck(int cost)
    {
        if (cost < 1)
        {
            do {
                System.out.print("Price cannot be negative or 0. Please re-enter Price: ");
                cost = user.nextInt();
            }while (cost < 1);
        }

        return cost;
    }

}