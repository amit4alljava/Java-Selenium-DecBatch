// Noun
// SRP (Single Responsiblity Principle)
//Object oriented  principle
// 1. Encapsulation = Binding data (Variables) and functions (methods)
// into single unit. e.g Class
// 2. Data Hiding - Hide the Member Variables from the OutSider
// Java Beans - private member variables + setter / getter + constructor
//for primary fields
public class Employee {
	 private int id;  // Member Variables of a class (Instance Variables)
	 private String name;
	 private double salary;
	 private String email;
	 private String phone;
	 private String address;
	 private String managerName;
	 private String deptName;
	private String companyName;
	 // Every class has default constructor by default
	 Employee(){
		 //this(1001,"Ram",9999);
		 companyName="UST";
	 }
	 
	 Employee(int id , String name){
		 this();
		 this.id = id;
		 this.name = name;
	 }
	 
	 // Parameterized Constructor  (Primary Fields)
	 Employee(int id, String name, double salary){
		 // this(); and must be the first statement
		 this(id , name); // calling default constructor
		 //this.id = id ;
		 //this.name = name;
		 this.salary = salary;
		 //this();
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getId() {
		return id;
	}

	public String getCompanyName() {
		return companyName;
	}
	 
	 
	/* public void setEmail(String email){
		 this.email = email;
	 }
	 
	 public String getEmail(){
		 return email;
	 }
	 
	 public String getName(){
		 return name;
	 }*/
	 
	// Member Functions(Methods)
	// take input from the TestEmployee Class
	// these are local variables
	/*public void takeInput(int id , String name, double salary ){
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
	}*/
	
	/*// Verb
	public void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
	}*/

}
