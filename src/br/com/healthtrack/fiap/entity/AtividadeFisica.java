package br.com.healthtrack.fiap.entity;

import java.io.Serializable;

public class AtividadeFisica implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nomeAtividadeFisica;
    private int idUsuario;

    public AtividadeFisica(int id, String nomeAtividadeFisica, int idUsuario) {
        this.id = id;
        this.nomeAtividadeFisica = nomeAtividadeFisica;
        this.idUsuario = idUsuario;
    }

    public AtividadeFisica(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAtividadeFisica() {
        return nomeAtividadeFisica;
    }

    public void setNomeAtividadeFisica(String nomeAtividadeFisica) {
        this.nomeAtividadeFisica = nomeAtividadeFisica;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString()
    {
        return "[id="+ id+", nomeAtividade="+nomeAtividadeFisica+", idUsuario="+idUsuario+"]";
    }
}
