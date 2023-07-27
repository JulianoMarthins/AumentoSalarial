package application;

import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Salário bruto: ");
		double salario = scan.nextDouble();
		
		System.out.println("Imposto: ");
		double imposto = scan.nextDouble();
		
		Funcionario func = new Funcionario(nome, salario, imposto);
		
	
		System.out.printf("\nFuncionário: %s\nSalário liquido: %.2f", func.getNome(), func.salarioLiquido());
		
		System.out.println("\n\nPorcentagem para aumento salárial");
		double aumento = scan.nextDouble();
		func.aumentoSalario(aumento);
		
		System.out.printf("\nAtualização de salário:\nNome: %s\nSalário: %.2f",
				func.getNome(), func.salarioLiquido());

		scan.close();

	}

}
