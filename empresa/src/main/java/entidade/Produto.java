/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import empresa.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void inserirProduto() {
        System.out.println("inserir...");

        Connection conexao = new Conexao().getConexao();

        String sql = "INSERT INTO produto (nome, descricao, preco) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, this.nome);
            stmt.setString(2, this.descricao);
            stmt.setDouble(3, this.preco);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public void setDouble(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setString(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
