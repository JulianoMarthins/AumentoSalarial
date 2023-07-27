package entities;

public class Funcionario {

	// Atrinutos
	private String nome;
	private double salarioBruto;
	private double imposto;

	public Funcionario(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;

	}
	
	public double salarioLiquido() {
		return this.salarioBruto - imposto;
	}

	public void aumentoSalario(double porcento) {
		this.salarioBruto += this.salarioBruto * porcento / 100;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSalarioBruto(double salario) {
		this.salarioBruto = salario;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public double getImposto() {
		return imposto;
	}
}
