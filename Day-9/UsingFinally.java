import java.sql.SQLException;

class Flow
{
	void db() throws SQLException{
		System.out.println("DB Connect (open DB Connection) ");
				try{
					if(10>2){
							throw new SQLException();
					}
					//int d = 100/0;
		System.out.println("DB DO Query");

		System.out.println("GET the Result From DB ");
		//System.exit(1);  
		// when exit from an application , then finally block not run
		//return ; //first it run the finally  
		}
		finally{
		
		System.out.println("Close the DB Connection");
		}
		}
	void bl() throws SQLException{
		System.out.println("Business Logic Starts...");
		db();
		System.out.println("Business Logic Ends....");
	}
	void ui(){
		System.out.println("UI Logic Starts ...");
		try{
		bl();
		}
		catch(SQLException e){
			System.out.println("Exception Caught By UI "+e);
			e.printStackTrace();
			return ;
		}
		
		finally{
		System.out.println("UI Logic Ends....");
		}
	}
}
public class UsingFinally {

	public static void main(String[] args) {
		Flow flow = new Flow();
		flow.ui();

	}

}
