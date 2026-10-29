import java.util.Scanner;

public class IT26102554Lab7Q1B
{
    public static void main(String[] args)
	{
		
	int rows = 4;
	int colums = 5;
	Scanner input = new Scanner(System.in);
	
	for(int rowCount=0 ; rowCount  < rows; rowCount++)
	{
		for(int columCount=0 ; columCount < colums; columCount++)
		{
			System.out.print("$ ");
		}
		System.out.println();
	}
	}
}