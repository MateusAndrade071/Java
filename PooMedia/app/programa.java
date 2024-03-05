package app;

import java.util.Scanner;

import aluno.alunos;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		alunos Alunos = new alunos();
		
		System.out.println("Nome:");
		Alunos.nome = sc.nextLine();
		
		System.out.println("Nota da 1 unidade: ");
		Alunos.nota1 = sc.nextDouble();
		System.out.println("Nota da 2 un0idade: ");
		Alunos.nota2 = sc.nextDouble();
		System.out.println("Nota da 3 unidade: ");
		Alunos.nota3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Situação geral: " + Alunos);
		if(Alunos.media()<=60) {
			System.out.println("Reprovado");
			System.out.println("Faltam: " + Alunos.restante() + "pontos");
		}else {
			System.out.println("Aprovado");
		}
		

	}

}
