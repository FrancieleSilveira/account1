package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //para utilizar o . como separador de decimal
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1000, "Bruno", 500.00, 0.01));
		list.add(new BusinessAccount(1001, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1002, "joão", 300.00, 0.01));
		list.add(new BusinessAccount(1003, "Fernanda", 500.50, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc: list) {
			System.out.printf("Updates balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
