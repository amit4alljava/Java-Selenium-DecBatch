import java.util.Map;
import java.util.TreeMap;


public class MapDemo {

	public static void main(String[] args) {
		/*ArrayList<Integer> phones = new ArrayList<>();
		phones.add(22222);
		phones.add(33333);
		phones.add(43333);
		phones.add(53333);
		phones.add(363333);
		phones.add(37333);*/
		// Map will work on key and value
		// In Map key cannot be duplicate
		// 1. HashMap key cannot be duplicate + UnOrder
		// 2. HashMap key cannot be duplicate + Key Order (Insertionorder)
		// 2. TreeMap key cannot be duplicate + Key Sorted (Insertionorder)
		TreeMap<String,Integer> phoneMap = new TreeMap<>();
		phoneMap.put("shyam",445555);
		phoneMap.put("amit",44444);
		phoneMap.put("ram",22222);
		
		phoneMap.remove("ram");
		//System.out.println("Ram Phone is "+phoneMap.get("ram"));
		//System.out.println("Amit Phone is "+phoneMap.get("amit"));
		
		// Traverse the Entire Map
		for(Map.Entry<String, Integer> m :  phoneMap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
