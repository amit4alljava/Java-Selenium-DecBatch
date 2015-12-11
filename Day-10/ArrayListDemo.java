import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListDemo {

	public static void main(String[] args) {
		// CRUD operation
		// Create , Read , Update , Delete
		
		/*String namesArray[] = new String[5]; // Static Array
		namesArray[0] = "Amit";
		namesArray[1] = "Ram";
		namesArray[2] = "Mike";
		namesArray[3] = "Tim";
		namesArray[4] = "Kim";*/
		//Dynamic 
		// ArrayList<String> - Generic ArrayList (Java 5)
		ArrayList<String> namesList = new ArrayList<>(); //(Java 7)  // 10 + 10 
		namesList.add("Shyam");
		namesList.add("Amit");  // Will Always Add at End
		namesList.add("Ram");
		  // add at end
		namesList.add(1,"Mike");  // add in middle, beg
		namesList.add("Andy");
		//namesList.add(90);
		System.out.println("After Add "+namesList);
		namesList.remove(0);  // delete
		System.out.println("After Remove "+namesList);
		if(namesList.contains("Ram"))  // search
		{
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found..");
		}
		int index = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name to Search");
		String name = scanner.next();
		index = namesList.indexOf(name);  // search
		if(index!=-1)
		{
			System.out.println("Found...");
			System.out.println("Enter the New Name to Update....");
			String newName = scanner.next();
			namesList.set(index, newName);  // update
		}
		/*System.out.println("Before Update "+namesList);
		namesList.set(1, "Tom");
	*/	System.out.println("After Update "+namesList);  // Read operation
		// There are many ways to travese an ArrayList
	//1st Way (Auto Traverse)	
	System.out.println(namesList);
	// Manual Way of Traverse
	// 1st Way
	System.out.println("*****************************************************");
	/*for(int i = 0 ; i<namesList.size(); i++){
		System.out.println(namesList.get(i));
	}*/
	
	// 2nd Way
	// 1-way Traverse (Forward Traverse)
	/*Iterator<String> it = namesList.iterator();
	while(it.hasNext())  // to check the element is there in list or not
	{
		System.out.println(it.next());  // It will give the current element
		//it.remove();  // Iterartor Provide remove method during traverse
		// and move to the next element
	}*/
	
	//3rd Way
	// 2-Way Traverse (BackWard and Forward)
	/*ListIterator<String> it = namesList.listIterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	while(it.hasPrevious()){
		System.out.println(it.previous());
	}*/
	
	// 4th way
	// Java 5 (Enhance For Loop)
	/*for(String z : namesList){
		System.out.println(z);
	}*/
	
	//5th Way (Java 8)
	namesList.forEach((s)->System.out.println(s));
	
	// Sorting in ArrayList
	Collections.sort(namesList);
	System.out.println("After Sort "+namesList);
	
	}

}
