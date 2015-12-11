import java.util.TreeSet;


public class SetDemo {

	public static void main(String[] args) {
		//  No Duplicate + UnOrder
		// 1. HashSet<String> nameSet = new HashSet<>();
		// No Duplicate + Order (Insertion Order)
		// 2. LinkedHashSet<String> nameSet = new LinkedHashSet<>();
		// No Duplicate + Sorted (Asc)
		// 3. TreeSet<String> nameSet = new TreeSet<>();
		TreeSet<String> nameSet = new TreeSet<>();
		nameSet.add("ram");
		nameSet.add("ram");
		nameSet.add("ram");
		nameSet.add("ram");
		nameSet.add("mike");
		nameSet.add("mike");
		nameSet.add("mike");
		nameSet.add("tom");
		nameSet.add("amit");
		nameSet.add("amit");
		System.out.println(nameSet);
		
	}

}
