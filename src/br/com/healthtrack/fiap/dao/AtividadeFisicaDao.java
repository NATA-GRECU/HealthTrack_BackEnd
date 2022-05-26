package br.com.healthtrack.fiap.dao;

import br.com.healthtrack.fiap.entity.AtividadeFisica;

import java.util.List;

public interface AtividadeFisicaDao {

    void insert(AtividadeFisica atividadeFisica);

    List<AtividadeFisica> getAll();

    AtividadeFisica buscarProdutoPorCodigo(int codigo);

    void atualizar(AtividadeFisica atividadeFisica);

    void remover(int codigo);
}
