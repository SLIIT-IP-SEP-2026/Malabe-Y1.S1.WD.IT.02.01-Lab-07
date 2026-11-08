import java.util.Scanner;

public class IT26102739Lab7Q1A
{
	public static void main(String[]args)
	{
		int mark1, mark2, mark3, mark4;
		int sum = 0;
		double avg = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Marks for four subjects: ");
		System.out.print("Enter Subject Mark 1: ");
		mark1 = input.nextInt();
		System.out.print("Enter Subject Mark 2: ");
		mark2 = input.nextInt();
		System.out.print("Enter Subject Mark 3: ");
		mark3 = input.nextInt();
		System.out.print("Enter Subject Mark 4: ");
		mark4 = input.nextInt();
		
		sum = mark1 + mark2 + mark3 + mark4;
		avg = sum / 4;
		System.out.println("Average is: " + avg);
		
		if(avg >= 75){
			System.out.println("Overall Grade is: Distinction");
		}
		else if(avg >= 50){
			System.out.println("Overall Grade is: Credit");
		}
		else{
			System.out.println("Overall Grade is: Fail");
		}
	}
}