// 100% Abstract 
// What to do
// all methods are abstract 
// all member data are constants (final)

interface IPlayer
{
	int MAX_SPEED = 100; // public static final int MAX_SPEED = 100;
	void run(); // public abstract void run();
	void jump();
	void attack();
}
interface SuperPower{
	void moreFaster();
	void fly();
}


class BlackPlayer implements IPlayer, SuperPower{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moreFaster() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
// How to Do 
// Class implements the Design given by the interface
class RedPlayer implements IPlayer{
	int runSpeed = 10;
	@Override
	public void run(){
		if(runSpeed<MAX_SPEED){
			runSpeed++;
		}
		System.out.println("Red Player Run Very Fast... "+runSpeed);
	}
	
	@Override
	public void jump(){
		System.out.println("Red Player Jumps Average");
	}
	
	@Override
	public void attack(){
		System.out.println("Red Player Attack By Kicks");
	}
}
public class GameApp {

	public static void main(String[] args) {
		RedPlayer rp = new RedPlayer();
		rp.jump();
		rp.run();
		rp.attack();

	}

}
