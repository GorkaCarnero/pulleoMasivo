package pack_pulleo2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrueba2 {

	private Prueba2 p = new Prueba2();
	
	@Test
	public void testSuma() {
		int resultado = p.suma(3, 2);
		int resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testCuadradoNum() {
		int resultado = p.cuboNum(2);
		int resultadoEsperado = 8;
		assertEquals(resultadoEsperado, resultado);
	}

}
