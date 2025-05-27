package variables;

public class Local_Variable {

	public void m1() {
		int i = 10;
		System.out.println(i);
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println(a + b);

		Local_Variable lv = new Local_Variable();
		lv.m1();
	}
}
