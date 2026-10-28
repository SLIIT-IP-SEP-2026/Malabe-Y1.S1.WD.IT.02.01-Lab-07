import java.util.Scanner;
public class IT26300571Lab7Q1A {
	public static void main (String[]args) {
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the marks for four subjects:");
		System.out.println(" Enter subject mark 1 :" );
		int mark1 = input.nextInt();
		
		System.out.println(" Enter subject mark 2 :" );
		int mark2 = input.nextInt();
		
		System.out.println(" Enter subject mark 3 :" );
		int mark3 = input.nextInt();
		
		System.out.println(" Enter subject mark 4 :" );
		int mark4 = input.nextInt();
				
		int sum = mark1 + mark2 +mark3 + mark4;
		double avg = sum/4.0;
		
		if ( avg >= 75){
		grade = "Distination";
		
		}else if ( avg <= 74 || avg >= 50) {
		grade = " Credit";
		
		} else {
		grade = "fail";
		}
		
	    System.out.println("Average is: " + avg );
		 System.out.println("Overall grade is: " + grade );
		
	}
}
		
		
	
		
		
	