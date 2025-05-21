package operators;

public class Bitwise_Operator {

	public static void main(String[] args) {
		System.out.println(10 & 7);
		System.out.println(6 & 12);

		System.out.println(3 | 11);
		System.out.println(7 | 8);

		System.out.println(~123);
		System.out.println(~-123);

		System.out.println(10 > 20 & 30 < 40);
		System.out.println(10 < 20 | 30 < 40);
	}
}
