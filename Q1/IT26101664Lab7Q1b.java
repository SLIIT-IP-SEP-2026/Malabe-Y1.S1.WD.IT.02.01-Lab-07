import java.util.Scanner;
public class IT26101664Lab7Q1b{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		String grade;
		for (int i = 1; i<=3; i++){
			
			System.out.println("student"+i );
			
			System.out.print("enter marks:");
			int mark1 = input.nextInt();
			int mark2 = input.nextInt();
			int mark3 = input.nextInt();
			int mark4 = input.nextInt();
			
			double average = (mark1 + mark2 + mark3 + mark4)/4.0;
			
			System.out.println("average is : " +average );
			
			if (average >= 75 ){
				grade = "Destintion";
				
			}else if (average >= 65){
				grade = "Merit";
				
				
			}else if (average >= 50){
				grade = "Credit";
				
			}else  {
				grade = "Fail";
			}
			System.out.println();
			System.out.println("Grade is :"+ grade);
		}
		input.close();
	}
}