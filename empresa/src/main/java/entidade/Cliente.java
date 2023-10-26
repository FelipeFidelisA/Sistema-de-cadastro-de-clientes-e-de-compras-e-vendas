package entidade;

import empresa.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente {

    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public void inserir() {
        System.out.println("inserir...");

        Connection conexao = new Conexao().getConexao();

        String sql = "INSERT INTO cliente (nome, telefone, email, cpf) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, this.nome);
            stmt.setString(2, this.telefone);
            stmt.setString(3, this.email);
            stmt.setString(4, this.cpf);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
