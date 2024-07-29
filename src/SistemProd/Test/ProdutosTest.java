package SistemProd.Test;

import SistemProd.Domain.MemoriaRam;
import SistemProd.Domain.PlacaMae;
import SistemProd.Domain.Processador;
import SistemProd.Servico.CalcularImposto;

public class ProdutosTest {
    public static void main(String[] args) {
    PlacaMae placaMae = new PlacaMae("x99",600);
    Processador processador = new Processador("Intel",129);
    MemoriaRam memoriaRam = new MemoriaRam("Corsair",500);

    CalcularImposto.calcularImpostoProduto(placaMae);
    CalcularImposto.calcularImpostoProduto(processador);
    CalcularImposto.calcularImpostoProduto(memoriaRam);


    }
}
