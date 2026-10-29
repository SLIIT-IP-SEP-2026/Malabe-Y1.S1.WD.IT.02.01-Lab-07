import java.util.Scanner;

public class IT26102493Lab7Q1B
{
	public static void main(String[]args)
	{
		int a, b, c, d ;
		double totalMark;
		int student ;
		
		
		Scanner sc = new Scanner(System.in);
		
		for(student = 1; student <= 3; student++)
		{
			totalMark = 0;
			
			System.out.println("Student " + student);
			
			for(int i = 1; i < 4 ; i++);
			{

				System.out.print("Enter Marks : ");
			
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				
				totalMark = a + b + c + d;
			}
			
			double avg = totalMark/4;
			
			System.out.println("Average is " + avg);
		
			
			if (avg >= 75)
			{
				System.out.println("Overall Grade is : Distinction");
			}
			
			else if (avg >= 50)
			{
				System.out.println("Overall Grade is : Credit");
			}
		
			else
			{
				System.out.println("Overall Grade is : Failed");
			}
			
			System.out.print("\n");
		}
		
	}
}