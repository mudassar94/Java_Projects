/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class TestClass {
    
    public static void main (String[] args)
    {
        Node node4 = new Node (69, null);
        Node node3 = new Node (25, node4);
        Node node2 = new Node (7, node3);
        Node node1 = new Node(3, node2);
        
        // printRev(node1);
        
        // DectoBin(1);
        
        /* Stack stack = new Stack(5);
        stack.push1(1);
        System.out.println(stack.peek());
        stack.push1(2);
        System.out.println(stack.peek());
        stack.push1(3);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.push1(4);
        System.out.println(stack.peek());
        stack.push1(5);
        System.out.println(stack.peek());
        stack.push1(6);
        System.out.println(stack.peek());
        stack.push1(7); 
        System.out.println(stack.peek());
        stack.makeEmpty();
        System.out.println(stack.peek()); */
        
        /* LinkedListStack llstack = new LinkedListStack();
        llstack.push(1);
        System.out.println("Element is: "+ llstack.peek());
        llstack.push(2);
        System.out.println("Element is: "+ llstack.peek());
        llstack.push(3);
        System.out.println("Element is: "+ llstack.peek());
        llstack.pop();
        System.out.println("Element is: "+ llstack.peek());
        llstack.push(4);
        System.out.println("Element is: "+ llstack.peek());
        llstack.pop();
        System.out.println("Size is: " + llstack.getSize()); */
        
        // System.out.println((3%20));
        
        ArrayQueue q1 = new ArrayQueue();
        q1.enque(1);
        q1.enque(2);
        q1.deque();
        q1.enque(3);
        //q1.enque(4);
        
        System.out.println(q1.toString());
        
        
        
        
        
    }
    
    private static int printRev(Node n)
    {
        if(n != null)
        {
            System.out.println(printRev(n.next)+","+n.data);
            
        }
        return 0;
    }
    
    public static void DectoBin(int x)
    {
        
        if (x>0)
        {
            DectoBin(x/2);
            System.out.println(x%2);
        }
        
    }
    
    
}
