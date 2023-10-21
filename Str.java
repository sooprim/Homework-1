import java.util.Scanner;
public class Str {
	public static void main(String[] ars){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = scan.nextLine();
		int length = str.length();
		
		char first = str.charAt(0);
		char middle = str.charAt(length / 2);
		char last = str.charAt(length - 1);
		
		int code1 = (int)first;
		int code2 = (int)middle;
		int code3 = (int)last;
		int sum = first + middle + last;
		int biggest;
				
		System.out.println("'" + str + "' has " + length + " characters");
		System.out.println("First character: " + first);
		System.out.println("Middle character: " + middle);
		System.out.println("Last character: " + last);
		System.out.println("Sum of characters: " + sum);
		
		if(code1 > code2 && code1 > code3)
		{
			biggest = code1;
			System.out.println("Biggest character: '"+first+"', with value of "+biggest);
		}
		else if(code2 > code1 && code2 > code3)
		{
			biggest = code2;
			System.out.println("Biggest character: '"+middle+"', with value of "+biggest);
		}
		else if(code3 > code2 && code3 > code1)
		{
			biggest = code3;
			System.out.println("Biggest character: '"+last+"', with value of "+biggest);
		}
	}
}
