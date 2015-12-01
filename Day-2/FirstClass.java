import java.util.Scanner;


public class FirstClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int b = scanner.nextInt();
		//int a = Integer.parseInt(args[0]);
		//int b = Integer.parseInt(args[1]) ;
		int c = a + b;
		System.out.println("Sum is "+c);

	}

}
