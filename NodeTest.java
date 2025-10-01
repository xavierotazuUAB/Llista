import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testNode()
	{
		// Constructor per defecte
		Node n = new Node();
		
		assertEquals(n.getValor(),0);	// valor decidim que ha de ser zero 
		assertEquals(n.getNext(),0);	// next ha de ser zero
	}

	@Test
	void testSetValor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNext() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNext() {
		fail("Not yet implemented");
	}

}
