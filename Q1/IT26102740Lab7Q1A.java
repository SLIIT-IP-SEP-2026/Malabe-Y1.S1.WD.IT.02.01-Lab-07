import java.util.Scanner;
public class IT26102740Lab7Q1A{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        double mark, total = 0, average;

        System.out.println("Enter marks for 4 subjects");

        for(int i = 1; i <= 4 ; i++){
            System.out.print("Enter the mark for subject "+ i +" :");
            mark = input.nextDouble();
            total = total + mark;
        }
        average = total / 4;
        System.out.print("Average is : "+average);

        if (average <= 100 && average >= 75){
            System.out.print("Distinction");
        }
        else if(average <= 74 && average >= 50){
            System.out.println("Credit");
        }
        else if(average <= 49 && average >= 0){
            System.out.println("Fail");
        }
        
    }
}
