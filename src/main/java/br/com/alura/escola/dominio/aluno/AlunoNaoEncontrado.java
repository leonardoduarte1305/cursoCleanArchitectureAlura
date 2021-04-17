package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.comum.CPF;

public class AlunoNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno não encontrado com o CPF: " + cpf.getNumero());
	}

}
