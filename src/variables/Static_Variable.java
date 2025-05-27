package variables;

public class Static_Variable {

	static int a = 100;
	static int b = 200;

	public void m1() {
		System.out.println(Static_Variable.a);
		System.out.println(Static_Variable.b);
	}
	
	public static void main(String[] args) {
		System.out.println(Static_Variable.a);
		System.out.println(Static_Variable.b);
		
		Static_Variable sv = new Static_Variable();
		sv.m1();
	}
}
