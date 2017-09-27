/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class LinkedListQueue {
    
    private Node front;
    private Node rear;
    public int size;
    
    public LinkedListQueue(){
        front = null;
        // could be rear = null;
    }
    
    public void makeEmpty(){
        front = null;
    }
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public int getSize(){
        return size;
    }
       
    public void enqueue(int x){
        Node q = new Node(x);
        
        if (isEmpty()){
            front = q;
            size++;
        }
        else{
            rear.next = q;
            rear = q;
            size++;
        }
        
    }
    
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int x = front.data;
        front = front.next;
        return x;
    }
    
}
