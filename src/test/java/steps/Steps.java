package steps;

import static org.junit.Assert.assertEquals;

import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Browsers;
import metodos.Cadastro;
import metodos.Login;
import metodos.Metodos;

public class Steps extends Browsers {

	Cadastro cadastro = new Cadastro();
	Login login = new Login();
	Elementos elementos = new Elementos();
	Metodos metodos = new Metodos();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) throws InterruptedException {

		abrirNavegado("http://advantageonlineshopping.com/#/");
		metodos.esperar();
		metodos.clicar(elementos.getClicar());
		metodos.esperar();
	}

	@Quando("eu realizo o cadastro")
	public void eu_realizo_o_cadastro() throws InterruptedException {
		metodos.clicar(elementos.getCriarconta());
		metodos.esperar();
		cadastro.preencherFormulario("Maria565567", "Maria.Alves78867@gmail.com", "Maria.5626", "Maria", "Alves",
				"11958766493", "Brasil", "SÃo Paulo", "Av. Paulista", "São Paulo", "01311-903");
		metodos.esperar();

	}

	@Entao("eu conseguirei logar no site")
	public void eu_conseguirei_logar_no_site() throws InterruptedException {

		metodos.escrever(elementos.getNomedousuariologin(), "Admin78867");
		metodos.escrever(elementos.getSenhalogin(), "Banana.5626");
		metodos.esperar();
		fecharNavegador();
	}

	@Quando("eu realizo o login com <Nome de usuario> e {string} inavalidos")
	public void eu_realizo_o_login_com_nome_de_usuario_e_inavalidos(String string) throws InterruptedException {
		metodos.esperar();
		metodos.escrever(elementos.getNomedousuariologin(), "Admin1234");
		metodos.escrever(elementos.getSenhalogin(), "Banana.5626");
		metodos.clicar(elementos.getSignin());
		metodos.esperar();
		fecharNavegador();
	}

	@Entao("eu vizualizarei uma {string} de erro")
	public void eu_vizualizarei_uma_de_erro(String string) throws InterruptedException {
		metodos.esperar();
		assertEquals(metodos.pegarMensagem(elementos.getMensagem()), string);
		fecharNavegador();
	}

	@Quando("eu realizo o login com <Nome de usuario> e {string} corretos")	
	public void eu_realizo_o_login_com_nome_de_usuario_e_corretos(String string) throws InterruptedException {
		metodos.esperar();
		metodos.escrever(elementos.getNomedousuariologin(), "Admin1234");
		metodos.escrever(elementos.getSenhalogin(), "Banana.5626");
		metodos.clicar(elementos.getSignin());
		metodos.esperar();
		fecharNavegador();
		
	}

	@Entao("eu acessarei o site com sucesso")
	public void eu_acessarei_o_site_com_sucesso() {
    
		
		
	}

}