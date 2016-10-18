import java.util.Scanner;

public class KeyboardScanner {

	private static Scanner scanner;

	public static void main(String[] args) {

        scanner = new Scanner(System.in);
        
        int num1 ;
		float num2 ;
		String name ;
		
		System.out.print("Enter a integer : ");
		num1 = scanner.nextInt() ;
		System.out.print("Enter a float point number : ");
		num2 = scanner.nextFloat();
		System.out.print("Enter your name :");
		name = scanner.next();
		
		
		System.out.printf("Hi %s,the multiplication of %d and %f is %.2e.",name,num1,num2,num1*num2);
		
		
		
		

	}

}
