interface T1
{
	void print();
}
// 1st way to Implement the Interface
class T2 implements T1{
	@Override
	public void print(){
		System.out.println("T2 Print Call");
	}
}
public class InterfaceImplementationWays {

	public static void main(String[] args) {
		/*T2 obj = new T2();
		obj.print();*/
		
		// 2nd Way to implement the interface (Anonymous Class)
		//class _____ implements T1{
		// override the method
		// create an object
		T1 obj2 = new T1(){
			@Override
			public void print(){
				System.out.println("Anonymous Print Call");
			}
		};
		obj2.print();
		
		

	}

}
