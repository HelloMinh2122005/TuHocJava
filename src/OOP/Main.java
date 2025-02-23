package OOP;

public class Main {
	public static void main(String[] args) {
		Student John = new Student("John Doe", 18, 12);
		Worker Marry = new Worker("Marry Jane", 28, 6);

		John.greeting();
		Marry.greeting();
	}
}
