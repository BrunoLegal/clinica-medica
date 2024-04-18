package br.edu.imepac.DAOs;
import br.edu.imepac.entidades.ConsultaEntidade;
import br.edu.imepac.interfaces.InterfaceDAO;

import java.util.ArrayList;

public class ConsultaDAO implements InterfaceDAO<ConsultaEntidade> {
    public void conectar(){

    };
    public void desconectar(){};

    @Override
    public Integer save(ConsultaEntidade consulta) {
        return null;
    }

    @Override
    public ArrayList<ConsultaEntidade> readAll() {
        return null;
    }

    @Override
    public ConsultaEntidade read(Long id) {
        return null;
    }

    @Override
    public Integer update(ConsultaEntidade consulta) {
        return null;
    }

    @Override
    public Integer delete(Long id) {
        return null;
    }

}
