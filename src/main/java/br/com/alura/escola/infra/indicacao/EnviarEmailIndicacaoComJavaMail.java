package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// Logica de envio de email com a lib Java Mail
	}

}
