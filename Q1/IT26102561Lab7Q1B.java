import java.util.Scanner;
public class IT26102561Lab7Q1B {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        for (int studentNo = 1; studentNo <= 3; studentNo++){
            System.out.println("Student " + studentNo);
            System.out.print("Enter marks: ");

            int sum = 0;
            for (int subject = 0; subject < 4; subject++){
                sum = sum + input.nextInt();
            }

            double average = sum / 4.0;
            System.out.print("Average is : " + average);

            if (average >= 75){
                System.out.println("\nOverall Grade is : Distinction\n");
            }
            else if (average >=50){
                System.out.println("\nOverall Grade is : Credit\n");
            }
            else{
                System.out.println("\nOverall Grade is : Fail\n");
            }
        }
    }  
}