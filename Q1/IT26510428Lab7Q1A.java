import java.util.Scanner;
public class IT26510428Lab7Q1A{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int count,mark;
		double sum,avg;
		sum=0;
		String Grade="";
		for(count=1;count<=4;count++){
			System.out.print("Enter Subject Mark "+count+":");
			mark=input.nextInt();
			sum+=mark;
		}
		avg=sum/4;
		if(avg>=0&&avg<=100){
			if(avg>=75){
			Grade="Distinction";
			}
			else if(avg>=50){
			Grade="Credit";
			}
			else if(avg<49){
			Grade="Fail";
			}
			System.out.println("Average is :"+avg);
			System.out.println("Overall Grade is :"+Grade);
		}
		else{
			System.out.println("Error: Please check marks again");
		}
	}
}
