package br.edu.imepac.servicos;

import br.edu.imepac.DAOs.MedicoDAO;
import br.edu.imepac.entidades.MedicoEntidade;

import java.util.ArrayList;

public class MedicoService {
    private MedicoDAO medicoDAO;
    public Integer salvarMedico(MedicoEntidade medicoEntidade){
        return medicoDAO.save(medicoEntidade);
    }
    public ArrayList<MedicoEntidade> listarTodosMedicos(){
        return medicoDAO.readAll();
    }
    public MedicoEntidade buscarMedico(Long id){
        return medicoDAO.read(id);
    }
    public Integer atualizarMedico(MedicoEntidade medicoEntidade){
        return medicoDAO.update(medicoEntidade);
    }
    public Integer deletarMedico(Long id){
        return medicoDAO.delete(id);
    }
    
}
