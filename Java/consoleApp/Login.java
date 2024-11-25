package consoleApp;

import java.util.Scanner;

class Company{
	public void salary() {
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine().trim().toLowerCase();
		System.out.println("20000");
	}
}

public class Login{
public static void main(String args[]) {

	Company obj = new Company();
	obj.salary();
}
}