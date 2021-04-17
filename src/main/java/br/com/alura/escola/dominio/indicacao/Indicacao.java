package br.com.alura.escola.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicante;
	private LocalDateTime dataDaIndicacao;

	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataDaIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return indicado;
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public LocalDateTime getDataDaIndicacao() {
		return dataDaIndicacao;
	}

}
