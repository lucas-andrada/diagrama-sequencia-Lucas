package centralizado;

import java.util.List;

public class Pedido {
    

    private List<Linhadepedido> linhasdePedido;
   

    private Cliente cliente;

    public Pedido(Cliente cliente, List<Linhadepedido> linhasdePedido) {
        this.cliente = cliente;
        this.linhasdePedido = linhasdePedido;
    }

    public Double calcularPreco(){
        Double procoFinal = 0.0;
        for (Linhadepedido linha : linhasdePedido) {
           Integer quantidade = linha.getQuantidade();
           Produto produto = linha.obterProduto();
           Double preco = produto.obterDetalhePreco();

           Double procoBase = calcularPrecoBase(quantidade,preco);

           Double precoComDesconto = calcularDesconto(procoBase);

           procoFinal += precoComDesconto;
        }
        return procoFinal;
    }

    public Double calcularPrecoBase(Integer quanitdade,Double preco){
       return preco * quanitdade;

        }
      
        public Double calcularDesconto(Double precoBase){
            Double percentualDesconto = cliente.obterPercentualDesconto();

            return precoBase  - ( precoBase*(percentualDesconto/100));
        }

    


}
