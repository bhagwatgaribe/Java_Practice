package operators;

public class Logical_operators {

	public static void main(String[] args) {
		if (10 > 20 && 10 / 0 == 0) {
			System.out.println("Good morning");
		} else {
			System.out.println("Good night");
		}

		if (10 < 20 || 10 / 0 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
