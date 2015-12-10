import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatchDemo2 {

	public static void main(String[] args) {
		int result  = 0;
		int firstNo = 0;
		int secondNo = 0;
		Scanner scanner = new Scanner(System.in);
		try{
		System.out.println("Enter the First No");
		firstNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed U Enter Character "+e);
			System.out.println("Enter the First No");
			scanner.nextLine();
			 firstNo = scanner.nextInt();
			
		}
		try{
		System.out.println("Enter the Second No");
		secondNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed U Enter Character "+e);
			System.out.println("Enter the Second No");
			scanner.nextLine();
			secondNo = scanner.nextInt();
			
		}
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
