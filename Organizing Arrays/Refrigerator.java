/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Mudassar
 */
public class Refrigerator {
    HashMap<Integer,List<Integer>> refrigerator = null;
   static int MaxItem = 0;
   public Refrigerator(int N, int total) {  // refrigrator object created
  
       MaxItem = total;
       refrigerator = new HashMap<Integer, List<Integer>>(total); // to keep trak of two arrays
      
       for(int i=1;i<=total;++i){
          
           Integer [] arr = new Integer[N];  // Array of objects created.
           ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr)); // ArrayList for both Arrays
           Collections.fill(list, 0);
           refrigerator.put(i,list );  // adding the values to the refrigrator
           list.clear();  // clears the array
          
       }
   }
  
   // method to check whether the refrigrator is empty
   public boolean is_empty(int i) {  
      
       boolean flag = false;
      
           List<Integer> l = refrigerator.get(i);
           for(int j=0;j<l.size();++j)  // checks the list from each item i and then returns whether it is empty.
           {
               if(l.get(j)!=0)
                   return flag;
              
          
       }
       return !flag;
   }
   
   // method to add item to the array of objects 
   public boolean insert_item(int item, int N) {
       
       List<Integer> l = refrigerator.get(N); // list of refrigrators is created
 
       if(l.size()!=MaxItem)   {
          
           l.add(item);
           refrigerator.put(N, l);
           return true;
       }

       refrigerator.put(N, l);
           return false;
      
      
      
   }
  // mtehod to delete an item from the list of objects
   public void delete_item(int item, int N) {
       
       List<Integer> l = refrigerator.get(N);
       for(int j=0;j<l.size();++j){ //checks the list for the item N and then removes it from the list.
           if(l.get(j)==item){
               l.remove(j);
               break;
           }
          
       }
      
       refrigerator.put(N, l);
   }
  // method to find an object in the refrigerator
   public boolean find(int N, int item) {
      
       boolean flag = false;
      
           List<Integer> l = refrigerator.get(N);
           for(int j=0;j<l.size();++j){
               if(l.get(j)==item)
                   return flag;
              
           }
      
       return !flag;
   }
   
   // method to combine items in the refrigerator list
   public String combine(int R1, int R2, int R3,PrintWriter printer) throws FileNotFoundException {
  
      
           List<Integer> l1 = refrigerator.get(R1);
           List<Integer> l2 = refrigerator.get(R1);
      
           for (Integer t : l2) {
               if(l1.size()!=MaxItem){
                   l1.add(t);
               }else{
                   printer.write("Combine " + R1 + " & " + R2 + " :::Item " +t +" not added in Refrigerator " + R1 + " as it is full\n");
               }
            }
           refrigerator.put(R3, l1);
           Collections.sort(l1);
          
           String x = "";
            for (Integer t : l1) {
               if(t==0)
                   continue;
             
                x = x + t + " ";
            }
            printer.write("After combining elements of Refrigerator " + R1 + " and " + R2 + " is:\n");
           return x;
          
   }
   public String common(int R1, int R2, int R3) {
       Set<Integer> set = new HashSet<Integer>();
       List<Integer> list = new ArrayList<Integer>();
       List<Integer> l1 = refrigerator.get(R1);
           List<Integer> l2 = refrigerator.get(R1);

            for (Integer t : l1) {
                if(t!=0 && l2.contains(t)) {
                    list.add(t);
                    set.add(t);
                }
            }

           refrigerator.put(R3, list);
           list = new ArrayList<>(set);
           Collections.sort(list);
           return list.toString();
      
   }
  
   // method to print the output
   public String output(int R1) {
      
       List<Integer> l1 = refrigerator.get(R1);
       Collections.sort(l1);
          String x = "\n";
            for (Integer t : l1) {
               if(t==0)
                   continue;
             
                x = x + t + " \n";
            }

       System.out.println();
       return x;
      
   }
}

