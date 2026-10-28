// Q1A

import java.util.Scanner;

public class IT26300584Lab7Q1A
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects : ");
		
		/*int subjectMark;
		int totMark = 0;
		
		for(int subject = 1; subject <= 4; subject++)
		{
			System.out.print("Enter Subject Mark " + subject + " : ");
			subjectMark = sc.nextInt();
			
			totMark += subjectMark;
			
		}*/
		
		System.out.print("Enter Subject Mark 1 : ");
		int subjectMark1 = sc.nextInt();
		
		System.out.print("Enter Subject Mark 2 : ");
		int subjectMark2 = sc.nextInt();
		
		System.out.print("Enter Subject Mark 3 : ");
		int subjectMark3 = sc.nextInt();
		
		System.out.print("Enter Subject Mark 4 : ");
		int subjectMark4 = sc.nextInt();
		
		double totMark = subjectMark1 + subjectMark2 + subjectMark3 + subjectMark4;
		
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
	}
}
		