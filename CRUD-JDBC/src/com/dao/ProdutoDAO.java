package com.dao;

import com.dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    
    private Connection conexao;
    
    public void cadastrarProduto(ProdutoDTO produto) throws SQLException, ClassNotFoundException{
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

}
