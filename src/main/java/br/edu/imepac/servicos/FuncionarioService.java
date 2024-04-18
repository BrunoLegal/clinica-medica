package br.edu.imepac.servicos;

import br.edu.imepac.DAOs.FuncionarioDAO;
import br.edu.imepac.entidades.FuncionarioEntidade;

import java.util.ArrayList;

public class FuncionarioService {
    private FuncionarioDAO funcionarioDAO;

    public Integer salvarFuncionario(FuncionarioEntidade funcionarioEntidade){
        return funcionarioDAO.save(funcionarioEntidade);
    }
    public ArrayList<FuncionarioEntidade> listarTodosFuncionarios(){
        return funcionarioDAO.readAll();
    }
    public FuncionarioEntidade buscarFuncionario(Long id){
        return funcionarioDAO.read(id);
    }
    public Integer atualizarFuncionario(FuncionarioEntidade funcionarioEntidade){
        return funcionarioDAO.update(funcionarioEntidade);
    }
    public Integer deletarFuncionario(Long id){
        return funcionarioDAO.delete(id);
    }

}
