//final class A
class A
{
	final int MIN_AGE =18;  // to define the constant
//final void disp(){
	void disp(){
	int age = 21;
	if(age>MIN_AGE){
		System.out.println("Age is Greater than 18");
	}
	else
	{
		System.out.println("Not Greater than 18");
	}
	System.out.println("A Disp");
}
}
class B extends A
{
	@Override
	void disp(){
		System.out.println("B Disp");
	}
}
public class UseOfFinalDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.disp();

	}

}
