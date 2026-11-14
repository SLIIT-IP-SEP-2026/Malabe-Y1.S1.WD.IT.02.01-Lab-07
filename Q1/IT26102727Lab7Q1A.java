import java.util.Scanner;
public class IT26102727Lab7Q1A{
public static void main(String[] args){

int subject1,subject2,subject3,subject4;
double average;

Scanner input=new Scanner(System.in);

System.out.println("Enter the marks of subject1:");
subject1=input.nextInt();

System.out.println("Enter the marks of subject2:");
subject2=input.nextInt();

System.out.println("Enter the marks of subject3:");
subject3=input.nextInt();

System.out.println("Enter the marks of subject4:");
subject4=input.nextInt();

average=(subject1+subject2+subject3+subject4)/4.0;

System.out.println("average:"+average);

if (average >= 75 && average <= 100) {
    System.out.println("Distinction");
}
else if (average >= 50 && average < 75) {
    System.out.println("Credit");
}
else {
    System.out.println("Fail");
}
	

}
}