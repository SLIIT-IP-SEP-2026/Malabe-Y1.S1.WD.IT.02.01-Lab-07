import java.util.Scanner;

public class IT26102562Lab7Q1B
{
	public static void main(String [] args)
	{
		Scanner input =  new Scanner(System.in);
		
		String grade ="";
		int student = 1;
		int total = 0;
		
		
		while ( student<4 )
		{
			System.out.println("Student " + student);
		
			System.out.print("Enter marks : ");
			int num1= input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int num4 = input.nextInt();
			
			total = num1+num2+num3+num4;
			double avg = total /4;
			
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
			System.out.println("Overall Grade is : " + grade);
			
			student++;
		}
	}
}