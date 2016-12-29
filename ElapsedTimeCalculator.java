/**
 *  A class to calculate elapsed times.
 */
public class ElapsedTimeCalculator
{
        // instance variables
       
        String CountryName;
        private int StartTime;
        private int EndTime;
        
       
        
        public ElapsedTimeCalculator(int StartTime, int EndTime)
        {
            this.StartTime = StartTime ;
            this.EndTime = EndTime ;
           
        }
        
        public int getStartTime()
        {
            return StartTime;
        }
        
        public int getEndTime()
        {
            return EndTime;
        }
        
        public void setStartTime(int newStartTime)
        {
            this.StartTime = newStartTime;
        }
        
        public void setEndTime(int newEndTime)
        {
            this.EndTime = newEndTime;
        }
        
        
        
        public double HoursReturn()
        {
            // local variables
            
            double HoursReturn;
            HoursReturn = (EndTime - StartTime)/100 ;
            return HoursReturn;
        }
        
        public double MinutesReturn()
        {
            double minreturn;
            minreturn = ((EndTime*0.6) - (StartTime*0.6));
            return minreturn;
        }
}