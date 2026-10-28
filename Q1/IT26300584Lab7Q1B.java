// Q1B

import java.util.Scanner;

public class IT26300584Lab7Q1B
{
	public static void main(String[]args)
	{
		int student = 1;
		int totMark = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(student <=3)
		{
			System.out.print("\n");
			
			System.out.println("Student " + student);
			
			System.out.print("Enter marks : ");
			int subjectMark1 = sc.nextInt();
			int subjectMark2 = sc.nextInt();
			int subjectMark3 = sc.nextInt();
			int subjectMark4 = sc.nextInt();
			
			totMark = subjectMark1 + subjectMark2 + subjectMark3 + subjectMark4;
			
			System.out.print("\n");
			
			double avg = totMark/4;
			System.out.println("Average is " + avg);
		
			if(avg >= 75)
			{
				System.out.println("Overall Grade is Distinction");
			}
		
			else if (avg >= 50)
			{
				System.out.println("Overall Grade is Credit");
			}
		
			else
			{
				System.out.println("Overall Grade is Fail");
			}
			
			student++;
		}
	}
}