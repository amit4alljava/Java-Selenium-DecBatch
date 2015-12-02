// DRY - Don't Repeat YourSelf
public class TestEmployee {

	public static void main(String[] args) {
		if(true){
			int x=100;
		}
		// ram is an Object or ram is a instance of Employee
		// it allocate a memory for instance variables
		Employee ram = new Employee();  // ram is variable of Employee type
		/*ram.id = -1001;
		ram.name="Ram";
		ram.salary=-9090;*/
		ram.takeInput(-1001, "Ram", -9999);
		//System.out.println("Ram is "+ram);
		ram.print(); // Calling
		Employee mike = new Employee();
		mike.takeInput(1002, "Mike", 8888);
		//System.out.println("Mike is "+mike);
		mike.print();
		// new is a predefine keyword and it is used to allocate memory
		// on runtime.
		// new Employee() is actually creating an object
		//int a = 100; // a is a variable of int type
		/*System.out.println(ram.id);
		System.out.println(ram.name);
		System.out.println(ram.salary);*/
		/*ram.id = 1001;
		ram.name = "Ram";
		ram.salary = 9090.0;
		System.out.println(ram.id);
		System.out.println(ram.name);
		System.out.println(ram.salary);
		*/
		/*System.out.println("Mike Id "+mike.id);
		System.out.println("Mike Name "+mike.name);
		System.out.println("Mike Salary "+mike.salary);
		mike.id = 1002;
		mike.name="Mike";
		mike.salary=9999;
		System.out.println("Mike Id "+mike.id);
		System.out.println("Mike Name "+mike.name);
		System.out.println("Mike Salary "+mike.salary);
*/	}

}
