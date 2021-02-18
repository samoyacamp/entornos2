package entornos3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test2 {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@test
	void consulta() {
		Libro consulta = new Libro("España", "Jimenez de los santos", 1, 9);
		int varresultado = consulta.getEjemplares();
		int esperado = (1);
		assertEquals(varresultado, esperado);
	}

}
