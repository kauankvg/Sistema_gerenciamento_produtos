package SistemProd.Test;

import SistemProd.Repositorio.Repositorio;
import SistemProd.Servico.RepositorioArquivo;
import SistemProd.Servico.RepositorioBancoDeDados;
import SistemProd.Servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar();
    }
}
