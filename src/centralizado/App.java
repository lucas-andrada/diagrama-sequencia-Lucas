package centralizado;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       
        Produto produto1 = new Produto(2250.0);
        Produto produto2 = new Produto(12250.0);

        Cliente cliente = new Cliente(50.0);

        Linhadepedido linha1 = new Linhadepedido(1, produto1);
        Linhadepedido linha2 = new Linhadepedido(2, produto2);

        Pedido pedido = new Pedido(cliente, Arrays.asList(linha1, linha2));

        System.out.println(pedido.calcularPreco());
    }
}
