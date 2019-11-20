package application;

import java.util.Scanner;

import entities.Movimentacao;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movimentacao movimentacao;
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();	
			movimentacao = new Movimentacao(account, name, initialDeposit);
		}
		else {
			movimentacao = new Movimentacao(account, name);
		}
		
		
		
		
		
		
		System.out.println(movimentacao);
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double value = sc.nextDouble();
		movimentacao.depositIn(value);
		System.out.println("Updated account data: " + movimentacao);
		
		System.out.println();
		
		System.out.println("Enter withdraw value: ");
		value = sc.nextDouble();
		movimentacao.withdrawOut(value);
		System.out.printf("Updated account data: " + movimentacao);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
