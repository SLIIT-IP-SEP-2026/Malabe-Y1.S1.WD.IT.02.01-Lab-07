import java.util.Scanner;
public class IT26101506Lab7Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double Average;
		String grade;
		
		for(int i = 1; i <= 3; i++){
			
			System.out.println("Student" + i);
			
			System.out.print("Enter Marks: ");
			int mark1 = input.nextInt();
			int mark2 = input.nextInt();
			int mark3 = input.nextInt();
			int mark4 = input.nextInt();
			
			Average = (mark1+mark2+mark3+mark4)/4.0;
			
		
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
		
		System.out.println();
		}
		input.close();
	}
}
		