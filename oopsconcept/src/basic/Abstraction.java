package basic;

public class Abstraction {

	public static void main(String[] args) {
		
//car c1=new car(); error throws don't create obj in abstract method or class
		
//c1.start();
		
		Audi a1=new Audi();
		a1.start();
		
	}

}

class Audi extends car{

	@Override
	void start() {
		System.out.println("Audi is starting");
		
	}
	
}
class Bmw extends car{

	@Override
	void start() {
		System.out.println("Bmw is starting");
		
	}
	
}


 abstract class car{
//	String brand;
	int price;
	
	abstract void start() ;
	void breaks() {
		System.out.println("car is breaking");
	}
	
}