package ponto.dao;

import ponto.model.Pessoa;
import ponto.bancoDeDados.BancoDeDados;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class PessoaDao {

    public void persist(Pessoa nova) {
        BancoDeDados.pessoas.add(nova);

    }
}
