/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class Stack {
    private int size;
    private int top;
    private int[] arr;
    
    public Stack(int size)
    {
        arr = new int[size];
        top = -1;
    }
    
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    public void makeEmpty()
    {
        top = -1;
    }
    
    public void push(int x){
        //if(top == arr.length-1){
            // call doubleArray() method
        //}
        arr[++ top] = x;
    }
    
    public void push1(int x){
        if (!this.isEmpty()){
            arr[top++] = x;
            //top ++;
        }
        else{
            System.out.println("Stack OverFlow! :)");
        }
            
    }
    
    public int pop(){
        if (top > arr.length){
            System.out.println("Empty List!");
        }
        int temp = arr[top];
            top--;
            return temp;
    }
    
    public int peek(){
        if(top > -1){
            return arr[top];
        }
        else{
            return -25;
        }
            
        
        
    }
    
    
}
