/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Mudassar
 */
public class LinkedListTest {

      public static void main(String[] args) throws Exception{
        /* if (args.length < 1) {
           System.out.println("Please provide input file name");
           return;
       }  */
       String in = JOptionPane.showInputDialog("Input File Name:");
       String out = JOptionPane.showInputDialog("Output File Name:");
       PrintWriter pw = new PrintWriter(out);
       
       // Read file
      
       
        FileReader infile = new FileReader(in);
        Scanner sc = new Scanner(infile);
        int size = sc.nextInt();
        
        LinkedList[] sets = new LinkedList[size];
        for(int i=0; i<size ; i++){
           sets[i] = new LinkedList();
        }
        sc.nextLine();
        
        while (sc.hasNext())
        {   
            char letter = sc.next().charAt(0);
            if (letter == 'A'){
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                sets[y].add(x);
                
                pw.println(x + " added to set "+y);
                if(sc.hasNext()){sc.nextLine();}
                
            }
            
            else if (letter == 'E'){
             int x = sc.nextInt();
             sets[x].isEmpty();
             
                if(sets[x].isEmpty()== true)
                    pw.println("Set "+x+" is empty.");
                else 
                    pw.println("Set "+x+" is not empty.");
             if(sc.hasNext()){sc.nextLine();}
                
             
            }
            
            
            else if (letter == 'B'){
             int x = sc.nextInt();
             int y = sc.nextInt();
             
             
             if(sets[y].isMember(x)== true)
                    pw.println(x+" belongs to set "+y);
             else 
                    pw.println(x+" doesn't belong to set "+y);
             if(sc.hasNext()){sc.nextLine();}
            
            }
            
            else if(letter == 'R'){ 
             int x = sc.nextInt();
             int y = sc.nextInt();
             sets[y].remove(x);
             pw.println(x+" removed from set "+y);
             if(sc.hasNext()){sc.nextLine();}
             
            }
            
            else if(letter == 'U'){ 
             int x = sc.nextInt();
             int y = sc.nextInt();
             int z = sc.nextInt();
             sets[x].union(sets[y], sets[z]);
             pw.println("After union of set "+x+ " & "+y+":");
             pw.println(sets[z].toString());
             if(sc.hasNext()){sc.nextLine();}
             
            }
            
            else if(letter == 'N'){ 
             int x = sc.nextInt();
             int y = sc.nextInt();
             int z = sc.nextInt();
             sets[x].intersection(sets[y], sets[z]);
             pw.println("After intersection of set "+x+ " & "+y+":");
             pw.println(sets[z].toString());
             if(sc.hasNext()){sc.nextLine();}
             
            }
            
            else if(letter == 'D'){ 
             int x = sc.nextInt();
             int y = sc.nextInt();
             int z = sc.nextInt();
             sets[x].difference(sets[y], sets[z]);
             pw.println("After difference of set "+x+ " & "+y+":");
             pw.println(sets[z]);
             if(sc.hasNext()){sc.nextLine();}
             
            }
            
            else if (letter == 'Q'){
             int x = sc.nextInt();
             int y = sc.nextInt();
              if(sets[x].equals(sets[y])== true)
                    pw.println("Set "+x+" equals set "+y);
              else 
                    pw.println("Set "+x+" doesn't equal set "+y);
              if(sc.hasNext()){sc.nextLine();}
             
            }
             
            else if (letter == 'O'){
             int x = sc.nextInt();
             String s1 = sets[x].toString();
             pw.println("Set "+x+" output:");
             pw.println(s1);
             if(sc.hasNext()){sc.nextLine();}
            }
  
        }
        sc.close();
        pw.close();
       }    
       
      
}
