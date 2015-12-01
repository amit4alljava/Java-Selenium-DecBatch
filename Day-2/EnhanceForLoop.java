
public class EnhanceForLoop {

	public static void main(String[] args) {
		// From Java 5 is provide Enhance for loop
		// It is used to traverse an Array
		
		// Before Enhance for loop , how we can traverse an Array
		int x = 100; // this is a simple var and can hold single value
		int y[]={10,20,30,40,50,90,77,44}; // this is an array and can hold multiple values
		/*// Older way to traverse an Array
		for(int i = 0; i<y.length;i++){
			System.out.println(y[i]); 
		}*/
		// New Way (Enhance for Loop )
		for(int i : y){
			System.out.println(i);
		}
	}

}
