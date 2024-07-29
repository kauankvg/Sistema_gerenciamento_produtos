package SistemProd.Domain;

public class MemoriaRam extends Produto{
    private String dataDeFabricacao;
    public static final double VALORTAXAMEMORIARAM = 0.21;
    public MemoriaRam(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("MEMÓRIA RAM");
        return this.valor * VALORTAXAMEMORIARAM;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
}
