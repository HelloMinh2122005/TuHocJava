package OOP;

public class Human {
	protected String name;
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void greeting() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + age + " years old");
	}
}
