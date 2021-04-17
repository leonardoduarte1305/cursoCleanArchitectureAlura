package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.comum.CPF;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> alunos = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);

	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.alunos.stream().filter(
				a -> a.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.alunos;
	}

}
