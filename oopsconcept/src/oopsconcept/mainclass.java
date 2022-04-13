package oopsconcept;
import encapsulation.EncapsulationIntro;

public class mainclass {

	public static void main(String[] args) {
//		person p1 = new person();
//		p1.age=24;
//		p1.name="Deepak";
//		person p2 = new person(31,"shivamkumar");
//	System.out.println(p1.age + " "+ p1.name);
//	p2.age=31;
//	p2.name="shivam";
//	System.out.println(p2.age + " "+ p2.name);
	
//	p1.eat();
//	p2.walk();
//	p2.walk(2);
//	System.out.println(person.count);
//	devloper d1=new devloper(24,"Anuj");
//		devloper d2=(devloper) p2;
//	d1.walk();
		
// EncapsulationIntro obj = new EncapsulationIntro();
//	obj.dowork();
//		
		
	}

}

class devloper extends person{
	public devloper(int age , String name) {
	super(age,name);
}
	
	 void walk() {
	System.out.println( "Devloper" + " "+name + " "+"is walking.");
	 }
}

class person {
	String name;
	int age;
	
	 static int count;
//	 constructor
//	public person() {
//		
//		count++;
//		System.out.println("creating an objects");
//	}
	
	public person(int age ,String name) {
		
		this.name=name;
		this.age=age;
	}
//	polymerphism
     void walk() {
	System.out.println(name + " "+"is walking.");
		
	}
	void eat() {
		System.out.println(name + " "+"is eating ");
	}
	
	void walk(int steps) {
		System.out.println(name +" "+ "walked" +" "+ " "+ steps +" "+ "steps.");
	}
	
	void doWork() {
		System.out.println("person is walking");
	}
	
	
}