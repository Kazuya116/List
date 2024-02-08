package Circular;
import Doubly_Linked_List.Node.*;
import Doubly_Linked_List.List.IntegerLinkedList;

public class IntegerCicularList extends IntegerLinkedList {
            public void makeCircular() {
                if (head != null) {
                    tail.nextnode = head;
                    head.prevnode = tail;
                }
            }

                @Override
                public void addFirst(int data){
                    super.addFirst(data);
                    makeCircular();
                }

                @Override
                public void add(int data){
                    super.add(data);
                    makeCircular();
                }
                @Override

                public int remove(int data){
                    int value = super.remove(data);
                    return value ;
                }

                public void print(){
                    Node current = head ;
                    if(current != null){
                        do{
                            System.out.print(current.data + "<<-->>");
                            current = current.nextnode;
                        } while(current != head );
                        System.out.print("NULL");
                    }
                }

                public Node search(int data){
                    Node current = head;
                    if(current != null){
                        do{
                            if(current.data  == data) return current;
                            current = current.nextnode;
                        }while(current != head);
                    }
                    return current;
                }
            }





