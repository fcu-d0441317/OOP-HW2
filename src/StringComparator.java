import java.util.Scanner;

public class StringComparator {
	
	private static Scanner scanner;

	public static void main(String[] args) {

        scanner = new Scanner(System.in);
        
        String str1 ,str2;
        
        
        
        System.out.print("Enter a string1 : ");
        str1 = scanner.next();
		System.out.print("Enter a string2 : ");
        str2 = scanner.next();
        
		int a = str1.compareToIgnoreCase(str2);
		
		if (a == 0)
			System.out.print("The two strings are the same.");
		else 
			System.out.print("The two strings are not the same.");
		
		
		
		

	}


}
