package application;


/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This class is mainly designed to compute holiday bonuses 
 * and also to determine the overall total of those bonuses.
 * Due: 11/19/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nurahmed Multezem
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public final class TwoDimRaggedArrayUtility extends Object
{
	
	// No-arg Constructor
	public TwoDimRaggedArrayUtility()
	{
	}
	
	/**
	 * @param file is the file to read from
	 * @return returns a two dimensional ragged array 
	 * @throws FileNotFoundException if the file is not found
	 * method essentially reads data from a file and returns a ragged array of doubles
	 */
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		// this is to create a Scanner that reads the file
		Scanner scanner = new Scanner(file);
		
		// it initializes rows counter to zero
		int rows = 0;
		
		// Loop to count the number of lines in the file
		while (scanner.hasNextLine())
		{
			rows++;
			scanner.nextLine();
		}
		
		// Scanner closes
		scanner.close();
		
		// Creates a ragged array with a specified number of rows
		double[][] data  = new double[rows][];
		
		// this creates another scanner
		Scanner input = new Scanner(file);
		
		// Nested loop where the outer loop processes each row and the inner loop processes the columns
		for (int row = 0; row < data.length; row++) 
		{
			// Reads the next line from the file
			String line = input.nextLine();
			// Splits the line into elements, removing whitespace
			String[] separated = line.split(" ");
			
			// Initializes the row with the number of elements
			data[row] = new double[separated.length];
			
			for (int col = 0; col < data[row].length; col++) 
			{
				data[row][col] = Double.valueOf(separated[col]);
			}
		}
		
		input.close();
		return data;
	}
	
	/**
	 * This method writes the data from the array into an output file
	 * @param data is the two dim ragged array
	 * @param outputFile file we are writing to
	 * @throws FileNotFoundException if no file is found
	 */
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		// this creates PrintWriter object
		PrintWriter writer = new PrintWriter(outputFile);
		
		// it iterates through each row of data, constructing new line by appending every single element with space
		for (double[] row : data)
		{
			
			StringBuilder line = new StringBuilder();
			
			for (int col = 0; col < row.length; col++)
			{
				line.append(row[col]).append(" ");
			}
			
			// this prints new line to the file while removing trailing spaces
			writer.println(line.toString().trim());
		}
		
		writer.close();
	}
	
	/**
	 * this method primarily serves to return the sum of all elements in an array
	 * @param data is the two dim ragged array
	 * @return returns the sum of all elements in the array
	 */
	public static double getTotal(double[][] data)
	{
		// it initializes total to 0 or counter
		double total = 0;
		
		// For loop to calculator total
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	/**
	 * this method serves to return the average of all the data in the two dim ragged array
	 * @param data is the two dim ragged array
	 * @return returns the average of all of the elements in the array
	 */
	public static double getAverage(double[][] data)
	{
		// this initialize double values that will act as counters
		double total = 0;
		int numOfElements = 0;
		
		// this increments the total sum of the data and total number of elements
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				total += data[row][col];
				numOfElements++;
			}
		}
		
		// this will checks if the denominator doesn't equal to 0
		if (numOfElements != 0)
		{
			return (total / numOfElements); 
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data is the two dim array
	 * @param row is the row index to take the total of (0 refers to first row)
	 * @return returns the total of the row
	 */
	public static double getRowTotal(double[][] data, int row)
	{
		// this initializes row total values to zero initially
		double rowTotal = 0;
		
		// this for-loop increments the total value per element in a row
		for (int col = 0; col < data[row].length; col++)
		{
			rowTotal += data[row][col];
		}
		
		return rowTotal;
	}
	
	/**
	 * Returns the total of the selected column in the two dim array
	 * @param data is the two dim array
	 * @param col is the column index to take the total of
	 * @return returns the total of the column
	 */
	public static double getColumnTotal(double[][] data, int col)
	{
		// this will initializes column total values to zero
		double colTotal = 0;
		
		// this for-loop increments the column total
		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length)
			{
				colTotal += data[row][col];
			}
		}
		
		return colTotal;
	}
	
	/**
	 * Method returns the largest element in the specified row within the two dim array
	 * @param data is the two dim array
	 * @param row is the specified row
	 * @return returns the largest element in the row 
	 */
	public static double getHighestInRow(double[][] data, int row)
	{
		// this initializes the largest element in row with first column
		double highestElement = data[row][0];
		
		// This for-loop updates the largest element if it is smaller than the element being compared
		for (int col = 0; col < data[row].length; col++)
		{
			if (data[row][col] > highestElement)
			{
				highestElement = data[row][col];
			}
		}
		
		return highestElement;
	}
	
	/**
	 * Method returns the index of the largest element in the specified row
	 * @param data is the two dim array
	 * @param row is the specified row
	 * @return returns the index of the largest element in the specified row
	 */
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		// Sets the index to 0 and assigns the highest value to the first element of the row.
		int index = 0;
		double highestValue = data[row][0];
		
		// The for loop examines each column to find the highest value and updates the index to reflect the column containing the largest element in the row.
		for (int col = 0; col < data[row].length; col++)
		{
			if (data[row][col] > highestValue)
			{
				highestValue = data[row][col];
				index = col;
			}
		}
		
		return index;
	}
	
	/**
	 * Method returns the lowest element in the specified row
	 * @param data is the two dim ragged array
	 * @param row is the specified row
	 * @return returns the lowest element in the array 
	 */
	public static double getLowestInRow(double[][] data, int row)
	{
		// Sets the lowest element in the row to the value of the first column.
		double lowestElement = data[row][0];
		
		// The for loop updates the lowest element if it is greater than the element being compared.
		for (int col = 0; col < data[row].length; col++)
		{
			if (data[row][col] < lowestElement)
			{
				lowestElement = data[row][col];
			}
		}	
		
		return lowestElement;
	}
	
	/**
	 * Method returns the index of the lowest element in the array
	 * @param data is the two dim ragged array
	 * @param row is the specified row
	 * @return returns the index of the lowest element in the array
	 */
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		// Initializes the lowest element and index in the row using the value from the first column.
		int index = 0;
		double lowestElement = data[row][0];
		
		// The for loop updates the lowest element if it is greater than the element it is comparing against.
		for (int col = 0; col < data[row].length; col++)
		{
			if (data[row][col] < lowestElement)
			{
				lowestElement = data[row][col];
				index = col;
			}
		}	
		
		return index;
	}
	
	/**
	 * Method returns the largest element in a specified column within a two dim array
	 * @param data is the two dim array
	 * @param col is the specified array
	 * @return returns highest element in the array 
	 */
	public static double getHighestInColumn(double[][] data, int col)
	{
		// Sets the highest element to the value of the first row.
		double highestElement = data[0][col];
		
		// The for loop updates the highest value in the column 
		//after verifying that the column index is within the bounds 
		//of the current row and that the highest element is less than 
		//the element being compared.
		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length && data[row][col] > highestElement)
			{
				highestElement = data[row][col];
			}
		}
		
		return highestElement;
	}
	
	/**
	 * Method returns the largest element in the column's index
	 * @param data is the two dim array
	 * @param col is the specified array
	 * @return returns the highest element in the column's index
	 */
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		// Sets the highest element to the value in the first row and initializes the index to 0.
		int index = 0;
		double highestElement = data[0][col];
		
		//The for loop updates the highest value in the column after confirming
		//that the column index is within the limits of the current row and that
		//the highest element is less than the element being compared.
		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length && data[row][col] > highestElement)
			{
				highestElement = data[row][col];
				index = row;
			}
		}
		
		return index;
	}

	/**
	 * Method returns the smallest element in the specified column in the two dim array
	 * @param data is the two dimensional array
	 * @param col is the specified column
	 * @return returns the smallest element in the column in the array
	 */
	public static double getLowestInColumn(double[][] data, int col)
	{
		// Sets the lowest element to the value in the first row.
		double lowestElement = data[0][col];
		
		// The for loop updates the lowest value in the column.
		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length && data[row][col] < lowestElement)
			{
				lowestElement = data[row][col];
			}
		}
		
		return lowestElement;
	}
	
	/**
	 * Method returns the smallest element's index in the specified column
	 * @param data is the two dim array
	 * @param col is the specified column
	 * @return returns the smallest element's index in the column in the array
	 */
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		// Sets the lowest element to the value in the first row and initializes the index to 0.
		int index = 0;
		double lowestElement = data[0][col];
		
		// The for loop updates the lowest value in the column and assigns the index to the current row.
		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length && data[row][col] < lowestElement)
			{
				lowestElement = data[row][col];
				index = row;
			}
		}
		
		return index;
	}
	
	/**
	 * Method returns the largest element in the array
	 * @param data is the two dim array
	 * @return returns the largest element in the array
	 */
	public static double getHighestInArray(double[][] data)
	{
		// Sets the highest element to the value of the element in the first row and first column.
		double highestElement = data[0][0];
		
		// The for loop goes through each row and column, comparing each value to the highest element.
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				if (data[row][col] > highestElement)
				{
					highestElement = data[row][col];
				}
			}
		}
		
		return highestElement;
	}
	
	/**
	 * Method returns the smallest element in the array
	 * @param data is the two dimensional array
	 * @return returns the smallest element in the array
	 */
	public static double getLowestInArray(double[][] data)
	{
		// check/verify if the array is empty.
	    if (data.length == 0 || data[0].length == 0) 
	    {
	        throw new IllegalArgumentException("The array is empty or improperly initialized.");
	    }
	    
		//Sets the lowest element to the value of the first element in the first row.
		double lowestElement = data[0][0];
		
		// The for loop goes through each row and column, comparing each value to the lowest element.
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				if (data[row][col] < lowestElement)
				{
					lowestElement = data[row][col];
				}
			}
		}
		return lowestElement;
	}
}
