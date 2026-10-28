public class IT26102740Lab7Q2B{
    public static void main(String[]args){
        
        for ( int i = 1 ; i <= 5 ; i++){
            System.out.print( i +" - ");
            for(int x = 1 ; x <= i ; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}