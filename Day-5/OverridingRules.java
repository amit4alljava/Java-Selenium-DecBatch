class X1{
	private int d;
	protected int e;
	 void disp(){
		System.out.println("X1 Disp");
	}
}
class Y1 extends X1
{
	@Override
	public void disp(){
		System.out.println("Y1 Disp");
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		

	}

}
