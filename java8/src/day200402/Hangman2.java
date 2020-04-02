package day200402;

public class Hangman2 extends Hangman {
	static String[] arr = { "hello", "hospital", "capacity", "language" };
	static String str = arr[(int)(Math.random()*arr.length)];

	public Hangman2() {
		super(str);
	}
}
