import java.util.Scanner;
public class IT26102449Lab7Q1B{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		
		int std,mark,count;
		double avg,sum;
		String Grade="";
		
		
		for(std=1;std<=3;std++){
			System.out.println("Student "+std); 
			sum=0;
			System.out.print("Enter marks: ");
			for(count=1;count<=4;count++){
				mark=input.nextInt();
				sum+=mark;
			}
			
			
			avg=(double)sum/4;
			if(avg>=0&&avg<=100){
				if(avg>=75){
					Grade="Distinction";
				}
				else if(avg>=50){
					Grade="Credit";
				}
				else{
					Grade="Fail";
				}
			}
			
			else{
				System.out.println("Error: Please check the marks again.");
			}
			System.out.println("Average is: "+avg);
			System.out.println("Overall Grade is: "+Grade);
			System.out.println("\n");
		}
	}
}