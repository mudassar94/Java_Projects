/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class ArrayQueue {
    public int[] arr;
    public int size;
    public int front, rear;
    
    
    public ArrayQueue(){
        arr = new int [3];
        
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enque(int x){
        if(isFull())
        {DoubleArray();}
        
        
        rear = (rear+1)%arr.length;
        arr[rear] = x;
        size++;
    }
    
    public int[] DoubleArray(){
        int x = arr.length;
        int[] arr1 = new int[x*2];
        
        for(int i=0; i<arr.length; i++){
            arr1[i] = arr[i];
        }
        
        return arr1;
        
    }
    
    public int deque(){
        if(isEmpty()){
            return -1;
        }
        int x = arr[front];
        front = (front+1)%arr.length;
        size--;
        return x;
    }
    
    public boolean isFull(){
        return size == arr.length;
    }
            
            
    public void makeEmpty(){
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<=size; i++){
            s += arr[i] + ",";
        }
        return s;
    }
}
