class Parent
{
	void show(){
		System.out.println("This is Parent Show");
	}
	void print(){
		System.out.println("This is the Parent Print");
	}
}
class Child extends Parent
{
	@Override
	void show(){
		System.out.println("This is Overriding in Child Class");
	}
	void disp(){
		System.out.println("This is Child CLass DIsp");
	}
}
class Child2 extends Parent
{
	@Override
	void show(){
		System.out.println("This is Child2 Class Show Overridden...");
	}
}
public class UpcastingDemo {
	
	static void caller(Parent obj){
		obj.show();
		obj.print();
		
	}
	
	public static void main(String[] args) {
		caller(new Child());
		System.out.println("******************************");
		caller(new Child2());
		
		/*Child child = new Child();
		child.show();
		child.print();
		
		Child2 child2 = new Child2();
		child2.show();
		child2.print();
*/		//child.disp();

	}

}
