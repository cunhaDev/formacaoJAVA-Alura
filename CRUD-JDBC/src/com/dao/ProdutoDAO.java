package com.dao;

import com.dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private Connection conexao;

    public void cadastrarProduto(ProdutoDTO produto) throws SQLException, ClassNotFoundException {
        conexao = new ConexaoDAO().getConnection();
        try {
            String SQL = "INSERT INTO produto (nome, descricao) values (?,?)";
            PreparedStatement pstmt = conexao.prepareStatement(SQL);
            pstmt.setString(1, produto.getNome());
            pstmt.setString(2, produto.getDescricao());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Produto Salvo!");
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO: " + error);
        }
    }

    public List<ProdutoDTO> listarCliente() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoDAO().getConnection();
        List<ProdutoDTO> listProduto = new ArrayList<ProdutoDTO>();
        try {
            String SQL = "SELECT * FROM produto";
            PreparedStatement stmt = conexao.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ProdutoDTO produto = new ProdutoDTO();
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                listProduto.add(produto);
            }
            rs.close();
            stmt.close();
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO: " + error);
        }
        return listProduto;
    }

}
