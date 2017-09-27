import javax.swing.JOptionPane;
/**
 * A class to give students experience using loops.  This class
 * creates and manipulates objects of Greg's Date class.
 */
 public class SpeedDating
 {
    // Note: this class has no instance variables!
 	
    /**
     * Create an empty SpeedDating object
     * (this is known as a "default" constructor)
     */
     public SpeedDating()
     {}	   // Constructor has empty body
 	
    /**
     * Prints the day of the week (e.g. "Thursday") on which New Year's Day
     * will fall in 10 consecutive years
     * 
     * @param startYear the first of the 10 consecutive years
     */
     public void auldLangSynch(int startYear)
     {
        int years = startYear + 10;
        for (int i = startYear; i < years; i++) {
            Date newyears = new Date(1, 1, i);
            System.out.println("In "+ newyears.getYear()+", the New Year's will"
                    + " be on a "+ newyears.getDayOfWeek());
            // System.out.print(newyears.getYear() + ", ");
            // System.out.println(newyears.getDayOfWeek() + ", ");
        }
            // TO DO: write body of this method here
     }
 	
    /**
     * Computes and returns the Date on which Thanksgiving will fall 
     * in a given year.
     *
     * NOTE: By law, Thanksgiving is the 4th Thursday in November
     *
     * @param year the year for which to compute the date of Thanksgiving
     * @return the Date of Thanksgiving for the specified year
     */
     public Date getThanksgiving(int year)
     {
       Date Thanksgiving = new Date(11, 1, year);
       int ThanksDay =1;
       do{
           if (Thanksgiving.getDayOfWeek().equals("Thursday"))
           {
               ThanksDay = Thanksgiving.getDay();
           }
           else 
           {
               Thanksgiving.next();
           }
       }
       while (! Thanksgiving.getDayOfWeek().equals("Thursday"));
           
               
        ThanksDay = Thanksgiving.getDay()+21; 
        System.out.println("\nIn "+year+", Thanksgiving will fall on " + ThanksDay+"th November.");

       return Thanksgiving;
        
 }

     
 	 	
     /**
      * Computes and returns the number of days between two dates,
      * counting the end date but not the start date.  E.g., the
      * number of days between 11/3/2016 and 11/7/2016 is 4, not 5.
      *
      * Precondition: The start date must occur on or before the end date.
      * 
      * @param start the earlier of the two dates
      * @param end the later of the two dates
      * 
      * @return the number of days between the two dates 
      */
      public int countingTheDays(Date start, Date end) 
      {
 	  int count = 0;
        while (!start.equals(end))
        {
            start.next();
            count++;
            
        }
        System.out.println("\nThe total number of days between the two dates is " +count);
        return count;

           // TO DO: write body of this method here
      }
 }