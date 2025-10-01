import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testNode()
	{
		// Constructor per defecte
		Node n = new Node();
		
		assertEquals(n.getValor(),0);	// valor decidim que ha de ser zero 
		assertEquals(n.getNext(),null);	// next ha de ser zero
	}

	@Test
	void testSetValor()
	{
	}

	@Test
	void testGetNext()
	{
	}

	@Test
	void testSetNext()
	{
	}

}
