import org.junit.Test;
import ponto.domain.PessoaBusiness;
import ponto.model.Endereco;
import ponto.model.Pessoa;

import java.util.ArrayList;

/**
 * Created by Vinicius on 03/11/2014.
 */
public class TestePessoa {

    @Test
    public void testaPessoa(){

        Pessoa novo = new Pessoa();

        novo.setNome("Vinicius");
        novo.setCpf("03888401234");
        novo.setNumeroPis("128837758827");
        novo.setRg("62506612");

        ArrayList<Endereco> enderecoPessoa = new ArrayList<Endereco>();

        Endereco ep = new Endereco();
        ep.setLogradouro("Rua Embarcação");
        ep.setCep("87025260");
        ep.setBairro("Pq das Grevileas III");
        ep.setCidade("Maringa");
        ep.setEstado("PR");
        ep.setNumero("91");

        enderecoPessoa.add(ep);

        novo.setEnderecoList(enderecoPessoa);

        PessoaBusiness business = new PessoaBusiness();

        business.salvar(novo);

        business.listarTudo();


    }

}
