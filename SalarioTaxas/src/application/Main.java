package application;

import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Sal�rio bruto: ");
		double salario = scan.nextDouble();
		
		System.out.println("Imposto: ");
		double imposto = scan.nextDouble();
		
		Funcionario func = new Funcionario(nome, salario, imposto);
		
	
		System.out.printf("\nFuncion�rio: %s\nSal�rio liquido: %.2f", func.getNome(), func.salarioLiquido());
		
		System.out.println("\n\nPorcentagem para aumento sal�rial");
		double aumento = scan.nextDouble();
		func.aumentoSalario(aumento);
		
		System.out.printf("\nAtualiza��o de sal�rio:\nNome: %s\nSal�rio: %.2f",
				func.getNome(), func.salarioLiquido());

		scan.close();

	}

}
