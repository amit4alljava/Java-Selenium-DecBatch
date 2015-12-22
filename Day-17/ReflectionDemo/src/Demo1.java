import java.util.Scanner;
import java.util.Scanner;

class A
{
	 A(){
		System.out.println("A Class Cons Call");
	}
}
class B
{
	B(){
		System.out.println("B Class Cons Call");
	}
	
}
class C
{
	C(){
		System.out.println("C Class Cons Call");
	}
}
public class Demo1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println("Enter the Class Name Which Object is I want to Create.");
		Scanner scanner = new Scanner(System.in);
		String className = scanner.next();
		//A obj = new A();
		//A1 obj = new A1(); 
		// Dynamic or Runtime Way or LAZY WAY
		Class.forName(className).newInstance();  
		/*if(className.equalsIgnoreCase("A")){
			A obj = new A(); // Static or Compile Time Way or Eager WAY
		}
		else
			if(className.equalsIgnoreCase("B")){
				B obj = new B();
			}	
			else
				if(className.equalsIgnoreCase("C")){
					C obj = new C();
				}*/	
	}

}
