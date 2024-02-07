package list.List;

import list.Node.Node;
import list.adt.DoubllyLinkedList;

public class IntegerLinkedList implements DoubllyLinkedList {
    private Node head;
    private int size;
    private final Node tail;

    public IntegerLinkedList() {
        this.head = null;
        this.size = 0;
        this.tail = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(int data) {
        this.head = new Node(data, this.head, null);
        size++;
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
            size++;
        }
    }

    public int removeFirst() {
        Node currentNode = this.head;
        if (this.head != null) {
            this.head = this.head.nextnode;
            this.head.prevnode = null;
        }
        if (currentNode != null) {
            size--;
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
        size--;
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

}
