package Inventory;
import Util.*;
import java.util.*;

public class Inventory {

    DoublyLinkedList stock = new DoublyLinkedList(); //declaration of linked list for items

    //constructors
    public Inventory(Item data)//takes the first Item added by user and starts off our DoublyLinkedList
    {
        stock.insertAtFront(data);
    }



    
}
