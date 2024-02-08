package Doubly_Linked_List.adt;

import Doubly_Linked_List.Node.Node;

public interface  DoubllyLinkedList {
    boolean isEmpty();
    int getSize();
    void add(int data);

    int remove(int data);
    Node search(int data);
    void print();

}
