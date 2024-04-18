package br.edu.imepac.servicos;

import br.edu.imepac.entidades.MedicoEntidade;

public class MedicoService {
    MedicoDAO medicoDAO;
    public int salvarMedico(MedicoEntidade medico){
        return medicoDAO.save(medico);
    }
    
}
