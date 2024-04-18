package br.edu.imepac.entidades;

import br.edu.imepac.entidades.enums.GeneroEnums;

import java.sql.Date;

public class PacienteEntidade {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private String historicoMedico;
    private GeneroEnums genero;

    public PacienteEntidade(Long id, String nome, Date dataNascimento, String historicoMedico, GeneroEnums genero) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.historicoMedico = historicoMedico;
        this.genero = genero;
    }

    public PacienteEntidade(String nome, Date dataNascimento, String historicoMedico, GeneroEnums genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.historicoMedico = historicoMedico;
        this.genero = genero;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public GeneroEnums getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnums genero) {
        this.genero = genero;
    }



}
