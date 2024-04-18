package br.edu.imepac.entidades;

public class FuncionarioEntidade {
    private Long id;
    private String nome;
    private String cargo;
    private String departamento;

    public FuncionarioEntidade(Long id, String nome, String cargo, String departamento) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public FuncionarioEntidade(String nome, String cargo, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public FuncionarioEntidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
