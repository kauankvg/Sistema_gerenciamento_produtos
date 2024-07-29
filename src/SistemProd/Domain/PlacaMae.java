package SistemProd.Domain ;

public class PlacaMae extends Produto {
    private String dataDeFabricacao;
    public static final double VALORTAXAPLACAMAE = 0.21;
    public PlacaMae(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("PLACA MÃE");
        return this.valor*VALORTAXAPLACAMAE;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeValidade) {
        this.dataDeFabricacao = dataDeValidade;
    }
}
