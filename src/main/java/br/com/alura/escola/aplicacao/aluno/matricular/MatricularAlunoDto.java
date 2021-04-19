package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	public MatricularAlunoDto(String nomeAluno, String nomeCpf, String nomeEmail) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = nomeCpf;
		this.emailAluno = nomeEmail;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeCpf() {
		return cpfAluno;
	}

	public void setNomeCpf(String nomeCpf) {
		this.cpfAluno = nomeCpf;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setNomeEmail(String nomeEmail) {
		this.emailAluno = nomeEmail;
	}

	public Aluno criarAluno() {
		return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
	}

}
