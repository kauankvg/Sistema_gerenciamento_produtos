package SistemProd.Servico;

import SistemProd.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivos");
    }
}
