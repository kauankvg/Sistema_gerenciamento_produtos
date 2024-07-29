package SistemProd.Servico;

import SistemProd.Domain.MemoriaRam;
import SistemProd.Domain.PlacaMae;
import SistemProd.Domain.Processador;
import SistemProd.Domain.Produto;

public class CalcularImposto {

    public static void calcularImpostoProduto(Produto produto){
        System.out.println("-------Relatório de imposto e valores-------");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor do produto: "+produto.getValor());
        System.out.println("Valor do imposto: "+imposto);
        System.out.println("Valor total: "+(produto.getValor()+imposto));
        System.out.println("----------------");
        if(produto instanceof PlacaMae) {
            PlacaMae placaMae = (PlacaMae) produto;
            System.out.println("Data Fabricação:  \n" + placaMae.getDataDeFabricacao());
            System.out.println("--------------------------------------------");
        }
        if(produto instanceof MemoriaRam){
            MemoriaRam memoriaRam = (MemoriaRam)produto;
            System.out.println("Data de fabricação: \n"+memoriaRam.getDataDeFabricacao());
            System.out.println("--------------------------------------------");
        }
        if(produto instanceof Processador){
            Processador processador = (Processador)produto;
            System.out.println("Data de fabricação: \n"+ processador.getDataDeFabricacao());
            System.out.println("--------------------------------------------");
        }
    }
}
