package SistemProd.Test;

import SistemProd.Domain.MemoriaRam;
import SistemProd.Domain.PlacaMae;
import SistemProd.Domain.Processador;
import SistemProd.Servico.CalcularImposto;

public class ProdutosTest02 {
    public static void main(String[] args) {
    PlacaMae placaMae = new PlacaMae("x99",600);
    Processador processador = new Processador("Intel",129);
    MemoriaRam memoriaRam = new MemoriaRam("Corsair",500);

    placaMae.setDataDeFabricacao("10/10/2020");
    memoriaRam.setDataDeFabricacao("23/08/2022");
    processador.setDataDeFabricacao("01/12/2008");

    CalcularImposto.calcularImpostoProduto(placaMae);
    CalcularImposto.calcularImpostoProduto(memoriaRam);
    CalcularImposto.calcularImpostoProduto(processador);


    }
}
