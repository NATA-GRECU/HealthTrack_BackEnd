package br.com.healthtrack.fiap.dao.impl;

import br.com.healthtrack.fiap.dao.AtividadeFisicaDao;
import br.com.healthtrack.fiap.entity.AtividadeFisica;
import br.com.healthtrack.fiap.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AtividadeFisicaDaoImpl implements AtividadeFisicaDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(AtividadeFisica atividadeFisica) {
        try {
            conexao = ConnectionManager.getInstance().getConnetion();
            stt = conexao.prepareStatement("INSERT INTO T_ATIVIDADE_FISICA (id_atividade_fisica, nm_atividade_fisica, " +
                    "cd_usuario) VALUES(SEQ_ATV_FIS.NEXTVAL,?,?)");

            stt.setString(1, atividadeFisica.getNomeAtividadeFisica());
            stt.setInt(2, atividadeFisica.getIdUsuario());
            stt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<AtividadeFisica> getAll() {
        List<AtividadeFisica> atividadeFisicas = new ArrayList<>();
        ResultSet rs = null;

        try {
            conexao = ConnectionManager.getInstance().getConnetion();
            stt = conexao.prepareStatement("SELECT * FROM T_ATIVIDADE_FISICA");
            rs = stt.executeQuery();

            while (rs.next())
            {
                AtividadeFisica atividadeFisica = new AtividadeFisica();

                atividadeFisica.setId(rs.getInt("id_atividade_fisica"));
                atividadeFisica.setNomeAtividadeFisica(rs.getString("nm_atividade_fisica"));
                atividadeFisica.setIdUsuario(rs.getInt("cd_usuario"));

                atividadeFisicas.add(atividadeFisica);
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally {
            try {
                stt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return atividadeFisicas;
    }

    @Override
    public AtividadeFisica buscarProdutoPorCodigo(int codigo) {
        return null;
    }

    @Override
    public void atualizar(AtividadeFisica atividadeFisica) {

    }

    @Override
    public void remover(int codigo) {

    }
}
