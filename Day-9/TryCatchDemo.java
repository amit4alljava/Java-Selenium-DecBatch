import java.util.Scanner;


public class TryCatchDemo {

	public static void main(String[] args) {
		int result  = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First No");
		int firstNo = scanner.nextInt();
		System.out.println("Enter the Second No");
		int secondNo = scanner.nextInt();
		try{
		result  = firstNo/secondNo; // throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a Number with Zero "+e);
		}
		// this is a block which always execute , it means if exception
		// is occured or not it always run
		finally{
			// resource clean up
			scanner.close();
		}
		System.out.println("Result is "+result);

	}

}
