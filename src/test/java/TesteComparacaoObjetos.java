import org.junit.Test;
import ponto.model.Pessoa;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class TesteComparacaoObjetos {


    @Test
    public void teste() {
        //////// comparação entre objetos
        Pessoa n1 = new Pessoa();
        n1.setNome("Ze");

        Pessoa n2 = new Pessoa();
        n2.setNome("Andre");

        if (n1.equals(n2)) {
            System.out.println(" são iguais");
        } else {
            System.out.println(" são diferentes");
        }


    }
}
