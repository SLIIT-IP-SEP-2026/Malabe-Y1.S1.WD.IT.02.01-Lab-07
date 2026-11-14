import java.util.Scanner;

public class IT26102744Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int s = 1; s <= 3; s++) {
            System.out.println("Student " + s);
            System.out.print("Enter marks: ");

            int total = 0;
            for (int i = 0; i < 4; i++) {
                total += sc.nextInt();
            }

            double avg = total / 4.0;
            String grade;

            if (avg >= 75) {
                grade = "Distinction";
            } else if (avg >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + avg);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
        sc.close();
    }
}
