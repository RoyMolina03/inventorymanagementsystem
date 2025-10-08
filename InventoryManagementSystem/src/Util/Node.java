package Util;
import Inventory.*;

public class Node {
    Object data = new Item();
    Node prev;
    Node next;

    public Node(Object data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
