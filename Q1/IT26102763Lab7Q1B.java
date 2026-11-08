
import java.util.Scanner;

public class IT26102763Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		double marks1,marks2,marks3,marks4,average;
		String grade;

        for (int i = 1; i <= 3; i++) {
			System.out.print("Student " + i);

			System.out.print("Enter marks: ");
            marks1 = input.nextDouble();
            marks2 = input.nextDouble();
            marks3 = input.nextDouble();
            marks4 = input.nextDouble();

            average = (marks1 + marks2 + marks3 + marks4) / 4.0;

            System.out.println("Average is : " + average);

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
			
            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is :"+grade);			
            System.out.println();
        }
    }
}
