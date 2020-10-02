
public class Arvore {
	private No Raiz;
	
	public void Insira(int valor) {
		Raiz = Insira(Raiz, valor);
	}
	
	private No Insira(No no, int valor) {
		if (no != null) {
			if (no.Valor < valor || no.Valor == valor) {
				no.Esquerdo = Insira(no.Esquerdo, valor);
			}else {
				no.Direito = Insira(no.Direito, valor);
			}
		}		
		return new No(valor);
	}
}
