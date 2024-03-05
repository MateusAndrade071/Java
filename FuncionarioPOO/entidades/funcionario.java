package entidades;

public class funcionario {
	
	public String nome;
	public double SalarioBruto;
	public double imposto;
	
	public double salarioLiquido(){
		return SalarioBruto-imposto;
	}
	
	public void aumentarSalario(double percentual){
		SalarioBruto += SalarioBruto * percentual / 100;
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f",salarioLiquido());
	}
}
