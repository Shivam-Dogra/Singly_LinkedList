package Singly_LinkedList;

public class LinkedList {
    private int len;
    private Node head;
    private Node tail;

    //LL Node 
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    //LL constructor
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    //print LL
    public void printLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //Append
    public void append(int value){
        Node newNode = new Node(value);
        if(len == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        len++;
    } 

    //Remove last node
    public Node removeLastNode(){
        if(len==0){
           return null;
        }
        Node current = head;
        Node prev = head;
        while(current!=null){
            prev = current;
            current = current.next;
        }
        tail = prev;
        tail.next = null;
        len--;
        if(len==0){
            head = null;
            tail = null;
        }
        return current;
    }

    //prepend
    public void prepend(int value){
        Node newNode = new Node(value);
        if(len == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        len++;
    }

    //Remove first node
    public Node removeFirstNode(){
        if(len==0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        len--;
        if(len==0){
            tail = null;
        }
        return temp;
    }

    //Get
    public Node get(int index){
        if(index < 0 || index >= len) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Set
    public boolean set(int index, int value){
        Node current = get(index);
        if(current!=null){
            current.value = value;
            return true;
        }
        return false;
       
    }





    
}
