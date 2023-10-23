package entidade;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Cliente {

    private Integer id;

    private String primeiroNome;

    private String sobrenome;

    private String email;

    private String cpf;

    private String telefone;

    public Cliente() {
    }

    public void inserir() throws Exception {
        connection con = (connection) DriverManager.getConnection(
                "jdbc:mysql://192.168.0.9:3306/empresa",
                "root", "321654");
        PreparedStatement p;
        p = con.Statement(
                "insert into pessoas(nome, telefone) values(?,?)");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private static class connection {

        public connection() {
        }

        private PreparedStatement Statement(String insert_into_pessoasnome_telefone_values) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
