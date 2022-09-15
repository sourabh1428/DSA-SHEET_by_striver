import java.util.*;
import java.io.*;
import java.lang.*;

class node {
    int data;
    node previous;
    node next;
    node(int d) {
        data = d;
        previous = null;
        next = null;
    }
}

class DLL {

    public static void main(String args[]) {
        // creating nodes for the DLL
        node head = new node(10);
        node node1 = new node(20);
        node node2 = new node(30);

        // constructing the DLL
        head.next = node1;
        node1.previous = head;
        node1.next = node2;
        node2.previous = node1;
        System.out.println("Original Doubly Linked List");
        print_DLL(head);
        System.out.println("After deleting the Last node");
        head = delete_last(head);
        print_DLL(head); // utility function

    }

    static node delete_last(node head) {
        if (head == null) return null; //checks if the DLL is empty
        if (head.next == null) { //checks if the DLL contains a single element
            return null;
        } else {
            node current = head;
            while (current.next != null) { // iterates through the DLL
                current = current.next;
            }
            current.previous.next = null; //changes the next pointer of
            the neighboring node
            return head;
        }
    }

    public static void print_DLL(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }
}