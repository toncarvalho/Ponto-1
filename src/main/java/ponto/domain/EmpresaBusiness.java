package ponto.domain;

import ponto.bancoDeDados.BancoDeDados;
import ponto.dao.EmpresaDao;
import ponto.model.Empresa;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Vinicius on 31/10/2014.
 */
public class EmpresaBusiness {
    //verificar regras, validações, e salvar


    public void salvar(Empresa nova) {
        if (valida(nova)) {
            //salvar
            EmpresaDao dao = new EmpresaDao();
            dao.persist(nova);

        }

    }

    private boolean valida(Empresa obj) {


        if (obj == null) {
            System.out.println(" a empresa é nula");
            return false;
        }

        if (obj.getNome() == null) {
            System.out.println(" o nome da  empresa é nulo");
            return false;
        }

        if (obj.getNome().isEmpty()) {
            System.out.println(" o está vazio");
            return false;
        }

        return true;

    }

    public void listarTudo() {

        List<Empresa> empresas = BancoDeDados.empresas;

        for( int i = 0  ; i < empresas.size(); i++) {
            System.out.println(empresas.get(i));
        }


    }

    public void remover(int indice) {

        EmpresaDao teste = new EmpresaDao();
        teste.remove(indice);

    }

    public void pesquisa(String prm){
        List<Empresa> empresas = BancoDeDados.empresas;

        
    }

    public void pesquisar(String pesquisaNome) {
        List<Empresa> empresas = BancoDeDados.empresas;

        for (int i = 0; i < empresas.size() ; i++) {
            if (empresas.get(i).getNome() == pesquisaNome ){
                System.out.println("Achei empresa");
            }else {System.out.println("Empresa não Encontrada");}
        }
    }
}
