package desentralizado;

public class LinhadePedido {
    
    private Produto produto; 
    private int quantidade; 

   
    public LinhadePedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    
    public double obterPreco() {
        return produto.getDetalhePreco() * quantidade; 
    }
}
