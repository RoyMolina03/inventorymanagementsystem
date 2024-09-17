package Inventory;
import java.util.*;

public class Item {
    //private variables
    private String name; //one word with no whitespace
    private int sku; //int that ranges between 0 < n < 1000
    private int quantity; //quantity that ranges between 0 < n < 10,000
    private int price; //non-negative price

    //constructors
    public Item()
    {
        this.name = null;
        this.sku = 0;
        this.quantity = 0;
        this.price = 0;
    }

    public Item(String words, int code, int amount, int cost)
    {
        this.name = words;
        this.sku = code;
        this.quantity = amount;
        this.price = cost;
    }

}
