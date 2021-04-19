package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();

		MatricularAluno matricularAluno = new MatricularAluno(repositorio);

		String nomeAluno = "José da Silva";
		String nomeCpf = "111.222.333-44";
		String nomeEmail = "aluno@aluno.com";
		MatricularAlunoDto dto = new MatricularAlunoDto(nomeAluno, nomeCpf, nomeEmail);

		Aluno aluno = dto.criarAluno();
		repositorio.matricular(aluno);
	}

}
