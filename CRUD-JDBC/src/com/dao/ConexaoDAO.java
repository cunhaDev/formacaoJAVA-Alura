package com.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	private static String url;
	private static String driver;
	private static String usuario;
	private static String senha;
	private static Connection con = null;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		if (con == null) {
			Properties properties = new Properties();
			try {
				FileInputStream file = new FileInputStream("C:/formacaoJAVA/CRUD-JDBC/JDBC.properties");
				properties.load(file);
				url = properties.getProperty("url");
				driver = properties.getProperty("driver");
				usuario = properties.getProperty("usuario");
				senha = properties.getProperty("senha");
				Class.forName(driver);
				con = DriverManager.getConnection(url, usuario, senha);
			} catch (ClassNotFoundException error) {
				JOptionPane.showMessageDialog(null, "ConexaoDAO: " + error);
			} catch (IOException error) {
				JOptionPane.showMessageDialog(null, "ConexaoDAO: " + error);
			}
		}
		return con;
	}
	
	public static void closeConnection() {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
