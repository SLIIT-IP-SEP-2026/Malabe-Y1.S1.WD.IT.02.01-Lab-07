import java.util.Scanner;

 public class IT26102764Lab7Q1A{

    public static void main ( String[] args){

    // define the variables
     int sub1,sub2,sub3,sub4;
     double avg;
    String grade;
 
    // create the object 
      Scanner input = new Scanner(System.in);

    // get user inputs for the variables
      System.out.println("Enter marks for the subjects:");
      System.out.println(" Enter Subject mark 1:");
      sub1= input.nextInt();

      System.out.println("Enter Subject mark 2:");
      sub2= input.nextInt();

      System.out.println("Enter Subject mark 3:");
      sub3= input.nextInt();

      System.out.println("Enter Subject mark 4:");
      sub4= input.nextInt();

    // calculate the average
      avg= (sub1+sub2+sub3+sub4)/4.0;

    // grade presenting loop
     if ((avg>=75)&&(avg<=100)){
        grade= "Distinction";
     }
     else if ((avg>=50)&&(avg<=74)){
        grade= "Credit";
     }
     else{
        grade= "Fail";
     }

    // print average and the credit
      System.out.println();
      System.out.println("Average is:"+ avg);
      System.out.println("Overall Grade is :"+ grade);

    }
 }