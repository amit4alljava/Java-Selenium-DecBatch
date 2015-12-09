
public class StringDemo3 {

	public static void main(String[] args) {
		String d = new String("Hello");
		String e = d;
		if(e==d){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
