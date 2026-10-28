public class IT26100946Lab7Q2B {
    public static void main(String[] args) {
        int i =0;
		int a =0;
        for ( i = 1; i <= 5; i++) {            
            System.out.print(i + " - ");                       
            for ( a = 1; a <= i; a++) {
                System.out.print("* ");
            }          
            System.out.println();
        }
    }
}