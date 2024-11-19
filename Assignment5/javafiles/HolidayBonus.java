package application;

/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This class is mainly designed to compute holiday bonuses 
 * and also to determine the overall total of those bonuses.
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nurahmed Multezem
*/

public class HolidayBonus extends Object
{
	// Constant Values
	private static final double HIGHEST_BONUS = 5000;
	private static final double LOWEST_BONUS = 1000;
	private static final double OTHER_BONUS = 2000;
	
	// Default Constructor
	public HolidayBonus()
	{
	}
	
	/**
	 * This method is mainly responsible for calculating the holiday bonus for district 5
	 * @param data represents a two-dimensional array
	 * @return an array containing the bonus for each store 
	 */
	public static double[] calculateHolidayBonus(double[][] data) 
  {
		// Initializes a new array to hold the bonuses
    	double[] bonuses = new double[data.length];
    	
    	// Nested for loop goes through each row and column
		for (int row = 0; row < data.length; row++) 
		{
			// Sets the accumulator for the current row to zero
			bonuses[row] = 0;
			
			/* 
			 * Inner for loop iterates through each column to 
			 * determine if the value in the current row's column
			 * is the highest or lowest in that column across all rows
			 */
			for (int col = 0; col < data[row].length; col++) 
			{
				if (TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col) == row) 
					bonuses[row] += LOWEST_BONUS;
				else if (TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col) == row) 
					bonuses[row] += HIGHEST_BONUS;
				else 
					bonuses[row] += OTHER_BONUS;
			}
		}
		
		return bonuses;
  }
	
	/**
	 * This method calculates the total amount of holiday bonuses
	 * @param data represents the two-dimensional array
	 * @return a double value representing the total
	 */
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		/* An array that stores the bonuses from the ragged array
		 * totalBonuses is a running total initialized to 0
		 */
		double[] bonuses = calculateHolidayBonus(data);
		double totalBonuses = 0;
		
		// Accumulates the total using an enhanced for loop 
		for (double bonus : bonuses)
		{
			totalBonuses += bonus;
		}
		
		return totalBonuses;
	}
}
