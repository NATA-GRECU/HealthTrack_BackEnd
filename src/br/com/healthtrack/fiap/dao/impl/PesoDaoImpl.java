package br.com.healthtrack.fiap.dao.impl;

import br.com.healthtrack.fiap.dao.PesoDao;
import br.com.healthtrack.fiap.entity.Peso;
import br.com.healthtrack.fiap.jdbc.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PesoDaoImpl implements PesoDao {

    Connection conexao;
    PreparedStatement stt;

    @Override
    public void insert(Peso peso) {

        try {
            conexao = ConnectionManager.getInstance().getConnetion();
            stt = conexao.prepareStatement("INSERT INTO T_PESO (id_peso, num_peso, cd_usuario, dt_peso) " +
                                                "VALUES(SEQ_PESO.NEXTVAL,?,?,?)");

            stt.setDouble(1, peso.getPeso());
            stt.setInt(2, peso.getIdUsuario());
            stt.setDate(3, peso.getDataPesagem());
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
    public List<Peso> getAll() {
        List<Peso> pesos = new ArrayList<>();
        ResultSet rs = null;

        try {
            conexao = ConnectionManager.getInstance().getConnetion();
            stt = conexao.prepareStatement("SELECT * FROM T_PESO");
            rs = stt.executeQuery();

            while (rs.next())
            {

                java.sql.Date data = rs.getDate("DT_PESO");
                Calendar dtPeso = Calendar.getInstance();
                dtPeso.setTimeInMillis(data.getTime());

                Peso peso = new Peso();

                peso.setId(rs.getInt("id_peso"));
                peso.setPeso(rs.getDouble("num_peso"));
                peso.setIdUsuario(rs.getInt("cd_usuario"));
                peso.setDataPesagem(rs.getDate("DT_PESO"));

                pesos.add(peso);
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

        return pesos;
    }

    @Override
    public Peso buscarProdutoPorCodigo(int codigo) {
        return null;
    }

    @Override
    public void atualizar(Peso Peso) {

    }

    @Override
    public void remover(int codigo) {

    }
}
