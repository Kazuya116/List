import Doubly_Linked_List.List.IntegerLinkedList;

public class Main {
    public static void main(String[] args) {
        var d = new IntegerLinkedList();
        d.addFirst(100);
        d.add(200);
        d.addFirst(300);
//        d.print();
        d.Reverse();
        d.print();
    }
}
