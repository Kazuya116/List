package Doubly_Linked_List.List;

import Doubly_Linked_List.Node.Node;
import Doubly_Linked_List.adt.DoubllyLinkedList;



public class IntegerLinkedList implements DoubllyLinkedList {
    public Node head;
    //    public int size;
    public Node tail;

    public IntegerLinkedList() {
        this.head = null;
//        this.size = 0;
        this.tail = null;
    }

    public boolean isEmpty() {
        return Node.size == 0;
    }

    public int getSize() {
        return Node.size;
    }

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            head.prevnode = newnode;
            newnode.nextnode = head;
        }
        head = newnode;
    }

    public void add(int data) {
        if (this.isEmpty()) {
            this.addFirst(data);
        } else {
            Node newnode = new Node(data);
            Node current = this.head;
            while (current.nextnode != null) current = current.nextnode;
            current.nextnode = newnode;
            newnode.prevnode = current;
            data++;
        }
    }

    public int removeFirst() {
        Node currentNode = this.head;
        if (this.head != null) {
            this.head = this.head.nextnode;
            this.head.prevnode = null;
        }
        if (currentNode != null) {
            Node.size--;
            return currentNode.data;
        } else return Integer.MIN_VALUE;
    }

    public Node search(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) return currentNode;
            currentNode = currentNode.nextnode;
        }
        return null;
    }

    public int remove(int data) {
        if (isEmpty()) return Integer.MIN_VALUE;
        if (head.data == data) {
            return removeFirst();
        }
        Node currentnode = head;
//        Node previousnode = null;
        while (currentnode != null && currentnode.data != data) {
            currentnode = currentnode.nextnode;
        }
        if (currentnode == null) {
            return Integer.MIN_VALUE;
        }
        currentnode.prevnode.nextnode = currentnode.nextnode;
        if (currentnode.nextnode != null) {
            currentnode.nextnode.prevnode = currentnode.prevnode;
        }
        Node.size--;
        return currentnode.data;

    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.print("[");
        Node currentnode = this.head;
        while (currentnode != null) {
            System.out.print(currentnode.data);
            if (currentnode.nextnode != null) {
                System.out.print("=>");
            }
            currentnode = currentnode.nextnode;
        }
        System.out.println("]");

    }

    public void reverse() {
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.nextnode;
            current.nextnode = previous;
            current.prevnode = next;
            previous = current;
            current = next;
        }
        head = previous;
    }
}
