package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ana");
		Aluno aluno2 = new Aluno("Joana");
		Aluno aluno3 = new Aluno("Mariana");
		
		Curso curso1 = new Curso("Enfermagem");
		Curso curso2 = new Curso("Engenharia");
		Curso curso3 = new Curso("ADS");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		
		aluno1.adcionarCurso(curso3);
		aluno2.adcionarCurso(curso3);
		aluno3.adcionarCurso(curso3);
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado em Enfermagem...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		for (Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado em Engenharia...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado em ADS...");
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		
	}

}
