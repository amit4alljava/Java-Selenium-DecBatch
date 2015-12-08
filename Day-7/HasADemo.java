class Person
{
	int age;
	String address;
}
class CashCustomer extends Person
{
	int id;
	String name;
	Order order =new Order();  // Has a relationship
}
class Order
{
int id;
String name;
String desc;

}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
