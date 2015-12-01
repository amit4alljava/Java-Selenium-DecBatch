import java.util.Scanner;


public class UseOfFinal {

	public static void main(String[] args) {
		final int MIN_AGE = 16;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age ");
		int age = scanner.nextInt();
		if(age>=MIN_AGE){
			System.out.println("U Can Vote");
		}
		else{
			System.out.println("U can't Vote");
		}
		if(age>=MIN_AGE){
			System.out.println("U Can Apply for Driving License");
		}
		else{
			System.out.println("U Can't Apply for DL");
		}
		//MIN_AGE ++;
		//MIN_AGE = 21;
	}

}
