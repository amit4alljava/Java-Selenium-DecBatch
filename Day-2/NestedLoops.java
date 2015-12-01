
public class NestedLoops {

	public static void main(String[] args) {
		amit:
		for(int i = 1 ; i<=3 ; i++){
			for(int j = 1 ; j<=3 ; j++){
				if(i==j){
					continue amit; // skip the current loop
					//break;  // exit from the current loop
				}
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
