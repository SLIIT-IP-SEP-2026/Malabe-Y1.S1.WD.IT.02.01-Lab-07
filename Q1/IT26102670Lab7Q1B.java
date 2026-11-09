import java.util.Scanner;

public class IT26102670Lab7Q1B
{
	public static void main(String[] args)
	{
		int count = 1;
		
		Scanner sc = new Scanner(System.in);
		
	for (count = 1; count <= 3; count++)
		{
			System.out.println("Student" + count);
			
			System.out.print("Enter marks :");
			int mark1 = sc.nextInt();
			
			int mark2 = sc.nextInt();
			
			int mark3 = sc.nextInt();
			
			int mark4 = sc.nextInt();
			
			
			double avg = (mark1 + mark2 + mark3 + mark4)/4.0;
			System.out.println("Average is :" + avg);
			
			if (avg >= 75)
			{
				System.out.println("Overall Grade is : Distinction");
				System.out.println();
			}
			else if (avg >= 50)
			{ System.out.println("Overall Grade is : Credit");
			
			System.out.println();
		
			}
			else{
				System.out.println("Overall Grade is : Fail");
				System.out.println();
			}
		} 
		
	}
}
				
		
		
		
		
		
		