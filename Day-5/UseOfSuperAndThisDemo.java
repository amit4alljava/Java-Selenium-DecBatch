class Parent{
	int x = 100;
	int y ;
	Parent(){
		y = 1000;
		System.out.println("This is Parent Class Default Cons "+y);
	}
	Parent(int x){
		this();
		System.out.println("This is the Parent Class Param Cons Call ");
	}
	void show(){
		System.out.println("Parent Class Show Function");
	}
}
class Child extends Parent
{
	int x = 200;
	int z =2000;
	Child(){
		//super();
		super(1000);
		z = z + y;
		System.out.println("This is Child Class Default Cons "+z);
	}
	Child(int x){
		this();
		//super();
		//super(1000);  // Call to the Parent Class Param Cons
		System.out.println("This is Child Class param Cons Call");
		//System.out.println(super.x + this.x + x);
	}
	@Override
	void show(){
		
		System.out.println("Child Class Show Function");
		super.show();
	}
	
}
public class UseOfSuperAndThisDemo {

	public static void main(String[] args) {
		Child obj = new Child(1000);
		//obj.show();

	}

}
