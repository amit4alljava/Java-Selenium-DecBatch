interface K
{
	void show();
}
interface K2
{
	void print(); // Declare of a method(abstract)
}

class Q implements K
{
	//Defination of a method
	public void show(){
		System.out.println("Q Show");
	}
}

class Q2 extends Q implements K, K2
{

	@Override
	public void show() {
		super.show();
		System.out.println("Q2 Show");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void print(){
		System.out.println("Q2 Print...");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Q2 obj = new Q2();
		obj.show();
		obj.print();
	}

}
