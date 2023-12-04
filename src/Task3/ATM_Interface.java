package Task3;

import java.util.Scanner;

public interface ATM_Interface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter initial account balance: Rs.");
		double initialBalance = scanner.nextDouble();
		BankAccount bankAccount = new BankAccount(initialBalance);

		ATM atm = new ATM(bankAccount);

		while (true) {
			atm.displayMenu();
			System.out.print("Select an option: ");
			int choice = scanner.nextInt();

			atm.performTransaction(choice, scanner);
		}
	}
}
