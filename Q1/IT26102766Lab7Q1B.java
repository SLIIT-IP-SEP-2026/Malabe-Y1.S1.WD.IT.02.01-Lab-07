import java.util.Scanner;

public class IT26102766Lab7Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num = 1;
		String grade;
		
		int mark1, mark2, mark3, mark4;
		 
		while(num <= 3){
			
			System.out.println("Student " + num);
			
			System.out.print("Enter marks for four subjects: ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			double avg = (mark1 + mark2 + mark3 + mark4)/4.0;
			
			System.out.println("Average is : " + avg);
			
			if (avg >= 75){
				grade = "Distinction";
			}
			
				else if (avg >= 50){
					grade = "Credit";					
				}
				
				else {
					grade = "Fail";
				}
				
				System.out.println("Overall Grade is : " +grade);
				
				System.out.println();
			num++;
			
		}
			
	}
}