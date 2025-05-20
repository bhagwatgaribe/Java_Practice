package operators;

public class Arithmetic_Operator {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println("\n");

		System.out.println(10 + 20);
		System.out.println("ratan" + "bhagwat");
		System.out.println(10 + "ratan");
		System.out.println(10 + "ratan" + 20 + 30);
		System.out.println(10 + 20 + "ratan" + 20 + 30);
		
		System.out.println("ratan"+"anu");
		System.out.println(10+20+"ratan"+"naresh");
		System.out.println(10+"ratan"+20+5+"naresh");
		System.out.println(10+"ratan"+(20+5)+("naresh"+3+3));
		System.out.println(10+"ratan"+3*10/2+"naresh");
		
	}
}
