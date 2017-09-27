/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class LinkedList implements Set
{
    Node head;  // head of list
    Node current; // Node being worked on
    Node previous; // Node previous to the current node
 
    /* Linked list Node Class*/
    class Node
    {
        int data;
        Node next;
        public Node()
        {
            next = null;
        }
        // Node Constructors
        public Node(int d)
        {
            data = d;
            next = null;
        }
        public Node (int x, Node p){
          data = x;
          next = p;
        }
        
        public int getData(){
        return data;
        }
        
        public Node getNext(){
            return next;
        }
        
        public void setData(int x){
            data = x;
        }
        public void setNext(Node newNext){
            next = newNext;
        }
        
               
    }
    
    
    @Override
    // Checks if the list is empty.
   public boolean isEmpty() {
       return null == head;
   }

   @Override
   // Makes the list empty.
   public void makeEmpty() {
       head = null;
   }
   
   // Finds the previous Node
   public Node findPrevious(int y) 
     {
        if (head == null)
        {
           return null;
        }
        if (head.data == y){
           return null;
        }
        Node p = head;
        while(p.next != null && p.next.data != y){
           p = p.next;
        }
            return p;
    }
   
   @Override
   // Adds an integer to the linked list recursively.
   public void add(int x) {
       //Node q = this.head;
       if (isEmpty()) {
         Node q = new Node(x);
        //q.data=x;
        q.next=head; 
        head=q;
        return;
    }
       addLast(x,head);
    }
    private void addLast(int x, Node q) {
    
    if (q.next == null)
    {
        if(q.data == x){
            return;
        }
        Node p = new Node(x,null);
        q.next=p;
        q=head;
        return;
    }
    else {
        addLast(x, q.next);
    }
   } 
    
   
    /* Function to get Union of 2 Linked Lists */
    @Override
   public void union(LinkedList other, LinkedList result) {
      
       Node otherNode = other.head;

       while (otherNode != null) {
           result.add(otherNode.data);
           otherNode = otherNode.next;
       }
       
        Node curr = this.head;
       while (curr != null) {
           if(!other.isMember(curr.data))
           {result.add(curr.data);}
       
           curr = curr.next;
       }
   }
   
   @Override
   // Recursive Method to get the intersection of two linked lists.
    public void intersection(LinkedList other, LinkedList result)
    {
        Node n1 = this.head;
        Node n2 = other.head;
       intersection(n2, result);
    }
    
    private void intersection (Node q, LinkedList temp)
    {
        if(q == null)
        {
            return;
        }
        if (this.isMember(q.data))
        {
            temp.add(q.data);
        }
        intersection(q.next , temp);
    }
    
    @Override
    // Method to find the different elements in two linked lists. 
    public void difference(LinkedList other, LinkedList result) {
       
       Node p = other.head;
       while (p != null)
       {
           result.add(p.data);
           p = p.next;
       }
       
       Node q = this.head;
       while (q != null)
       {
           if(result.isMember(q.data))
           {
               result.remove(q.data);
               q = q.next;
           }
           else
           {
               result.add(q.data);
               q = q.next;
           }
       }
    }
    
    @Override
    // Outputs each value of the linked list. 
    public String toString() {
           String result = "";
            Node current = head;
            //if (current == null) 
               // return "Empty Set.";
            while(current != null){
                result += current.data + ", ";
                current = current.next;
            }
            return "List: " + result+"\n";
        }
    
    @Override
    // Checks if the integer belongs to the linked list. 
    public boolean isMember(int data){
        return isMember(this.head, data);
    }
    private boolean isMember(Node q, int x){
        if (q==null) return false;
        if (q.data == x) return true;
        
        return isMember(q.next,x);
    }
    
    @Override
    // Method that removes a specific integere from the linked list. 
   public void remove (int y)
    {
        Node p = new Node();

        p = findPrevious(y);
            
        if (isEmpty()) {
            
            return;
        }
        if(p == null)
        {
            head = head.next;
            return;
        }
        if (p.next == null) 
            return;
        p.next = p.next.next;
    }
   @Override
   // Method that checks if two linked lists are equal.
    public boolean equals(Object a){
        LinkedList list1 = new LinkedList();
        if(a instanceof LinkedList){
            list1 = (LinkedList) a;
        }
        
        Node n1 = this.head;
        Node n2 = list1.head;
        if (n1 == null && n2 == null) {
            return true;
        }
        while (n1 != null && n2 != null)
        {
            if (n2.data != n1.data)
            {return false;}
            
            n1 = n1.next;
            n2 = n2.next;
        }
        
        return true;
    }
   
}

