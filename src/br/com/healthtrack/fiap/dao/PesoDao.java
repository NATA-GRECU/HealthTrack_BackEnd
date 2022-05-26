package br.com.healthtrack.fiap.dao;

import br.com.healthtrack.fiap.entity.Peso;

import java.util.List;

public interface PesoDao {

    void insert(Peso peso);

    List<Peso> getAll();

    Peso buscarProdutoPorCodigo(int codigo);

    void atualizar(Peso peso);

    void remover(int codigo);
}
