package bai6_2;

public class Dog extends Animal{

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Woof!!");
	}

	public void greeting(Dog another) {
		System.out.println("Wooooooooooo!");
	}
}
