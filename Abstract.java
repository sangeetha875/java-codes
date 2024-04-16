package myFirstJava;

abstract class Google_code {
	abstract void login();

	abstract void regestration();
}

public class Abstract extends Google_code {
	public static void main(String[] args)

	{

		Abstract a1 = new Abstract();

		a1.login();
		a1.regestration();
	}

	void login() {
		System.out.println("login logic");
	}

	void regestration() {
		System.out.println("regestration logic");
	}
}