public class Cliente {
    // Atributos
    private String cpf;
    private String nome;
    private Double valorEmCompras;
    public Produto[] carrinho;

    // Sets
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValEmCompras(Double valor) {
        this.valorEmCompras = valor;
    }

    // Gets
    public String getCpf() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getValEmCompras() {
        return this.valorEmCompras;
    }

    // Métodos
    public void realizarCompra(Produto prod) {
        this.valorEmCompras = this.valorEmCompras + prod.preco;
    }

    public void adicionarAoCarrinho(Produto prod) {
        
    }
}
