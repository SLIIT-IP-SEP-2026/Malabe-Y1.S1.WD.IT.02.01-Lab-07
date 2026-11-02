import java.util.Scanner;
	public class IT26102684Lab7Q1A{
		public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		int mark1, mark2, mark3, mark4;
		double avg;
		
		System.out.println("Enter marks for four subjects: ");
		
		System.out.print("Enter subject Mark1: ");
		mark1 = input.nextInt();
		
		System.out.print("Enter subject Mark2: ");
		mark2 = input.nextInt();
		
		System.out.print("Enter subject Mark3: ");
		mark3 = input.nextInt();
		
		System.out.print("Enter subject Mark4: ");
		mark4 = input.nextInt();
		
		avg = (mark1+mark2+mark3+mark4)/4.0 ;
		
				
		System.out.println("The avg is : "+ avg );
		
		if (avg >=75 && avg<=100){
			System.out.println("The grade is : Distination");
		}
		
		else if (avg >=50 && avg<=74){
			System.out.println("The grade is : Credit");
		}
		
		else if (avg >=0 && avg<=49) {
			System.out.println("The grade is : Fail");
		}
		
		}
	}