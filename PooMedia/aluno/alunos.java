package aluno;

public class alunos {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media(){
		return nota1 + nota2 + nota3;
	}
	
	public double restante(){
		return 60 - media();
	}
	
	public String toString() {
		return nome + " Media: " + String.format("%.2f",media());
	}
	
}
