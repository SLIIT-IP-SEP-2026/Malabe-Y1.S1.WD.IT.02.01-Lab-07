import java.util.Scanner;

public class IT26102670Lab7Q1A
{
	public static void main(String[] args)
	{
		Scanner nim = new Scanner(System.in);
		System.out.println("Enter marks for four subjects:");
		
		System.out.print("Enter Subject Mark 1 :");
	    int mark1 = nim.nextInt();
		
		System.out.print("Enter Subject Mark 2 :");
	    int mark2 = nim.nextInt();
		
		System.out.print("Enter Subject Mark 3 :");
	    int mark3 = nim.nextInt();
		
		System.out.print("Enter Subject Mark 4 :");
	    int mark4 = nim.nextInt();
		
		System.out.println();
		double avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
	    System.out.println("Average is :" + avg);
		
		if (avg >= 75)
		{
			System.out.println("Overall Grade is : Distinction");
		}
		else if (avg >= 50)
		{
			System.out.println("Overall Grade is : Credit");
		}
		else{
			System.out.println("Overall Grade is : Fail");
		}
	}
}
		
		
		
		
	
	

