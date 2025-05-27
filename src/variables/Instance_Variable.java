package variables;

public class Instance_Variable {
	
	int a=100;
	int b=200;
	
	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Instance_Variable iv = new Instance_Variable();
		
		System.out.println(iv.a);
		System.out.println(iv.b);
		
		iv.m1();
	}
}
