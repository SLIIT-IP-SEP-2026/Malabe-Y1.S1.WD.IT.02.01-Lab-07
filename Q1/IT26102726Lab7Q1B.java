import java.util.Scanner;

public class IT26102726Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average;
        String grade;

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);

            System.out.print("Enter marks: ");
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
        }

     
    }
}