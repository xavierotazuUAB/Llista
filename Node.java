
public class Node
{
	public Node() {valor=0; next=null;};
	public Node(int v) {valor=v; next=null;};
	
	public void setValor(int v) {valor=v;};
	public int getValor() {return valor;};

	public Node getNext() {return next;};
	public void setNext(Node next);
	
	private int valor;
	private Node next;
}
