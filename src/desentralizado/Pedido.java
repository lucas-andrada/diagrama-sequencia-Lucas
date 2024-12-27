package desentralizado;

import java.util.List;



public class Pedido {

     private List<LinhadePedido> linhasdePedido;
    private Cliente cliente;


    public Pedido(Cliente cliente,List<LinhadePedido> linhasdePedido) {
        this.cliente = cliente;
        this.linhasdePedido = linhasdePedido;
        
    }


    public Double calcularPreco(){
        Double procoFinal = 0.0;
        for (LinhadePedido linha : linhasdePedido) {
          
      

           procoFinal += linha.obterPreco();
        }
        return cliente.calcularDesconto(procoFinal);
    }





}
