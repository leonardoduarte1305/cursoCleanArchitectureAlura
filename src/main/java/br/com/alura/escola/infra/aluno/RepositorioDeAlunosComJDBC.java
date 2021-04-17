package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.dominio.comum.CPF;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

	private final Connection conexao;

	public RepositorioDeAlunosComJDBC(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void matricular(Aluno aluno) {
		String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {

		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {

		return null;
	}

}
