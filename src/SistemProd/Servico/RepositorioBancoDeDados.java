package SistemProd.Servico;

import SistemProd.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
