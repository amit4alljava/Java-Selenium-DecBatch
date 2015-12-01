import java.util.Scanner;


public class OrderBookingSystem {

	public static void main(String[] args) {
		System.out.println("1. Pizza");
		System.out.println("2. Soft Drink");
		System.out.println("3. Burger");
		System.out.println("Enter your choice");
		final int PIZZA = 1;
		final int SOFTDRINK = 2;
		final int BURGER = 3;
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice){
		default:
			System.out.println("Wrong Choice...");
			break;	
		case PIZZA:
			System.out.println("Thanks for Ordering Pizza , Bill is 220 rs");
			break;
		case SOFTDRINK:
			System.out.println("Thanks for Order Soft Drink , Bill is 50 rs");
			break;
		case BURGER:
			System.out.println("Thanks for Order Burger , Bill is 99 rs");
			break;
		
		}
		/*if(choice == 1){
			System.out.println("Thanks for Ordering Pizza , Bill is 220 rs");
		}
		else
		if(choice == 2){	
			System.out.println("Thanks for Order Soft Drink , Bill is 50 rs");
		}
		else
		if(choice == 3)	
		{	
			System.out.println("Thanks for Order Burger , Bill is 99 rs");
		}
		else
		{
			System.out.println("Wrong Choice...");
		}
*/
	}

}
