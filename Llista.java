
public class Llista
{
	public Llista() {primer = null;};
	
	public boolean afegirUltim(int valor)
	{
		Node node = new Node(valor); 

		Node aux = primer;
		
		// Comprovem que primer no sigui null
		if(aux!=null)
		{
			while(aux.getNext()!=null)
			{
				aux = aux.getNext();
			}			

			aux.setNext(node);
		}
		else
		{
			primer = node;			
		}
				
		
		return true;
	}
	
	
	public boolean insertarValor(int posicio, int valor)
	{
		boolean bInsertat = false;
		
		Node anterior = primer;
		int pos = 0;
		
		// Comprovem que primer no sigui null
		if(anterior!=null)
		{
			// Ens desplacem fins el node just anterior on hem de fer la inserció
			while(pos<posicio)
			{
				anterior = anterior.getNext();
				pos = pos+1;
			}
			
			Node seguent = anterior.getNext(); // guardem una referencia/punter al node següent
			
			Node nou = new Node(valor);	// creem el nou node a insertar
			
			anterior.setNext(nou);		// apuntem la referencia/punter next del node anterior al  nou node
			nou.setNext(seguent);
			
			bInsertat = true;

		}
		
		return bInsertat;
	}
	
	
	
	public boolean eliminaValor(int posicio);
	public int getValor(int posicio)
	{
		int valor = 0;

		int pos = 0;
		Node aux = primer;
		
		// Comprovem que primer no sigui null
		if(aux!=null)
		{
			while(aux.getNext()!=null && pos<posicio)
			{
				aux = aux.getNext();
				pos = pos+1;
			}
			
			valor = aux.getValor();

		}
				
		
		return valor;
	};
	
	public boolean esBuida() {return primer==null;};
	
	public int getNElements()
	{
		int n_elem = 0;

		Node aux = primer;
		
		// Comprovem que primer no sigui null
		if(aux!=null)
		{
			while(aux!=null)
			{
				n_elem = n_elem+1;
				aux = aux.getNext();
			}	

		}
		
		return n_elem;
		
	}
	
	private Node primer;
	
	// Mètodes per fer test
	public Node getPrimer() {return primer;};
}
