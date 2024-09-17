package Util;
import Inventory.*;

public class Node {
    Item data = new Item();
    Node prev;
    Node next;

    public Node(Item data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
