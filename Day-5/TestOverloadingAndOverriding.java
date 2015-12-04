class X
{
void show(){
	System.out.println("X Show");
}
}
class Y extends X
{
	void show(){
		System.out.println("Y Show");
	}
}
public class TestOverloadingAndOverriding {

	public static void main(String[] args) {
		Y obj = new Y();
		obj.show();
		//obj.show(100);

	}

}
