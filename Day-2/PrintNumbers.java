import java.util.Scanner;


public class PrintNumbers {

	public static void main(String[] args) {
		// 4 kind of Loops
		// 1. while loop
		/*int i = 1;  // Start Point
		while(i<=10){  // Loop start
			System.out.println("I is "+i);
			if(i==5){
			i = i + 3;
			}
			else
			{
				i =  i + 1;
			}
			//i--;  // i = i + 1
		} // Loop ends
*/	
		// 2. for loop
		/*for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		*/
		/*int i = 1;
		for(;i<=10;){
			if(i==5){
				i = i + 3;
				}
				else
				{
					i =  i + 1;
				}
		}
		*/
		// 3rd Loop
		// do while
		int i = 1;
		int choice = 0;
		do{
			//System.out.println("I Will execute at least once");
			System.out.println("1. Pizza");
			System.out.println("2. Soft Drink");
			System.out.println("3. Burger");
			System.out.println("Press 0 to Quit");
			System.out.println("Enter your choice");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch(choice){
			default:
				System.out.println("Wrong Choice...");
				break;	
			case 1:
				System.out.println("Thanks for Ordering Pizza , Bill is 220 rs");
				break;
			case 2:
				System.out.println("Thanks for Order Soft Drink , Bill is 50 rs");
				break;
			case 3:
				System.out.println("Thanks for Order Burger , Bill is 99 rs");
				break;
			
			}
		}while(choice!=0);  // when choice is zero it will exist from a loop

	}

}
