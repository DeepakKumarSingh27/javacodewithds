package basic;

public class Interfaces implements car1{

	public static void main(String[] args) {
	

	}

	@Override
	public void start() {
		System.out.println("my car is starting");
		
	}

}

interface car1 {
	void start();
}