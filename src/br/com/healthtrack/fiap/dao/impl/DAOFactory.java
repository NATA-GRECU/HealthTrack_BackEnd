package br.com.healthtrack.fiap.dao.impl;

import br.com.healthtrack.fiap.dao.AtividadeFisicaDao;
import br.com.healthtrack.fiap.dao.PesoDao;
import br.com.healthtrack.fiap.dao.impl.AtividadeFisicaDaoImpl;
import br.com.healthtrack.fiap.dao.impl.PesoDaoImpl;

public abstract class DAOFactory {

    public static PesoDao getPesoDao(){return new PesoDaoImpl();}

    public static AtividadeFisicaDao getAtividadeFisicaDao(){return new AtividadeFisicaDaoImpl();}
}
