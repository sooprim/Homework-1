import java.util.Scanner;
public class Salary 
{
	public static void main(String[] args) 
	{
		Scanner name = new Scanner(System.in);
		System.out.println("Enter Name:");
		String n = name.nextLine();
		
		Scanner money = new Scanner(System.in);
		System.out.println(n + "'s Gross Salary:");
		int gross = money.nextInt();
		
		double statetax = gross * (28.4/100.0);
		double personaltax;
		
		double temp = gross - statetax - 7000;
		if(temp>0)
			personaltax = temp*(10.0/100.0);
		else
			personaltax = 0;
		
		double net = gross - statetax - personaltax;

		System.out.println(n + "'s NET Salary: $" + Math.round(net));
		System.out.println(n + "'s State Taxes: $"+Math.round(statetax));
		System.out.println(n + "'s Personal Tax: $"+Math.round(personaltax));
	}
}
