public class Random {
	public static void main(String[] ars) {
		int n = (int)(Math.random() * 100);
		int d = n*999;
		char c = (char)(n);
		
		System.out.println("The Number: " + n + "." + d);
		System.out.println("Integer Part: " + n);
		System.out.println("Decimal Part: 0." + d);
		System.out.println("ASCII Code of " + n + ": " + c);
	}
}
