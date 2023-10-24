package entidade;

import empresa.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente {

    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;

    public Cliente(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public void inserir() {
        System.out.println("inserir...");

        Connection conexao = new Conexao().getConexao();

        String sql = "INSERT INTO tb_aluno (nome, telefone, email, cpf) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, this.nome);
            stmt.setString(2, this.telefone);
            stmt.setString(3, this.email);
            stmt.setString(4, this.cpf);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
