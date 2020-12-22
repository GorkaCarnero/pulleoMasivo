package pulleosVarios;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrueba {

	private Prueba p = new Prueba();
	
	@Test
	public void testMensaje() {
		String resultado = p.mensaje("hola");
		String resultadoEsperado = "hola";
		assertEquals(resultadoEsperado, resultado);
	}

}
