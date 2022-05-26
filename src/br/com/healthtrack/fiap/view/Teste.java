package br.com.healthtrack.fiap.view;

import br.com.healthtrack.fiap.dao.impl.DAOFactory;
import br.com.healthtrack.fiap.entity.AtividadeFisica;
import br.com.healthtrack.fiap.entity.Peso;

import java.util.*;

public class Teste {

    public static void main(String[] args) {
        // INSERT / getAll PESO
        /*Peso peso = new Peso();

        peso.setPeso(91.1);
        peso.setIdUsuario(1);
        Date date = new Date();
        peso.setDataPesagem(new java.sql.Date(date.getTime()));

        DAOFactory.getPesoDao().insert(peso); */

        List<Peso> pesos = DAOFactory.getPesoDao().getAll();

        for(Peso peso1 : pesos)
        {
            System.out.println(peso1.toString());
        }

        // INSERT / getAll Atividade Fisica

        /*AtividadeFisica atividadeFisica = new AtividadeFisica();

        atividadeFisica.setNomeAtividadeFisica("Supino");
        atividadeFisica.setIdUsuario(1);

        DAOFactory.getAtividadeFisicaDao().insert(atividadeFisica);*/

        List<AtividadeFisica> atividadeFisicas = DAOFactory.getAtividadeFisicaDao().getAll();

        for (AtividadeFisica atividadeFisica1 : atividadeFisicas)
        {
            System.out.println("\n"+atividadeFisica1.toString());
        }

    }
}
