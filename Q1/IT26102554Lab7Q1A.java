import java.util.Scanner;

public class IT26102554Lab7Q1A{
    public static void main(String[] args){
		
	int M1,M2,M3,M4,total;
	double avg;
	String Grade;
	
	Scanner input = new Scanner(System.in);
	

	System.out.println("Enter marks (0-100)");
		M1 = input.nextInt();
		System.out.println("Enter marks (0-100)");
		M2 = input.nextInt();
		System.out.println("Enter marks (0-100)");
		M3 = input.nextInt();
		System.out.println("Enter marks (0-100)");
		M4 = input.nextInt();
		
		total = M1+M2+M3+M4;
		avg = total / 4;
		
		if (avg >=75){
			Grade = "Distinction";
		}
		else if (avg <=74){
			Grade = "Credit";
		}
		else{
			Grade = "Fail";
		}
		System.out.println();
		System.out.println("Avrage is : "+avg);
		System.out.println("Grade is " +Grade);
	}
}