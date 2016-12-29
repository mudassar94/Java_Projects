/**
 *  A class to represent a circle.
 */
public class BottledWaterCalculator
{
        // instance variables
       
        String CountryName;
        private int CountryPopulation;
        private double NumberOfCircumferences;
        private double LengthOfBottle;
        private double VolumeOfBottle;
        private double BottlesUsed;
        private double WaterAmountUsed;
        private double newlength;
        private double newvolume;
        
        public BottledWaterCalculator(String CountryName, int CountryPopulation, double NumberOfCircumferences, double LengthOfBottle, double VolumeOfBottle)
        {
            this.CountryName = CountryName ;
            this.CountryPopulation = CountryPopulation ;
            this.NumberOfCircumferences = NumberOfCircumferences ;
            this.LengthOfBottle = LengthOfBottle ;
            this.VolumeOfBottle = VolumeOfBottle ;
        }
        
        public String getName()
        {
            return CountryName ;
        }
        
        public int getPopulation()
        {
            return CountryPopulation ; 
        }
        
        public double getNumberOfCircumferences()
        {
            return NumberOfCircumferences ;
        }
        
        public double getLengthOfBottle()
        {
            return LengthOfBottle;
        }
        
        public double getVolumeOfBottle()
        {
            return VolumeOfBottle;
        }
        
        public void setLengthOfBottle(double newLengthOfBottle)
        {
            this.LengthOfBottle = newLengthOfBottle ;
        }
        public void setVolumeOfBottle (double newVolumeOfBottle)
        {
            this.VolumeOfBottle = newVolumeOfBottle ;
        }
        
        public double NumberBottlesUsed(double NumberOfCircumferences, double LengthOfBottle)
        {
            BottlesUsed = (NumberOfCircumferences*24902)/(LengthOfBottle/63360) ;
            return BottlesUsed ;
        }
        
        public double WaterAmountUsed(int CountryPopulation, double VolumeOfBottle, 
                double LengthOfBottle, double NumberOfCircumferences)
        {
            WaterAmountUsed = ((NumberOfCircumferences*24902)/(LengthOfBottle/63360)*(VolumeOfBottle/128))/350000000 ;
            return WaterAmountUsed ;
        }
        
}