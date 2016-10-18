
import java.util.Scanner;

public class CheckOddEven {

	private static Scanner scanner;

	public static void main(String[] args) {


        scanner = new Scanner(System.in);
        
        int num ;
        System.out.print("Enter a integer : ");
		num = scanner.nextInt() ;
		
		if (num%2 == 0)
		System.out.printf("The input integer is Even Number.");
		
		else if (num%2 != 0)
		System.out.printf("The input integer is Odd Number.");
		
		
	
		
	}
	

}
