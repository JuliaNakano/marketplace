package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.produto;
import model.mercante;
import model.categoria;
import model.produto;

public class Produto {
     public void inserir(produto produto) {
        String sql = "INSERT INTO produto(nome, valor_unitario, descricao,categoria_codigo, mercante_codigo ) VALUES (?, ?, ?, ?,?)";
        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
           
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor_unitario());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setString(4, produto.getDescricao()); 
            stmt.setInt(5, produto.getCategoria_codigo());
            stmt.setInt(6, produto.getMercante_codigo());

            stmt.executeUpdate();

            System.out.println("\nProduto inserido com sucesso!");


        } catch (SQLException e) {
            e.printStackTrace();
           
        }
    }

        // Listar todas os produtos
    public List<produto> listarProdutos() {

        List<produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        

        try (Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                produto produto = new produto(
                        rs.getInt("codigo"),
                        rs.getString("nome"),
                        rs.getDouble("valor_unitario"),
                        rs.getInt("quantidade"),
                        rs.getString("descricao"),
                        rs.getInt("categoria_codigo"),
                        rs.getInt("mercante_codigo")
                );
                lista.add(produto);
            }
            return lista;
        } catch (SQLException e) {
            e.printStackTrace();
            return lista;
        }
    }

    // Atualizar (Atualizar informações de um produto)
    public void atualizarProduto(produto produto) {
        String sql = "UPDATE produto SET nome = ?, valor_unitario = ?, quantidade = ?, descricao = ?, categoria_codigo = ?, mercante_codigo = ? WHERE codigo = ?";
        
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getValor_unitario());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setString(4, produto.getDescricao());
            stmt.setInt(5, produto.getCategoria_codigo());
            stmt.setInt(6, produto.getMercante_codigo());
            stmt.setInt(7, produto.getCodigo());

            stmt.executeUpdate();
            System.out.println("\nProduto atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Deletar (Deletar um produto pelo código)
    public void deletarProduto(int codigo) {
        String sql = "DELETE FROM produto WHERE codigo = ?";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
            System.out.println("\nProduto deletado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    
}
