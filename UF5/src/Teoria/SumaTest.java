package Teoria;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	Suma obj= new Suma();
	
	@Test
	public void testSuma() {
		
		double resultado=obj.suma(5, 7);
		assertEquals("Resultado esperado: 12", 12, resultado, 0.1); //Lo espero obtener como resultado, lo que me da el resultado, 11.9/12.0/12.1 margen error.
	
	}
	
	@Test
	public void testIncrementar(){
		
		int result=obj.incrementar(1);
		assertEquals("Incremento esperado: 2", 2, result, 0.1);
	}



}
