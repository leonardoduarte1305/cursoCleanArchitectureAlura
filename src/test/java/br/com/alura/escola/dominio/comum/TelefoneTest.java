package br.com.alura.escola.dominio.comum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void deveObterSucessoAoReceberTelefoneValido() {
		Telefone telefone = new Telefone("48", "99132-1949");
		assertEquals("48", telefone.getDdd());
		assertEquals("99132-1949", telefone.getNumero());
	}

	@Test
	public void deveLancarExcecao() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("48", "333-3333"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("4", "3333-3333"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("4", null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "3333-3333"));
	}

}
