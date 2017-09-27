/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class Node {
    int data;
    Node next;
    Node head;
    public Node()
    {
        data = 0;
        next = null;
    }
    public Node(int data)
    {
        this.data = data;
        next = null; 
    }
    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    
    
    
    
}
