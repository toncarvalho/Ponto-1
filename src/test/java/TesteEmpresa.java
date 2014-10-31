import org.junit.Test;
import ponto.bancoDeDados.BancoDeDados;
import ponto.domain.EmpresaBusinnes;
import ponto.domain.PessoaBussines;
import ponto.model.Empresa;
import ponto.model.Endereco;

import java.util.ArrayList;

/**
 * Created by Vinicius on 21/10/2014.
 */
public class TesteEmpresa {

    @Test
    public void testaEmpresa(){

        Empresa nova = new Empresa();

        nova.setNome("Empresa Modelo");
        nova.setCnpj("61080735000199");
        nova.setInscricaoEstadual("213149995");

        ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

        Endereco e1 = new Endereco();
        e1.setLogradouro("Rua e1");
        e1.setCep("87230923");
        e1.setBairro("Pq das Grevileas");
        e1.setCidade("Maringa");
        e1.setEstado("PR");
        e1.setNumero("910");

        enderecos.add(e1);

        nova.setEnderecoList(enderecos);

        EmpresaBusinnes bussines = new EmpresaBusinnes();

        bussines.salvar(nova);

        bussines.listarTudo();



    }
}
