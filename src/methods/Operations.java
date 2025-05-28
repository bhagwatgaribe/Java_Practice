package methods;

public class Operations {

	public void wish() {
		System.out.println("Good morning...");
	}

	public void add(int num1, int num2) {
		int res;
		res = num1 + num2;
		System.out.println(res);
	}

	public static void login(String username, String password) {
		if (username.equals("Bhagwat") && password.equals("bhag@123")) {
			System.out.println("Login Success..." + username);
		} else {
			System.out.println("Login Fail..." + username);
		}
	}

	public static void courseInfo(String name, String course) {
		if (course.equals("corejava")) {
			System.out.println("Hi " + name + " corejava faculty is Mr. Bhagwat fee is: 3000");
		} else if (course.equals("python")) {
			System.out.println("Hi " + name + " python faculty is Mr. Rahul & fee is: 5000");
		} else {
			System.out.println("Hi " + name + " the course is not available");
		}
	}

	public static void display(int a, char ch, double d, boolean b) {
		System.out.println(a + " " + ch + " " + d + " " + b);
	}
}
