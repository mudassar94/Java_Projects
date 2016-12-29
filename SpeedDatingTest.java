import javax.swing.JOptionPane;
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author 
 */
public class SpeedDatingTest {
    
    public static void main (String args[])
    {
        
        SpeedDating date=new SpeedDating(); 
        
        // Caling New Years Method
        String input = JOptionPane.showInputDialog ("Enter the New Year's year ") ;
        
        int startYear = Integer.parseInt(input) ;
        date.auldLangSynch(startYear);
 
         
       // Calling theCountingDays Method
      input = JOptionPane.showInputDialog
                       ("Enter the first month ") ;
        
       int month = Integer.parseInt(input) ;
        
       input = JOptionPane.showInputDialog
                       ("Enter the first day ") ;
        
      int day = Integer.parseInt(input) ;
        
      input = JOptionPane.showInputDialog
                       ("Enter the first year ") ;
     
      int year1 = Integer.parseInt(input) ;
         System.out.println("\nFirst Date: "+month+"/"+day+"/"+year1);
         
      input = JOptionPane.showInputDialog
                       ("Enter the second month ") ;
        
       int month01 = Integer.parseInt(input) ;
        
       input = JOptionPane.showInputDialog
                       ("Enter the second day ") ;
        
      int day01 = Integer.parseInt(input) ;
        
      input = JOptionPane.showInputDialog
                       ("Enter the second year ") ;
      
      int year01 = Integer.parseInt(input) ;
      
      System.out.println("Second Date: "+month01+"/"+day01+"/"+year01);
      
      Date firstDate = new Date(month, day, year1);
      
      Date secondDate = new Date(month01, day01, year01);
      
       date.countingTheDays(firstDate, secondDate);
       
        // Calling the Thanksgiving Method
        input = JOptionPane.showInputDialog("Enter a year for Thanksgiving ") ;
        int year_1 = Integer.parseInt(input) ;
      
        SpeedDating thanksgiving = new SpeedDating() ; 
        thanksgiving.getThanksgiving(year_1) ; 
        
        input = JOptionPane.showInputDialog("Enter another year for Thanksgiving ") ;
        int year_2 = Integer.parseInt(input) ;
      
        thanksgiving.getThanksgiving(year_2) ; 
             
        }
              
}