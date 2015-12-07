abstract class Account
//class Account
{
	int x;
	int y=900;
	Account(){
		x = 100;
		 System.out.println("Abstract Class Cons");
	}
  void withDraw(){	
	  System.out.println("Account WithDraw Function....");
  }
  void deposit(){
	  System.out.println("Account Deposit Function...");
  }
 /* void roi(){
	  System.out.println("Account Class ROI...");
  }*/
  abstract void roi();  // it just an decleration of a method
  // and it is not defination
}
class SavingAccount extends Account{
	int x ;
	
	SavingAccount(){
		//super();
		 x = 200;
		 int z = super.x + this.x;
		System.out.println("This is Child Class Default Cons... ");
	}
	@Override
	void roi(){
		y = y + x;
		System.out.println("SavingAccount ROI Give by Bank");
	}
	
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("CurrentAccount ROI charge by Bank");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		/*sa.withDraw();
		sa.deposit();
		sa.roi();*/
		//CurrentAccount ca = new CurrentAccount();
		//Account account = new Account();
		

	}

}
