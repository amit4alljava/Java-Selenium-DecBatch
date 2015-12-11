import java.util.HashMap;
import java.util.TreeSet;


public class NestedCollections {

	public static void main(String[] args) {
		HashMap<String,TreeSet<Integer>> phoneMap = new HashMap<>();
		
		TreeSet<Integer> amitPhones = new TreeSet<>();
		amitPhones.add(2222);
		amitPhones.add(1111);
		amitPhones.add(2222);
		amitPhones.add(3333);
		phoneMap.put("amit",amitPhones);
		
		TreeSet<Integer> mikePhones = new TreeSet<>();
		mikePhones.add(6666);
		mikePhones.add(4444);
		mikePhones.add(4444);
		mikePhones.add(3333);
		
		phoneMap.put("mike",mikePhones);
		
		System.out.println("Amit Phones are "+phoneMap.get("amit"));
		
		
	}

}
