/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class LinkedListStack {
    private int top;
    private int size;
    Node head;
    public LinkedListStack(){
        top = -1;
    }
    
    public int getSize(){
        return size;
    }
    
    public void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        
        top++;
        size++;
    }
    
    public int pop(){
        if(this != null){
            int x = head.data;
            head = head.next;
            size--;
            return x;
            
        }
        else{
            System.out.println("Stack Underflow!");
            return -1;
        }
        
    }
    
    public int peek(){
        return head.data;
    }
    
    public void makeEmpty(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
}
