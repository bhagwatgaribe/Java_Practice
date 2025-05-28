package variables;

public class Static_Variable {

	// Instance Variables
	int x,y,z;
	int i=10,j,k;

	// Static Variables
	static int a=10,b=20,c;
	static int l=10,m=20,n=30;
	static int d, e=100,f;

	public static void main(String[] args) {
		
		Static_Variable st = new Static_Variable();
		
		System.out.println(st.x+" "+st.y+" "+st.z);
		System.out.println(st.i+" "+st.j+" "+st.k);
		
		System.out.println(Static_Variable.a+" "+Static_Variable.b+" "+Static_Variable.c);
		System.out.println(Static_Variable.l+" "+Static_Variable.m+" "+Static_Variable.n);
		System.out.println(Static_Variable.d+" "+Static_Variable.e+" "+Static_Variable.f);
	}
}
