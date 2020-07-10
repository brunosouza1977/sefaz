package br.com.sefaz.factory;

public class TesteSefaz {

	public static void main(String[] args) {

		ClienteDAO clienteDAO = new ClienteDAO();

		// Cria um novo registro
		Clientes cliente = new Clientes();
		cliente.setNome("Jaspion");
		cliente.setEmail("jaspion@teste.com");
		cliente.setSenha("universo");
		cliente.setDdd(81);
		cliente.setTelefone("99995544");

		clienteDAO.save(cliente);
		System.out.println("Registro gravado com sucesso...");

		// Atualiza um registro existente (id = 2)
		//Clientes cliente1 = new Clientes();
		//cliente1.setNome("Sheylla Melo");

		//clienteDAO.update(cliente1);

		// Remove um registro existente (id = 1)
		//clienteDAO.removeById(1);

		// Lista todos os registros
		for (Clientes c : ClienteDAO.getClientes()) {

			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Senha: " + c.getSenha());
			System.out.println("DDD: " + c.getDdd());
			System.out.println("Telefone: " + c.getTelefone());
		}
	}
}


