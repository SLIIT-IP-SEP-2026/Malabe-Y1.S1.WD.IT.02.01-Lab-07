import java.util.Scanner;

public class IT26102739Lab7Q1B
{
	public static void main(String[]args)
	{
		int mark1, mark2, mark3, mark4;
		double sum = 0;
		double avg = 0;
		
		Scanner input = new Scanner(System.in);
		
		//Loop to iterate the marks for the 3 students
		for(int i = 1; i <= 3; i++){
			System.out.println("Student " + i);
			System.out.print("Enter the marks: ");
			//To input 4 subject marks in the same line with spaces
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
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
			//To add space after each student's calculations & results 
			System.out.print("\n");
		}
	}
}