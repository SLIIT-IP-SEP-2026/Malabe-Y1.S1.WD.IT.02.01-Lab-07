import java.util.Scanner;

public class IT26102562Lab7Q1A
{
	public static void main(String [] args)
	{
		Scanner input =  new Scanner(System.in);
		
		String grade ="";
		
		System.out.println("Enter marks for four subjects: ");
		System.out.print("Enter Subject Mark 1: ");
		int num1 = input.nextInt();
		System.out.print("Enter Subject Mark 2: ");
		int num2 = input.nextInt();
		System.out.print("Enter Subject Mark 3: ");
		int num3 = input.nextInt();
		System.out.print("Enter Subject Mark 4: ");
		int num4 = input.nextInt();
		
		int total = num1+num2+num3+num4;
		double avg = total / 4;
		
		if (avg>=75 && avg<=100)
		{
			grade = "Distinction";
		}
		else if (avg<75 && avg>=50)
		{
			grade = "Credit";
		}
		else
		{
			grade = "Fail";
		}
		
		System.out.println("Average is : " + avg);
		System.out.print("Overall Grade is : " + grade);
	}
}