// What is String
// String is a collection of Characters
//"amit" is a string
// String is a predefine class in Java
// String is a final class in Java
// String use a String Pool to Handle the String
public class StringDemo1 {

	public static void main(String[] args) {
		String a = "amit";  // String literal
		String b ="amit";
		String c = new String("Amit");  // String new Object create
		// This will check the reference
		if(a==c){
			System.out.println("Same Reference");
		}
		else
		{
			System.out.println("Not Same Reference");
		}
		// this will check the Value
		//if(a.equals(c)){  // it is case sensitive
		if(a.equalsIgnoreCase(c)){	
			System.out.println("Same value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		char w = 'a';

	}

}
