/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class NumbersGame {
    // instance var's
	private int digit1 ;			
	private int digit2 ;		
	private int digit3 ;	
        private int windigit1 ;		
	private int windigit2 ;		
	private int windigit3 ;
        private int winnumbers;
        private int usernumbers;
	String gametype;
        private boolean straight1;
	
    public NumbersGame(int usernumbers, int winnumbers) 
    {
    	
        
        windigit1 = winnumbers/100; // windigit1
        windigit2 = (winnumbers%100)/10; //windigit2
        windigit3 = (winnumbers%100)%10; //windigit3
        
        digit1 = usernumbers/100;
        digit2 = (usernumbers%100)/10;
        digit3 = (usernumbers%100)%10;
        
        
        
    }
    
    //public String GameType()
    //{
    //  if (gametype == StraightBet();
    //  else if (StraightBet());
    //}
    //public String toString()
    //{
    //	return digit1 + "  " + digit2 + "  " + digit3 ; 
    //
    
   
    public boolean StraightBet()
    {
    	if (digit1 == windigit1 && digit2 ==  windigit2 && digit3 == windigit3)
        {
            String output1 = "You win $600! Numbers matched exactly!";
            System.out.println(output1);
            return true;
        }
        else
        {
            System.out.println("Sorry, you lose. No digits match.");
            return false;
        }
     
    }
    
    public boolean BoxBet()
    {
        if ((digit1 == windigit1 || digit1 == windigit2 || digit1 == windigit3)
                && (digit2 == windigit1 || digit2 == windigit2 || digit2 == windigit3)
                && (digit3 == windigit1 || digit3 == windigit2 || digit3 == windigit3))
        {
            if ((digit1 == windigit1 || digit2 == windigit2 || digit3 == windigit3))
            {
                String output2 = "You win $200! You matched one duplicate number!";
                System.out.println(output2);
                return true;
                
            }
            else
            {
                String output3 = "You win $100! The three digits matched in any order.";
                System.out.println(output3) ;
                return true;
            }
        }
            
       else
       {
             System.out.println("Sorry you lose, no digits match.");
            return false;  
               }                                   
        }
       
        /* else if ((digit1 == windigit1 || digit1 == windigit2 || digit1 == windigit3)
                && (digit2 == windigit1 || digit2 == windigit2 || digit2 == windigit3)
                && (digit3 == windigit1 || digit3 == windigit2 || digit3 == windigit3))
        { 
            String output3 = "You win $100! The three digits matched in any order.";
            System.out.println(output3) ;
            
            return true;
        }
        else
        {
            System.out.println("Sorry you lose, no digits match.");
            return false;
        } */
    

    	 
   
   /*  public String getResult()
    {
    	 
                        
        if ( StraightBet() )
        {
            return "\t All three digits are equal. You Win!" ;
        }
        else if (BoxBet() )
        {
            return "\t Its a match. You win!";
        }   
        else 
        {
            return "\tSorry, you lose!";
        }
        
    } */
}
