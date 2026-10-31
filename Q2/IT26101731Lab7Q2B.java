public class IT26101731Lab7Q2B{
    public static void main(String[] args){
	
	int rows=5;
	int number=1;
	int rowcount,columncount;
	
	for(rowcount=0;rowcount<rows;rowcount++){
		System.out.print(number+" - ");
	    for(columncount=0;columncount<number;columncount++){
		    System.out.print("* ");
		    }
			System.out.println();
            number++;			
		}
	}
}