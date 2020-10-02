
public class Arvore {
	private No Raiz;
	
	public void Insira(int valor) {
		Raiz = Insira(Raiz, valor);
	}
	
	private No Insira(No no, int valor) {
		if (no == null) {
			return new No(valor);
		}
		return new No(valor);
	}
}
