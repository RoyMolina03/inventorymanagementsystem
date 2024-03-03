import java.util.*;

public class Inventory {

    //private variable declarations
    private String name; //one word with no whitespace
    private int sku; //int that ranges between 0 < n < 1000
    private int quantity; //quantity that ranges between 0 < n < 10,000
    private int price; //non-negative price

    //default constructor
    public Inventory(String usrName, int id, int amount, int cost){
        this.name = usrName;
        this.sku = id;
        this.quantity = amount;
        this.price = cost;
    }

    //setter methods
    public void setName(String usrName)
    {
        this.name = usrName;
    }

    public void setSku(int id)
    {
        this.sku =  id;
    }

    public void setQuantity(int amount)
    {
        this.quantity = amount;
    }

    public void setPrice(int cost)
    {
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
