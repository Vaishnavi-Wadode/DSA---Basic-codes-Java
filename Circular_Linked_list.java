import java.util.*;
public class Circular_Linked_list {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    
    public void addfirst(int data){
        Node newnode = new Node(data);
        
        if(tail == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        tail.next = head;
        return;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        
        if(tail == null){
            head = tail = newnode;
            return;
        } 
        tail.next = newnode;
        tail = newnode;
        tail.next = head;

    }

}
