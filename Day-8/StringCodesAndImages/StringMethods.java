
public class StringMethods {

	public static void main(String[] args) {
		String a = "Hello";
		//System.out.println(a.length()); 
		//System.out.println(a.charAt(4));
		//String b = a.toUpperCase();
		/*String b = a.toLowerCase();
		System.out.println(b);
		System.out.println(a);
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}*/
		/*String c = "      Amit     Srivastava       ";
		System.out.println("Hello "+c+" Hi");
		System.out.println("Hello "+c.trim()+" Hi");*/
		// trim() it used to remove the leading and trailing spaces
		/*String d = "amit@yahoo.com";
		if(d.indexOf("@")!=-1 && d.indexOf(".")!=-1){
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Not valid Email");
		}*/
		/*String x = "Hello";
		System.out.println(x.indexOf("l"));
		System.out.println(x.lastIndexOf("l"));
		*/
		
		/*String y = "amit@yahoo.com";
		System.out.println(y.endsWith("yahoo.com"));
		System.out.println(y.startsWith("amit"));
		
		String z ="Hello How are you";
		System.out.println(z.substring(6,13));
		*/
		
		String b1 = "A-21, Shakti Nagar , Delhi-7";
		String  ee [] = b1.split(",");
		System.out.println("Plot No "+ee[0]);
		System.out.println("Area "+ee[1]);
		System.out.println("City "+ee[2]);
		
	}

}
