/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author aluno
 */
public class Cliente {
    private Integer id;
    
    private String primeiroNome;
    
    private String sobrenome;
    
    private String email;
    
    private String cpf;
    
    private String telefone;

    public Cliente() {
    }
    
    public void inserir() throws Exception{
        connection con = (connection) DriverManager.getConnection(
               "jdbc:mysql://(ip):3306/(nome do bd)",
                "root", "123456789");
        PreparedStatement p = con.Statement(
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
    
    
}
