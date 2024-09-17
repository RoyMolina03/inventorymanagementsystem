package Util;
import Inventory.*;
public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }


    //traversal methods
    public void traverseForward()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public void traverseBackward()
    {
        Node current = tail;
        while (current != null)
        {
            System.out.println(current.data + " ");
            current = current.prev;
        }
    }


    //insertion methods
    public void insertAtFront(Item data)
    {
        Node temp = new Node(data);
        if (head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void insertAtPoint(Item data, int point)
    {
        Node temp = new Node(data);
        if (point == 1)
        {
            insertAtFront(data);
        }
        else {
            Node current = head;
            int currPosition = 1;
            while (current != null && currPosition < point)
            {
                current = current.next;
                currPosition++;
            }
            if (current == null)
            {
                insertAtEnd(data);
            }
            else {
                temp.next = current;
                temp.prev = current.prev;
                current.prev.next = temp;
                current.prev = temp;
            }
        }
    }

    public void insertAtEnd(Item data)
    {
        Node temp = new Node(data);
        if (tail == null)
        {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }


    //deletion methods
    public void deleteAtFront()
    {
        if (head == null)
        {
            return;
        }

        if (head == tail)
        {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

    }

    public void delete(int point)
    {
        if (head == null)
        {
            return;
        }

        if (point == 1)
        {
            deleteAtFront();
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count != point)
        {
            current = current.next;
            count++;
        }

        if (current == null)
        {
            System.out.println("Incorrect Point.");
            return;
        }

        if (current == tail)
        {
            deleteAtEnd();
            return;
        }
    }

    public void deleteAtEnd()
    {
        if (tail == null)
        {
            return;
        }

        if (head == tail)
        {
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }


}
