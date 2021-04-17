package br.com.alura.escola.dominio.aluno;

import java.util.List;

import br.com.alura.escola.dominio.comum.CPF;

public interface RepositorioDeAlunos {

	void matricular(Aluno aluno);

	Aluno buscarPorCPF(CPF cpf);

	List<Aluno> listarTodosAlunosMatriculados();
}
