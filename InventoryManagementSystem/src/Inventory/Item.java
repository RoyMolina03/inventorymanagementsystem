package Inventory;
import java.util.*;

public class Item {
    //private variables
    private String name; //one word with no whitespace
    private int sku; //int that ranges between 0 < n < 1000
    private int quantity; //quantity that ranges between 0 < n < 10,000
    private int price; //non-negative price

    private Verify test; //object to check our inputs and run it through the Verify class

    //constructors
    public Item()
    {
        this.name = null;
        this.sku = 0;
        this.quantity = 0;
        this.price = 0;
    }

    public Item(String words, int id, int amount, int cost)
    {
        words = test.checkWords(words);
        this.name = words;

        id = test.checkID(id);
        this.sku = id;

        amount = test.checkAmount(amount);
        this.quantity = amount;

        cost = test.checkPrice(cost);
        this.price = cost;
    }

    //setter methods
    public void setName(String words)
    {
        words = test.checkWords(words); //run through verification
        this.name = words;
    }

    public void setSku(int id)
    {
        id = test.checkID(id); //run through verification
        this.sku =  id;
    }

    public void setQuantity(int amount)
    {
        amount = test.checkAmount(amount); //run through verification
        this.quantity = amount;
    }

    public void setPrice(int cost)
    {
        cost = test.checkPrice(cost); //run through verification
        this.price = cost;
    }

    //getter methods
    public String getName()
    {
        return name;
    }

    public int getSku()
    {
        return sku;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public int getPrice()
    {
        return price;
    }

    //print method
    public void printProduct() {

        System.out.print("Product Name: " + name
                + "\nProduct SKU: " + sku
                + "\nProduct Quantity: " + quantity
                + "\nProduct Price: $" + price);

    }
}
