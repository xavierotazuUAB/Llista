import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NodeTest
{

	Node n0, n1, n2;
	
	@BeforeEach
	void setUp() throws Exception
	{
		n0 = new Node();
		n1 = new Node(1);
		n2 = new Node(2);
	}
	
	@Test
	void testNode()
	{
		// Constructor per defecte
		assertEquals(n0.getValor(),0);	// valor decidim que ha de ser zero 
		assertEquals(n0.getNext(),null);	// next ha de ser zero

		// Constructor amb parametre
		assertEquals(n1.getValor(),1); 
		assertEquals(n1.getNext(),null);	// next ha de ser zero
	}

	@Test
	void testSetValor()
	{
		n2.setValor(1);
		
		assertEquals(n2.getValor(),2);		
	}

	@Test
	void testSetNext()
	{
		n0.setNext(n1);
		
		assertEquals(n0.getNext(),n1);
	}

}
