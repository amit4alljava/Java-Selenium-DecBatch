// Noun
// SRP (Single Responsiblity Principle)
//Object oriented  principle
// 1. Encapsulation = Binding data (Variables) and functions (methods)
// into single unit. e.g Class
// 2. Data Hiding - Hide the Member Variables from the OutSider
public class Employee {
	private int id;  // Member Variables of a class (Instance Variables)
	private String name;
	private double salary;
	
	// Member Functions(Methods)
	// take input from the TestEmployee Class
	// these are local variables
	void takeInput(int id , String name, double salary ){
		//System.out.println("Inside Take Input "+this);  // current reference(address) is hold by the
		// this keyword
		if(id>0 && salary>0){
		this.id = id;
		this.name = name;
		this.salary = salary;
		}
		else{
			System.out.println("Invalid Id or Salary");
		}
	}
	
	// Verb
	void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}

}
