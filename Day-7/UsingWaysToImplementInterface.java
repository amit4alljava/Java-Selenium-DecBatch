import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

// SAM (Single Abstract Method ) Interface
@FunctionalInterface
interface MyInterface
{
	
	void show();
	//void print();
}

interface Calculator
{
	final int MAX_VALUE = 100;
	int calc(int a, int b );
}
class Add implements Calculator{
	public int calc(int a , int b){
		return a + b + MAX_VALUE;
	}
}
class Subtract implements Calculator{
	public int calc(int a , int b){
		return a - b;
	}
}
// 1st Way
class InterfaceImpl implements MyInterface{
	@Override
	public void show(){
		System.out.println("MyInterface Show Function call");
	}
}
public class UsingWaysToImplementInterface {

	public static void main(String[] args) {
		/*InterfaceImpl obj = new InterfaceImpl();
		obj.show();*/
		
		
		/*int a = 100;
		if(a==100){
			// 2nd Way
			// Anonymous Class Defination
			// Lazy Loading of a Class
			// Class Create + Object Create + Interface Implement + method override
			MyInterface obj2 = new MyInterface(){
				@Override
				public void show(){
					System.out.println("This is an Anonymous Class");
				}
			};
			obj2.show();
		}*/
		// 3rd Way (Lambda Expression Java 8)
		// Lazy Way
		// Class Create + Object Create + Interface Implement + method override

		/*MyInterface obj3 = ()->{
			System.out.println("This is Lambda Example1");
			System.out.println("This is Lambda Example2");
			System.out.println("This is Lambda Example3");
		};
		obj3.show();*/
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("1. Add");
		System.out.println("2. Subtract ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		System.out.println("Enter the Choice...");
		int choice = scanner.nextInt();
		if(choice == 1){
			// Simple Class
			Add obj = new Add();
			int result = obj.calc(100, 200);
			/*Calculator obj = (a,b)->a+b;
			int result = obj.calc(100, 200);*/
			System.out.println("Add Result is "+result);
		}
		else
		if(choice == 2){
			// Anonymous Class
			Calculator obj = new Calculator(){
				@Override
				public int calc(int a, int b){
					return a + b +MAX_VALUE;
				}
			};
			int result = obj.calc(1000, 2000);
			/*Calculator obj = (a,b)->a-b;
			int result = obj.calc(100, 200);*/
			System.out.println("Subtract Result is "+result);
		}
		else
			if(choice == 3){
				// Lambda Class
				Calculator obj = (a,b)->a*b;
				int result = obj.calc(100, 200);
				System.out.println("Multiply Result is "+result);
			}
			else
				if(choice == 4){
					Calculator obj = (a,b)->a/b;
					int result = obj.calc(100, 2);
					System.out.println("Divide Result is "+result);
				}
				else
				{
					System.out.println("Wrong Choice ");
					break;
				}
		}
	}

}
