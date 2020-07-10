package br.com.sefaz.factory;

import java.sql.*;

public class Connection {

	public static class ConnectionFactory {

		// Nome do usuário do mysql
		private static final String USERNAME = "root";

		// Senha do mysql
		private static final String PASSWORD = "1234";

		// Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/sefaz?useTimezone=true&serverTimezone=America/Sao_Paulo";

		public static java.sql.Connection createConnectionToMySQL() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");

			// Cria a conexão com o banco de dados
			java.sql.Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

			return connection;
		}

		public void main(String[] args) throws Exception {

			// Recupera uma conexão com o banco de dados
			java.sql.Connection con = createConnectionToMySQL();

			// Testa se a conexão é nula
			if (con != null) {
				System.out.println("Conexão obtida com sucesso!" + con);
				con.close();
			}

		}

	}

}
