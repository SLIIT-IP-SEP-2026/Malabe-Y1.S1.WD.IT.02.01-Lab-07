import java.util.Scanner;

public class IT26102604Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, average;
        String grade;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);

            System.out.print("Enter marks: ");
            mark1 = input.nextDouble();
            mark2 = input.nextDouble();
            mark3 = input.nextDouble();
            mark4 = input.nextDouble();

            average = (mark1 + mark2 + mark3 + mark4) / 4;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        input.close();
    }
}