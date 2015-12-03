// Parent Class
class Loan
{
	void applyForLoan(){
		System.out.println("Common Way to Apply for Loan...");
	}
	void roi(){
		System.out.println("Common 5% ROI");
	}
}
// HomeLoan is child class and inherit the parent class loan
class HomeLoan extends Loan{
	void insurance(){
		System.out.println("For HomeLoan Insurance is Must...");
	}
	@Override
	void roi(){
		super.roi();
		System.out.println("Home ROI 14%");	
	}
}
class AutoLoan extends Loan{
	
}
public class ISADemo {

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan();
		//hl.applyForLoan();
		hl.roi();
		/*hl.insurance();
		System.out.println("************************************");
		AutoLoan al = new AutoLoan();
		al.applyForLoan();
		al.roi();*/
		//al.insurance();

	}

}
