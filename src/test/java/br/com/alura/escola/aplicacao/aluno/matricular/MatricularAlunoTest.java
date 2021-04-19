package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void deveriaPersistirNoBanco() {
		RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno ma = new MatricularAluno(repositorio);

		MatricularAlunoDto dto = new MatricularAlunoDto("João", "111.222.333-44", "leo@leo.com");

		ma.matricularAluno(dto);

		CPF cpf = new CPF("111.222.333-44");
		Aluno encontrado = repositorio.buscarPorCPF(cpf);
		assertEquals("João", encontrado.getNome());

	}

}
