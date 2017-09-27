import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class NumbersGameTest {
    public static void main (String [] args)
    {
        String input1 = JOptionPane.showInputDialog("Enter game type: \"straight\" or \"box\" ");
        System.out.println("Game Type: " + input1);
                       
        String input2 = JOptionPane.showInputDialog("Enter the winning numbers.");
        int winnumbers = Integer.parseInt(input2);
        System.out.println("Winning Numbers: " +input2);
        
        String input3 = JOptionPane.showInputDialog("Enter your numbers.");
        int usernumbers = Integer.parseInt(input3);
        System.out.println("User Numbers: " +input3);
        
        
        
        
        NumbersGame game1 = new NumbersGame(usernumbers, winnumbers);
        String string1 = "straight";
        String string2 = "box";
        
        if (string1.equalsIgnoreCase(input1))
        {
            game1.StraightBet() ;
        }
        else if (string2.equalsIgnoreCase(input1))
        {
            game1.BoxBet();
        }
        
       
        
        /* switch(input1) {
            case "straight":
                game1.StraightBet();
            case "box":
                game1.BoxBet(); */
        }
        
                               
            
            
        
    }
