class Student
{
	int rollno;  // Instance Variables
	String name;
	int counter2;  // Comes when object is created
	 final int counter3;
	static int counter;  // Class Variables
	// Early in the Memory - It will come when class is loaded
	// and class is loaded only once.
	int dbCall(){
		return (int)(9000 * Math.random());
	}
	Student(){
		counter3 = dbCall();
		
	}
	Student(int rollno, String name){
		this();
		this.rollno = rollno;
		this.name = name;
		counter ++;
		counter2++;
		System.out.println("Counter Value is "+
		counter+" Counter2  "+counter2+" Counter 3 "+counter3);
		
	}
}
public class UseOfStatic {

	public static void main(String[] args) {
		Student ram = new Student(1001,"Ram");
		Student mike = new Student(1002,"Mike");

	}

}
