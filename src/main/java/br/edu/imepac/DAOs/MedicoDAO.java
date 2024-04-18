
package br.edu.imepac.DAOs;
import br.edu.imepac.entidades.MedicoEntidade;
import br.edu.imepac.interfaces.InterfaceDAO;

import java.util.ArrayList;

public class MedicoDAO implements InterfaceDAO<MedicoEntidade> {
    public void conectar(){

    };
    public void desconectar(){};

    @Override
    public Integer save(MedicoEntidade medico) {
        return null;
    }

    @Override
    public ArrayList<MedicoEntidade> readAll() {
        return null;
    }

    @Override
    public MedicoEntidade read(Long id) {
        return null;
    }

    @Override
    public Integer update(MedicoEntidade medico) {
        return null;
    }

    @Override
    public Integer delete(Long id) {
        return null;
    }


}
