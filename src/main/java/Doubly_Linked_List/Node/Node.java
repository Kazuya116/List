package Doubly_Linked_List.Node;

public class Node {
    public int data;
    public Node nextnode;
   public  Node prevnode;


    public Node(int data){
        this.data= data;

    }
    public Node(int data, Node nextnode, Node prevnode){
        this.data = data ;
        this.nextnode= nextnode;
        this.prevnode = prevnode;
    }



}
