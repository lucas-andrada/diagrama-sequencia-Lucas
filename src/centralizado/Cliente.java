package centralizado;

public class Cliente {

    private Double percentualDesconto;

    public Cliente(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Double obterPercentualDesconto() {
        return percentualDesconto;
    }

}
