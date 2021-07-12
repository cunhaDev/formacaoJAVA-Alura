package com.crud.jdbc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

	//atributos necessarios para realizar a conexao
	private static String url;
	private static String driver;
	private static String usuario;
	private static String senha;
	private static Connection con = null;
	
	//metodo que realiza a conexao
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		if (con == null) {
			Properties properties = new Properties();
			try {
				FileInputStream file = new FileInputStream("C:/formacaoJAVA/JDBC/JDBC.properties");
				properties.load(file);
				url = properties.getProperty("url");
				driver = properties.getProperty("driver");
				usuario = properties.getProperty("usuario");
				senha = properties.getProperty("senha");
				Class.forName(driver);
				con = DriverManager.getConnection(url, usuario, senha);
				System.out.println("Conectou ao Banco...");
			} catch (ClassNotFoundException e) {
				throw new ClassNotFoundException("DataSource: ocorreu um problema ao carregar o driver");
			} catch (IOException e) {
				System.out.println("Arquivo: ocorreu um problema ao carregar o arquivo");
			}
		}
		return con;
	}
	
	public static void closeConnection() {
		if(con != null) {
			try {
				System.out.println("Encerrando conexao com Banco...");
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}

