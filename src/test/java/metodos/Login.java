package metodos;

public class Login extends Cadastro {

	public void fazerlogin (String nome, String senha) {
		
		metodos.escrever(elementos.getNomedousuariocadastro(), nome);
		metodos.escrever(elementos.getSenhalogin(), senha);
		
	}
	
}
