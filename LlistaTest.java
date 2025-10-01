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
