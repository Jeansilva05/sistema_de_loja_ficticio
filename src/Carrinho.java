public class Carrinho {
    public Produto[] produtos = new Produto[10];
    public int indice = 0;

    public void consultarCarrinho() {
        for (int i = 0; i < this.indice; i++) {
            System.out.println(this.produtos[i].codBarra);
        }
    }

    public void adicionarAoCarrinho(Produto prod){
        this.produtos[this.indice] = prod;
        this.indice++;
    }
}
