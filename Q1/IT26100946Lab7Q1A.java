import java.util.Scanner;
public class IT26100946Lab7Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[4];
        double sum = 0;

        System.out.println("Enter marks for four subjects:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }

        double average = sum / 4;

        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        }
		else if (average >= 50 && average <= 74) {
            grade = "Credit";
        }
		else {
            grade = "Fail";
        }

        System.out.println("\nAverage is : " + average);
        System.out.println("Overall grade is : " + grade);
        sc.close();
    }
}