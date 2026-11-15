import java.util.Scanner;
public class IT26101506Lab7Q1A{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double Average;
		String grade;
		
		
		System.out.println("Enter marks for four subjects");
		
		System.out.println("Enter Subject Mark 1:");
		int Mark1 = input.nextInt();
		
		System.out.println("Enter Subject Mark 2:");
		int Mark2 = input.nextInt();
		
		System.out.println("Enter Subject Mark 3:");
		int Mark3 = input.nextInt();
		
		System.out.println("Enter Subject Mark 4:");
		int Mark4 = input.nextInt();
		
		Average = (Mark1+Mark2+Mark3+Mark4)/4.0;
		
		if(Average >= 75){
			grade = "Distinction";
		}
		else if(Average >= 50){
			grade = "Credit";
		}
		else {
			grade = "Fail";
		}
		
		System.out.println("Average is : " + Average);
		System.out.println("Overall grade is : " + grade );
	}
}
		