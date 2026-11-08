import java.util.Scanner;
public class IT26102778Lab7Q1B{
	public static void main(String[]args){
		int mark1, mark2, mark3, mark4, Student, Count;
		double avg;
		String grade="";
		Student=1;
		
		Scanner input=new Scanner(System.in);
		
		while(Student<=3){
		System.out.println("Student "+ Student);
		
		System.out.print("Enter subject Mark 1: ");
		mark1=input.nextInt();
		
		System.out.print("Enter subject Mark 2: ");
		mark2=input.nextInt();
		
		System.out.print("Enter subject Mark 3: ");
		mark3=input.nextInt();
		
		System.out.print("Enter subject Mark 4: ");
		mark4=input.nextInt();
		avg=(mark1+mark2+mark3+mark4)/4.0;
		
		if(100>=avg && avg>=75){
		grade="Distinction";}
		else if(74>=avg && avg>=50){
		grade="Credit";}
		else{
			grade="Fail";
		}
		
		System.out.println("Average is : "+avg);
		System.out.println("Overall Grade is : "+ grade);
		Student= Student+1;
		System.out.println("\n");
		}
	}
}
		