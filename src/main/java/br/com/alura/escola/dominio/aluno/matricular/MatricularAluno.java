package br.com.alura.escola.dominio.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}

	public void matricular(MatricularAlunoDto dto) {
		Aluno novo = dto.criarAluno();
		repositorio.matricular(novo);
	}
}
