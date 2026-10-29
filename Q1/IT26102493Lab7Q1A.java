import java.util.Scanner;
 public class IT26102493Lab7Q1A{
  public static void main(String[] args){
    
	Scanner input= new Scanner(System.in);
	double avg;
	int total;
	
	System.out.println("Enter mark subject 01");
	int num1=input.nextInt();
	
	System.out.println("Enter mark subject02");
	int num2=input.nextInt();
	
	System.out.println("Enter mark subject03");
	int num3=input.nextInt();
	
	System.out.println("Enter mark subject04");
	int num4=input.nextInt();
	
	total=num1+num2+num3+num4;
	avg=total/4;
	
	if(avg>=75){
	System.out.println("DESTICTION");
	}
	else if(avg>=50){
	System.out.println("CREDIT");
	}
	else{
	
	System.out.println("Fail");
	}
  }
 }