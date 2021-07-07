package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By clicar = By.id("menuUserLink");
	private By nomedousuariologin = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(1) > div > input");
	private By senhalogin = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > sec-form > sec-view:nth-child(2) > div > input");
	private By entrar = By.cssSelector("#sign_in_btnundefined > font > font");
	private By criarconta = By.cssSelector("body > login-modal > div > div > div.login.ng-scope > a.create-new-account.ng-scope");
	private By nomedousuariocadastro = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(1) > div > input");
	private By email = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By senhacadastro = By.name("passwordRegisterPage");
	private By confirmasenha = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(3) > sec-view:nth-child(2) > div > input");
	private By primeironome = By.cssSelector("#formCover > div:nth-child(2) > div:nth-child(2) > sec-view:nth-child(1) > div > input");
	private By sobrenome = By.name("last_nameRegisterPage");
	private By numerodetelefone = By.cssSelector("#formCover > div:nth-child(2) > div:nth-child(3) > sec-view > div > input");
    private By pais = By.name("countryListboxRegisterPage");
	private By cidade = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(2) > sec-view:nth-child(2) > div > input");
	private By endereco = By.name("addressRegisterPage");
	private By estado = By.name("state_/_province_/_regionRegisterPage");
	private By codigopostal = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(4) > sec-view > div > input");
	private By termosdeaceite = By.name("i_agree");
	private By registro = By.id("register_btnundefined");
	private By japossuiconta = By.cssSelector("#registerPage > article > sec-form > div.center > label.ALREADY_HAVE_AN_ACCOUNT.roboto-medium > a");
	private By Signin = By.cssSelector("#sign_in_btnundefined");
	private By mensagem = By.id("signInResultMessage");
	public By getClicar() {
		return clicar;
	}

	public By getNomedousuariologin() {
		return nomedousuariologin;
	}

	public By getSenhalogin() {
		return senhalogin;
	}

	public By getEntrar() {
		return entrar;
	}

	public By getCriarconta() {
		return criarconta;
	}

	public By getNomedousuariocadastro() {
		return nomedousuariocadastro;
	}

	public By getEmail() {
		return email;
	}

	public By getSenhacadastro() {
		return senhacadastro;
	}

	public By getConfirmasenha() {
		return confirmasenha;
	}

	public By getPrimeironome() {
		return primeironome;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getNumerodetelefone() {
		return numerodetelefone;
	}

	public By getPais() {
		return pais;
	}

	public By getCidade() {
		return cidade;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getEstado() {
		return estado;
	}

	public By getCodigopostal() {
		return codigopostal;
	}

	public By getTermosdeaceite() {
		return termosdeaceite;
	}

	public By getRegistro() {
		return registro;
	}

	public By getJapossuiconta() {
		return japossuiconta;
	}

	public By getSignin() {
		return Signin;
	}

	public By getMensagem() {
		return mensagem;
	}
	
	
	
}
