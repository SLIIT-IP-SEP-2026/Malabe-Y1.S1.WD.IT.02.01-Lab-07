import java.util.Scanner;

public class IT26102739Lab7Q2A
{
	public static void main(String[]args)
	{
		//Number of rows and columns
		int rows = 4;
		int columns = 5;
		
		//Loop thru each row
		for(int rowCount = 0; rowCount < rows; rowCount++){
			
			//Loop thru each column of the current row
			for(int columnCount=0; columnCount < columns; columnCount++){
				System.out.print("$ ");
			}
			//Moving to the next line after printing all columns in the current row.
			System.out.println();
		}
	}
}

