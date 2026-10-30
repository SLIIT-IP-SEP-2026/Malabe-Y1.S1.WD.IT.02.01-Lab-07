import java.util.Scanner;

public class IT26102776Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        int studentCount = 1; 

       
        while (studentCount <= 3) {
            System.out.println("Student " + studentCount);
            System.out.print("Enter marks: ");
            
            
            int m1 = input.nextInt();
            int m2 = input.nextInt();
            int m3 = input.nextInt();
            int m4 = input.nextInt();

            double average = (m1 + m2 + m3 + m4) / 4.0;
            String grade = "";

            if (average >= 75.0 && average <= 100.0) {
                grade = "Distinction";
            } else if (average >= 50.0 && average <= 74.0) {
                grade = "Credit";
            } else if (average >= 0.0 && average <= 49.0) {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade + "\n");

            studentCount++; 
        }
        input.close();
    }
}