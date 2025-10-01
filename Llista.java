
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
	
	
	public boolean insertarValor(int posicio, int valor);
	public boolean eliminaValor(int posicio);
	public int getValor(int posicio) {return primer.getValor();};
	
	public boolean esBuida() {return primer==null;};
	public int getNElements();
	
	private Node primer;
	
	// Mètodes per fer test
	public Node getPrimer() {return primer;};
}
