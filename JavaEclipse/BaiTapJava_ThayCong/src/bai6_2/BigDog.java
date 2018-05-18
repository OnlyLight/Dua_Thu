package bai6_2;

public class BigDog extends Dog{
	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Woof!!");
	}

	@Override
	public void greeting(Dog another) {
		System.out.println("Wooooooooooo!");
	}
}
