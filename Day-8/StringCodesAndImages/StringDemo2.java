// String maintain a String Pool
// String is Immutable (String Object can't be modify when 
// change in it , it will create the fresh memory every time).
public class StringDemo2 {

	public static void main(String[] args) {
		/*String a ="amit";
		String b = "amit";
		a = "ram";*/
		String a = new String("amit");
		String b = new String("amit");
		if(a.equals(b)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same value");
		}
		if(a==b){
			System.out.println("Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}
		
	}

}
