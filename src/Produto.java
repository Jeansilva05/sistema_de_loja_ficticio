public class Produto {
    public Double preco;
    public String codBarra;
    public String categoria;
    public String fonecedor;
    private int quantidadeDisponivel;

    // Set
    public void setQuantDisponivel(int quant) {
        this.quantidadeDisponivel = quant;
    }

    // Get
    public int getQuantDisponivel() {
        return this.quantidadeDisponivel;
    }

    // Métodos
    public void selecionado() {
        this.quantidadeDisponivel = this.quantidadeDisponivel - 1;
    }
}
