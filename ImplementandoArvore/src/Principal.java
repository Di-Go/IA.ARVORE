
public class Principal {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		
		arvore.Insira(4);
		arvore.Insira(5);
		arvore.Insira(6);
		arvore.Insira(2);
		arvore.Insira(3);
		arvore.Insira(1);
		
		arvore.ImprimaPreOrdem();
		arvore.ImprimaEmOrdem();
		arvore.ImprimaPosOrdem();
	}
}
