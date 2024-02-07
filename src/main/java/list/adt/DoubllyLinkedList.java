package list.adt;

import list.Node.Node;
import list.Node.*;
public interface  DoubllyLinkedList {
    boolean isEmpty();
    int getSize();
    void add(int data);

    int remove(int data);
    Node search(int data);
    void print();

}
