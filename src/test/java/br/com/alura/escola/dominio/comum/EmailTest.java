package br.com.alura.escola.dominio.comum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void deveObterSucessoAoReceberEmailValido() {
		Email email = new Email("leonardoduarte1305@gmail.com");
		assertEquals("leonardoduarte1305@gmail.com", email.getEndereco());
	}

	@Test
	void deveFalharAoReceberEmailInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));

	}

}
