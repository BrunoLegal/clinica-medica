
package br.edu.imepac.DAOs;
import br.edu.imepac.entidades.FuncionarioEntidade;
import br.edu.imepac.interfaces.InterfaceDAO;

import java.util.ArrayList;

public class FuncionarioDAO implements InterfaceDAO<FuncionarioEntidade> {
    public void conectar(){

    };
    public void desconectar(){};

    @Override
    public Integer save(FuncionarioEntidade funcionario) {
        return null;
    }

    @Override
    public ArrayList<FuncionarioEntidade> readAll() {
        return null;
    }

    @Override
    public FuncionarioEntidade read(Long id) {
        return null;
    }

    @Override
    public Integer update(FuncionarioEntidade funcionario) {
        return null;
    }

    @Override
    public Integer delete(Long id) {
        return null;
    }


}
