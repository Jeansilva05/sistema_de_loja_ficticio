public class Loja {
    public static void main(String[] args) throws Exception {
        Produto blusa = new Produto();
        blusa.preco = 100.0;
        blusa.codBarra = "001";
        blusa.categoria = "vestimenta";
        blusa.fornecedor = "aridas"; //fake

        Cliente cL1 = new Cliente();
        cL1.setCpf("000.001.002-03");
        cL1.setNome("Jean");
        cL1.setValEmCompras(0.0);

        Carrinho c1 = new Carrinho();
        c1.consultarCarrinho();
        c1.adicionarAoCarrinho(blusa);
        c1.consultarCarrinho();
        c1.removerDoCarrinho(blusa, "001");
        c1.consultarCarrinho();
    }
}
