import java.util.Scanner;
public class IT26300571Lab7Q1B {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		int Student =1;

		while (Student <=3){

		System.out.println( " Student : " + Student);

		System.out.print(" Enter marks");
		int mark1 = input.nextInt();
		int mark2 = input.nextInt();
		int mark3 = input.nextInt();
		int mark4 = input.nextInt();

		int sum = mark1 + mark2+ mark3+ mark4;
		double avg = sum/4.0;
		String grade;

			if ( avg >= 75) {
				grade = " Destintion";

			}else if ( avg >= 50 || avg < 75){
				grade = " Credit";

			}else {
			     grade = "Fail";
			}
			System.out.println( "Average is :" + avg);
			System.out.println( "Overall grade is :" + grade);
			Student++;
		}
	}
}












