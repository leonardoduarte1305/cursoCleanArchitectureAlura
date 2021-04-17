package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		try {
			String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// Deixado pelo Rodrigo como desafio
	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		String sql = "Select * FROM ALUNO WHERE CPF=" + cpf.getNumero();
		return null;
	}

	// Deixado pelo Rodrigo como desafio
	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {

		return null;
	}

}
