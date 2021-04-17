package br.com.alura.escola.dominio.comum;

public class Email {

	// VALUE OBJECT - Quando não temos como diferenciar duas
	// intâncias do mesmo objeto através de um dos seus atributos

	private String endereco;

	public Email(String endereco) {

		if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email inválido");
		}

		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
