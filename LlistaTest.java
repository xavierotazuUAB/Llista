import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LlistaTest {

	Llista llista;

	@BeforeEach
	void setUp() throws Exception
	{
		llista = new Llista();		
	}
	
	@Test
	void testLlista()
	{
		assertEquals(llista.getPrimer(),null);	// decidim que primer ha de ser null
	}

	@Test
	void testAfegirUltim()
	{
		assertTrue(llista.afegirUltim(10));
		assertEquals(llista.getValor(0),10);

		assertTrue(llista.afegirUltim(11));
		assertTrue(llista.afegirUltim(12));
		assertEquals(llista.getValor(1),11);
		assertEquals(llista.getValor(2),12);
	
	
	}

	@Test
	void testInsertarValor()
	{
	}

	@Test
	void testEliminaValor()
	{
	}

	@Test
	void testGetValor()
	{
	}

	@Test
	void testEsBuida()
	{
		assertTrue(llista.esBuida());
	}

	@Test
	void testGetNElements()
	{
	}

}
