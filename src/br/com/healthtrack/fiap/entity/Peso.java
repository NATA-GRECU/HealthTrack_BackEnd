package br.com.healthtrack.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Peso implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private double peso;
    private int idUsuario;
    private java.sql.Date dataPesagem;

    public Peso(int id, double peso, int idUsuario, java.sql.Date dataPesagem) {
        this.id = id;
        this.peso = peso;
        this.idUsuario = idUsuario;
        this.dataPesagem = dataPesagem;
    }

    public Peso(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public java.sql.Date getDataPesagem() {
        return dataPesagem;
    }

    public void setDataPesagem(java.sql.Date dataPesagem) {
        this.dataPesagem = dataPesagem;
    }

    @Override
    public String toString()
    {
        return "[id="+ id+", peso="+peso+", idUsuario="+idUsuario+", DataPesagem="+dataPesagem+"]";
    }
}
