/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public interface Set {
 
   public boolean isEmpty(); // Is the set empty?

   public void makeEmpty(); // Make this set empty.

   public boolean isMember(int x); // Is x a member of this set?

   public void add(int x); // Insert an element x in this set.

   public void remove(int y); // Delete an element y from this set.

   public void union(LinkedList other, LinkedList result); 
    // result = "this" UNION other

   public void intersection(LinkedList other, LinkedList result); 
    // result = "this"
    // INTERSECTION other

   public void difference(LinkedList other, LinkedList result); 
    // result = "this" - other

   public String toString(); 
    // Overridden toString method that returns the set
    // description as
    // a String.
   public boolean equals(Object other); 
    // Overridden equals method to check
    // equality of two sets.
}

