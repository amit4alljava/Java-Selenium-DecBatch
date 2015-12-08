// Utility Class
class MathOperations
{
	private MathOperations(){
		
	}
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
public class StaticMethodDemo {

	public static void main(String[] args) {
		//MathOperations m = new MathOperations();
		/*System.out.println(m.sin());*/
		System.out.println(MathOperations.sin());

	}

}
