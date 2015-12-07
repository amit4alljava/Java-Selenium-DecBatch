interface W
{
	void show();
}
interface R
{
	void show();
}
// Multiple Inheritance in Java (IN Case of Interfaces it is supported)
interface P extends W,R{
	void print();
}

class P1 implements P{
	@Override
	public void print(){
		System.out.println("P1 Print Call");
	}
	@Override
	public void show(){
		System.out.println("P1 Show Call");
	}
}

public class UseInterfaces {

	public static void main(String[] args) {
		P1 obj = new P1();
		obj.show();
		obj.print();

	}

}
