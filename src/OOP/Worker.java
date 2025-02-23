package OOP;

public class Worker extends Human {
	private int experienceYears;

	public Worker(String name, int age, int experienceYears) {
		super(name, age);
		this.experienceYears = experienceYears;
	}

	@Override
	public void greeting() {
		super.greeting();
		System.out.println("I have " + experienceYears + " experience years");
	}
}
