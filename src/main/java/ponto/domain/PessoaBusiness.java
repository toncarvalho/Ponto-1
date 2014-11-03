package ponto.domain;

import ponto.dao.PessoaDao;
import ponto.bancoDeDados.BancoDeDados;
import ponto.model.Pessoa;

import java.util.List;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class PessoaBusiness {

    public void salvar(Pessoa nova) {
            PessoaDao dao = new PessoaDao();
            dao.persist(nova);

    }

    public void listarTudo(){
        List<Pessoa> pessoas = BancoDeDados.pessoas;

        for( int i = 0  ; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }
    }
}
