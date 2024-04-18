package br.edu.imepac.entidades;

public class MedicoEntidade {
    private Long id;
    private String nome;
    private String especialidade;
    private String CRM;

    public MedicoEntidade(Long id, String nome, String especialidade, String CRM) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.CRM = CRM;
    }

    public MedicoEntidade(String nome, String especialidade, String CRM) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.CRM = CRM;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
}
