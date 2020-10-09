
public class Arvore {
	private No Raiz;
	
	public void Insira(int valor) {
		Raiz = Insira(Raiz, valor);
	}
	
	private No Insira(No no, int valor) {
		if (no != null) {
			if (valor < no.Valor || no.Valor == valor) {
				no.Esquerdo = Insira(no.Esquerdo, valor);
			}else {
				no.Direito = Insira(no.Direito, valor);
			}
		}else {
			return new No(valor);
		}
		return no;
	}
	
	public void ImprimaPreOrdem() {
		System.out.println("Pré Ordem:");
		ImprimaPreOrdem(this.Raiz);
	}
	
	private void ImprimaPreOrdem(No noAtual) {
		if (noAtual == null) {
			return;
		}
		
		System.out.println(noAtual.Valor);
		ImprimaPreOrdem(noAtual.Esquerdo);
		ImprimaPreOrdem(noAtual.Direito);
	}
	
	public void ImprimaEmOrdem() {
		System.out.println("Em Ordem:");
		ImprimaEmOrdem(this.Raiz);
	}
	
	private void ImprimaEmOrdem(No noAtual) {
		if (noAtual == null) {
			return;
		}
		
		ImprimaEmOrdem(noAtual.Esquerdo);
		System.out.println(noAtual.Valor);
		ImprimaEmOrdem(noAtual.Direito);
	}
	
	public void ImprimaPosOrdem() {
		System.out.println("Pós Ordem:");
		ImprimaPosOrdem(this.Raiz);
	}
	
	private void ImprimaPosOrdem(No noAtual) {
		if (noAtual == null) {
			return;
		}
		
		ImprimaPosOrdem(noAtual.Esquerdo);
		ImprimaPosOrdem(noAtual.Direito);
		System.out.println(noAtual.Valor);
	}
}
