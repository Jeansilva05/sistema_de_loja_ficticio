public class Carrinho {
    public Produto[] produtos = new Produto[10];
    public int indice = 0;

    public void percorrerCarrinho() {
        for (int i = 0; i < this.indice; i++) {
            System.out.println(produtos[i].codBarra);
        }
    }
}
