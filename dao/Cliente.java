package dao;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.cliente;

public class Cliente {
//inserir um novo cliente
    public void inserir(cliente cliente) {
        String sql = "INSERT INTO cliente (nome, email, telefone, data_nascimento, cpf) VALUES (?, ?, ?, ?,)";
        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
           
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            stmt.setDate(4, Date.valueOf(cliente.getDataNascimento()));
            stmt.setString(5, cliente.getCpf());
            stmt.executeUpdate();

            System.out.println("\nCliente inserido com sucesso!");


        } catch (SQLException e) {
            e.printStackTrace();
           
        }
    }



    //listar todos os clientes
     public List<cliente> listarClientes() {
        String sql = "SELECT * FROM cliente";
        List<cliente> clientes = new ArrayList<>();
        try (Connection conexao = Conexao.conectar();
             Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                cliente cliente = new cliente(
                        rs.getString("nome"),        
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getDate("dataNascimento").toLocalDate(),
                        rs.getString("cpf")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    
     // Atualizar (Atualizar informações de um cliente)
    public void atualizarCliente(cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, email = ?, telefone = ?, dataNascimento = ? WHERE cpf = ?";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            stmt.setDate(3, Date.valueOf(cliente.getDataNascimento())); // Conversão correta
            stmt.setString(4, cliente.getCpf());
            stmt.executeUpdate();

            System.out.println("\nCliente atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    }

    //O cliente só pode se deletar a si mesmo, isso se não tiver nenhuma compra em aberto

    
    // Deletar (Deletar um cliente pelo CPF)
        public void deletarCliente(String cpf) {
        String sql = "DELETE FROM cliente WHERE cpf = ?";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            stmt.executeUpdate();

            System.out.println("\nCliente deletado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    





    
}
