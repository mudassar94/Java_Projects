/**
 * A class that uses the Circle class.
 */
public class BottledWaterCalculatorTester
{
 	public static void main (String args[])
	{
            BottledWaterCalculator myCalculator = new BottledWaterCalculator("USA", 350000000, 190, 8.5, 12);
            String CountryName = myCalculator.getName();
            int CountryPopulation = myCalculator.getPopulation();
            double NumberOfCircumferences = myCalculator.getNumberOfCircumferences();
            double LengthOfBottle = myCalculator.getLengthOfBottle();
            double VolumeOfBottle = myCalculator.getVolumeOfBottle();
            
            System.out.println("The name of the country is "+ CountryName+ ".");
            System.out.println("The population of the country is "+ CountryPopulation + ".");
            System.out.println("The number of Circumferences is "+ NumberOfCircumferences + ".");
            System.out.println("The length of an average bottle is "+ LengthOfBottle + ".");
            System.out.println("The volume of an average bottle is "+ VolumeOfBottle + ".");
            
            double NumberOfBottlesUsed = myCalculator.NumberBottlesUsed(NumberOfCircumferences, LengthOfBottle);
            System.out.println("The number of water bottles used is "+ NumberOfBottlesUsed + ".");
            
            double WaterAmountUsed = myCalculator.WaterAmountUsed(CountryPopulation, VolumeOfBottle, LengthOfBottle, NumberOfCircumferences);
            System.out.println("The amount of water used in gallons per person is "+ WaterAmountUsed + ".");
            
            myCalculator.setLengthOfBottle(10);
            myCalculator.setVolumeOfBottle(15);
            
            double newlength = myCalculator.getLengthOfBottle();
            double newvolume = myCalculator.getVolumeOfBottle();
                       
            System.out.println("The new length of an average bottle is "+ myCalculator.getLengthOfBottle() + ".");
            System.out.println("The new volume of an average bottle is "+ myCalculator.getVolumeOfBottle() + ".");
            
            double newNumberOfBottlesUsed = myCalculator.NumberBottlesUsed(NumberOfCircumferences, newlength);
            System.out.println("The new number of water bottles used is "+ newNumberOfBottlesUsed + ".");
            
            double newWaterAmountUsed = myCalculator.WaterAmountUsed(CountryPopulation, newvolume, LengthOfBottle, NumberOfCircumferences);
            System.out.println("The new amount of water used in gallons per person is "+ newWaterAmountUsed + ".");
          
        }   
}
