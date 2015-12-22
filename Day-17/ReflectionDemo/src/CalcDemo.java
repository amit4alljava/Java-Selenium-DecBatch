import java.lang.reflect.Method;
import java.util.Scanner;

class Calc{
	public int add(int ...x){
		int s = 0;
		for(int z : x){
			s =s  + z;
		}
		return s;
	}
	public int subtract(int ...x){
		int s = 0;
		for(int z : x){
			s =s  - z;
		}
		return s;
	}
	public int multiply(int ...x){
		int s = 1;
		for(int z : x){
			s =s  * z;
		}
		return s;
	}
	public int divide(int ...x){
		int s = 0;
		for(int z : x){
			s =s  + z;
		}
		return s/x.length;
	}
	public void show(int...x){
		
	}
}
public class CalcDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("type add for addition");
		System.out.println("type subtract for subtraction");
		System.out.println("type multiply for multiply");
		System.out.println("type divide for division");
		System.out.println("Enter the Choice...");
		Scanner scanner =new Scanner(System.in);
		String choice = scanner.next();
		//Calc calc = new Calc();
		int result = 0;
		//Reflection Style
		// Create Object
		int w[]={};
		Object object = Class.forName("Calc").newInstance();
		Method method = object.getClass().
				getDeclaredMethod(choice );
		result =(Integer)method.invoke(object, 100,2,89,434);
		
		//Calc calc = new Calc();
		// Traditional Style of Coding
		/*if(choice.equals("add")){
			result = calc.add(100, 200);
		}
		else
		if(choice.equals("subtract")){
			result = calc.subtract(100, 200);
		}
		else
		if(choice.equals("multiply")){
			result = calc.multiply(100, 200);
		}
		else
		if(choice.equals("divide")){
			result = calc.divide(100, 2);
		}*/
		System.out.println("Result is "+result);
		
	}

}
