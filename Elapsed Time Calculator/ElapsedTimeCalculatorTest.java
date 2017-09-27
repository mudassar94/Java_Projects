
import javax.swing.JOptionPane;

/**
 * A class that uses the ElapsedTime Class.
 */
public class ElapsedTimeCalculatorTest
{
 	public static void main (String args[])
	{
            String input1 = JOptionPane.showInputDialog("Enter the Start Time");
            int StartTime = Integer.parseInt(input1);
            
            String input2 = JOptionPane.showInputDialog("Enter the End Time");
            int EndTime = Integer.parseInt(input2);
            
            ElapsedTimeCalculator myCalculator = new ElapsedTimeCalculator(StartTime,EndTime);
            // double StartTime = myCalculator.getStartTime();
            // double EndTime = myCalculator.getEndTime(); 
            
            System.out.println("Start Time: " + myCalculator.getStartTime());
            System.out.println("End Time: " + myCalculator.getEndTime());
            
            int hourtime = (int) ((EndTime/100)-0.4 - (StartTime/100)) ;
            float mintime = (float) (((EndTime/100)-0.4) - (StartTime/100) - hourtime)*100 ;
            
            System.out.println("Exactly " + hourtime + " hour(s) and " 
                    + mintime + " minute(s) have passed.");
            
            double minsreturn = myCalculator.MinutesReturn();
            System.out.println("Total elapsed time in minutes: " + minsreturn);
            
            double returnhours = myCalculator.HoursReturn();
            System.out.println("Total elapsed time in hours: " + returnhours);
            
            int y = (1440/100)*60;
            int x = 1440 % 100;
            int z = x+y;
            System.out.println(z);
            
            
            
            
            
        }
}