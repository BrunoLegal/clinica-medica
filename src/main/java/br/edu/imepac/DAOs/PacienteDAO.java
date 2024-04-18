
package br.edu.imepac.DAOs;
import br.edu.imepac.entidades.PacienteEntidade;
import br.edu.imepac.interfaces.InterfaceDAO;

import java.util.ArrayList;

public class PacienteDAO implements InterfaceDAO<PacienteEntidade> {
    public void conectar(){

    };
    public void desconectar(){};

    @Override
    public Integer save(PacienteEntidade paciente) {
        return null;
    }

    @Override
    public ArrayList<PacienteEntidade> readAll() {
        return null;
    }

    @Override
    public PacienteEntidade read(Long id) {
        return null;
    }

    @Override
    public Integer update(PacienteEntidade paciente) {
        return null;
    }

    @Override
    public Integer delete(Long id) {
        return null;
    }


}
