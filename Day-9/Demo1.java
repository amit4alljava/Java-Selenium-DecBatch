
public class Demo1 {

	public static void main(String[] args) {
		// From Java 5 version u have StringBuilder Class
		StringBuilder sb = new StringBuilder();
		String y = "amit";
		// Legacy Class 
		//StringBuffer sb = new StringBuffer(y);  //4 + 16
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(1000);
		sb.append("abcdefghjkgjfjglhjfghjgfjhjghjgfhjlkf"
				+ "ghgfdgdfgdgdfgljfhjhgfhhhffffffffffffsssgjlgdgg");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//new capacity = oldcapacity * 2 + 2
		      // 42 = 20  * 2 + 2
		// if (newcapacity < length){
		// newcapacity = length;  }
		sb.delete(2, 4);
		sb.deleteCharAt(0);
		sb.insert(0, "AAAAAAAAAAA");
		System.out.println("After Insert "+sb);
		sb.reverse();
		int index = sb.indexOf("A");
		String x = sb.toString();  // It will convert StringBuffer into String
	}

}
