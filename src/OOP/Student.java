package OOP;

public class Student extends Human {
	private int grade;

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	private String WhichPrefix(int number) {
		number %= 10;
		if (number == 1)
			return "st";
		if (number == 2)
			return "nd";
		return "th";
	}

	@Override
	public void greeting() {
		super.greeting();
		String prefix = this.WhichPrefix(grade);
		System.out.println("I am " + grade + prefix + " student");
	}
}
