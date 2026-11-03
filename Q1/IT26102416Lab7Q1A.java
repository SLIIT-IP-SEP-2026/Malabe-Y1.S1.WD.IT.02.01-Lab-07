import java.util.Scanner;

public class IT26102416Lab7Q1A {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int mark1,mark2,mark3,mark4;
		double avg;
		
		System.out.println( "Enter msrks for four subjects: ");
		
		System.out.println( "Enter subject Mark1:");
		mark1 = input.nextInt();
		
		System.out.println( "Enter subject Mark2:");
		mark2= input.nextInt();
		
		System.out.println( "Enter subject Mark3:");
		mark3= input.nextInt();
		
		System.out.println( "Enter subject Mark4:");
		mark4= input.nextInt();
		
		avg = (mark1+mark2+mark3+mark4) / 4.0;
		
		System.out.println("The avg is: " + avg);
		
		if(avg>=75&&avg<=100){
			
		System.out.println("The grade is: Distination");
		}
		else if (avg>=50&&avg<=74){
		System.out.println("The grade is credit");
		}
		else if(avg>=0&&avg<=49) {
		System.out.println("The grade id:Fail");
		}
	}
}	
			
		
		
		
		
		
		
		
		