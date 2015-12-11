import java.util.ArrayList;

class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary= salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	
}
public class ArrayListOfObjects {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		Employee ram = new Employee(1001, "Ram", 9999);
		empList.add(ram);
		Employee shyam = new Employee(1002, "Shyam", 4444);
		empList.add(shyam);
		//System.out.println(empList);
		/*for(Employee e : empList){
			System.out.println(e);
		}*/
		// Java 8 Way
		empList.forEach((e)->System.out.println(e));
	}

}
