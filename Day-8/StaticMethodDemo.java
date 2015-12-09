// Utility Class

// 100% Abstract Interface (Java 7)
// Java 8 (Interface have method defination )
// Utility Interface
interface MathOperations
{
	/*private MathOperations(){
		
	}*/
	static int sin(){
		return 90;
	}
	static int cos(){
		return 45;
	}
	static int tan(){
		return 90;
	}
}
// Utility Class
class Validation{
	private Validation(){}
	static boolean isBlank(String value){
		if(value!=null && value.length()>0){
			return false;
		}
		return true;
	}
}
class P2
{
	static int y;
	int x;  // Instance variable
	P2(){
		x = 100;  // Constructor Used to Initalize the Instance Variable
		System.out.println("I Will Every Time When Object is Created...");
	}
	static{
		y = 200;
		System.out.println("I Will Call When Class is Loaded...");
	}
	
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		P2 obj = new P2(); // Load the Class and then create the object
		P2 obj2 =new P2(); // So Only Object is Created
		P2 obj3 = new P2(); // Again Only Object is Created...
		
		//Validation obj = new Validation();
		//System.out.println(obj.isBlank("Ram"));
		//MathOperations obj = new MathOperations();
		//System s = new System();
		/*System.out.println("Hello Java");
		//MathOperations m = new MathOperations();
		System.out.println(m.sin());
		System.out.println(MathOperations.sin());
		//Validation validation = new Validation();
		System.out.println(Validation.isBlank(""));*/
	}

}
