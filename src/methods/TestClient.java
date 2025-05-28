package methods;

public class TestClient {

	public static void main(String[] args) {

		Operations op = new Operations();

		op.wish();
		op.add(5, 15);
		Operations.login("Bhagwat", "bhag@123");
		Operations.courseInfo("Pashya", "python");
		Operations.display(10, '#', 15.5, false);
	}
}
