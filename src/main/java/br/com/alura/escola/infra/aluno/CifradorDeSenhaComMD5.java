package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		return null;
	}

	@Override
	public boolean validarSenhaCigrada(String senhaCifrada, String senhaAberta) {
		return false;
	}

}
