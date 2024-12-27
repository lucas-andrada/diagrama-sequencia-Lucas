package desentralizado;

public class Cliente {

    private Double percentualDesconto;

    public Cliente(Double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public Double getPercentualDesconto() {
        return percentualDesconto;
    }

    public Double calcularDesconto(Double precoBase){
      

        return precoBase  - ( precoBase*(percentualDesconto/100));
    }

}
