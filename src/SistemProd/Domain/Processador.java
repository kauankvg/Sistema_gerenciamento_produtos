package SistemProd.Domain;

public class Processador extends Produto {
    private String dataDeFabricacao;
    public static final double VALORTAXAPROCESSADOR = 0.21;
    public Processador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("PROCESSADOR");
        return valor*VALORTAXAPROCESSADOR;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
}
