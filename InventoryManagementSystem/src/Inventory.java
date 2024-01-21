import java.util.*;

public class Inventory {
    /**
     *    YELLOW
     *    Get some exception handlers in here
     *    lets make the program display an error message instead of terminating
     *    01-17-24
     */


    //private data members as Arrays so users can control their size
    private ArrayList<String> productCode = new ArrayList<>();
    private ArrayList<Integer> productQuantity = new ArrayList<>();


    //lets user create a product and input an amount
    public void addProduct(String code, int amount) {
        productCode.add(code);
        productQuantity.add(amount);
    }


    //allows users to remove a product, and it's associated quantity
    public void removeProduct(int index) {

        productCode.remove(index);
        productQuantity.remove(index);
    }

    public void printProduct() {
        //loop steps through the parallel arrayLists and prints them along with an index number for easy user reference
        for (int i = 0; i < productCode.size(); i++)
        {
            System.out.println("\n" + (i + 1) + ". " + productCode.get(i) + "\t\t" + productQuantity.get(i) + "\n");
        }

    }
}
