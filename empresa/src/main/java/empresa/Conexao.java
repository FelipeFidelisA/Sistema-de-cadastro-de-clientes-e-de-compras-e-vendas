/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafael
 */

public class Conexao {
	public static final String SERVIDOR = "jdbc:mysql://localhost:3307/cadastro_cliente";
	public static final String USUARIO = "root";
	public static final String SENHA = "321654";

	public Connection getConexao() {
		try {
			return DriverManager.getConnection(SERVIDOR, USUARIO, SENHA);
		} catch (SQLException e) {
			System.err.println(e);
		}
		return null;
	}
}

    
