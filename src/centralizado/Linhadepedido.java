package centralizado;

public class Linhadepedido {
    private Integer quantidade;
    private Produto produto;
    public Linhadepedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return quantidade;


    }
    public Produto obterProduto(){
        return produto;
    }
    

}
