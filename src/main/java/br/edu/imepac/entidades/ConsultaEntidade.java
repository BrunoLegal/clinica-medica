package br.edu.imepac.entidades;

import java.sql.Date;

public class ConsultaEntidade {
    private Long id;
    private Long idPaciente;
    private Long idMedico;
    private String motivo;
    private Date data;

    public ConsultaEntidade(Long id, Long idPaciente, Long idMedico, String motivo, Date data) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.motivo = motivo;
        this.data = data;
    }

    public ConsultaEntidade(Long idPaciente, Long idMedico, String motivo, Date data) {
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.motivo = motivo;
        this.data = data;
    }

    public ConsultaEntidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
