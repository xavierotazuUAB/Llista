import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest
{

	@Test
	void testNode()
	{
		// Constructor per defecte
		Node n1 = new Node();
		
		assertEquals(n1.getValor(),0);	// valor decidim que ha de ser zero 
		assertEquals(n1.getNext(),null);	// next ha de ser zero

		// Constructor amb parametre
		Node n2 = new Node(1);
		
		assertEquals(n2.getValor(),1); 
		assertEquals(n2.getNext(),null);	// next ha de ser zero
	}

	@Test
	void testSetValor()
	{
		Node n1 = new Node();
		n1.setValor(2);
		
		assertEquals(n1.getValor(),2);	// valor decidim que ha de ser zero		
	}

	@Test
	void testSetNext()
	{
	}

}
