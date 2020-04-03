package day200403;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() { // ¿Á¡§¿«
		return name;
	}

}
