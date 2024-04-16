package myFirstJava;

class world1 {
	static void div() {
		System.out.println("div");

	}
}

class state_class extends world1 {
	static void multiply() {
		System.out.println("mul");
	}
}

public class world extends state_class {
	static void add() {
		System.out.println("addi");
	}

	void subtract() {
		System.out.println("sub");
	}

	public static void main(String[] args)

	{

		add();
		multiply();
		world c1 = new world();
		c1.subtract();
		div();

	}

}
