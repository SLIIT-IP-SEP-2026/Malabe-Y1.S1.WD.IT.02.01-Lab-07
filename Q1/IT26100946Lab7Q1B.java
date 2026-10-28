import java.util.Scanner;
public class IT26100946Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int student=0;
		int i=0;
		double sum=0;
		double average=0;

        for ( student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

             sum = 0;
            for ( i = 0; i < 4; i++) {
                sum += scanner.nextDouble();
            }

             average = sum / 4.0;

            String grade;
            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            } else if (average >= 50 && average <= 74) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        scanner.close();
    }
}