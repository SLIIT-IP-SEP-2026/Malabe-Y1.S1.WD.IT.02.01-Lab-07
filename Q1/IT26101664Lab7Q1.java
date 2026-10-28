import java.util.Scanner;
public class IT26101664Lab7Q1{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		int mark1 , mark2 , mark3 , mark4;
		double average;
		String grade;
		
		System.out.println("enter marks for four subject: ");
		
		System.out.println("enter subject mark 1 : ");
		mark1 = input.nextInt();
		
		System.out.println("enter subject mark 2 : ");
		mark2 = input.nextInt();
		
		System.out.println("enter subject mark 3 : ");
		mark3 = input.nextInt();
		
		System.out.println("enter subject mark 4 : ");
		mark4 = input.nextInt();
		
		average = (mark1 + mark2 + mark3 + mark4 )/4.0;
		
		System.out.println();
			System.out.println("average is : " +average );
				
			
			if (average >= 75 ){
				grade = "Destintion";
				
			}else if (average >= 50){
				grade = "Credit";
				
			}else  {
				grade = "Fail";
			}
			System.out.println("Grade is :"+ grade);
			
			input.close();
	}
}