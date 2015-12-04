class A1
{
	int z =100;
	A1(){
		System.out.println("A Class Default Cons");
	}
	A1(int x){
		this();
		System.out.println("A Class Param Cons Call");
	}
	void show(){
		System.out.println("A Show");
	}
}
class B1 extends A1
{
	int z = 200;
	B1(){
		super(100);
		System.out.println("B Class Default Cons");
	}
	B1(int x){
		this();
		System.out.println("B Class Param Cons Call");
	}
	@Override
	
	void show(){
		super.show();
		System.out.println("B Show");
	}
}
class C1 extends B1{
	int z = 300;
	C1(){
		super(100);
		System.out.println("C Class Default Cons");
	}
	C1(int z){
		this();
		//super(900);
		System.out.println("C Class Param Cons Call");
		System.out.println(((A1)this).z + super.z + this.z + z);
	}
@Override
	
	void show(){
	super.show();	
	System.out.println("C Show");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		C1 obj = new C1(1000);
		obj.show();

	}

}
