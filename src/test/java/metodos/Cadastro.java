package metodos;

import elementos.Elementos;

public class Cadastro {
	
	Metodos metodos = new Metodos();
    Elementos elementos = new Elementos();
    
    public void preencherFormulario(String usuarionome, String email, String senha, String nome,  String sobrenome, String telefone, String pais, String cidade, String endereco, String estado, String caixapostal) throws InterruptedException {
    	
    	metodos.escrever(elementos.getNomedousuariocadastro(), usuarionome);
    	metodos.escrever(elementos.getEmail(), email);
    	metodos.escrever(elementos.getSenhacadastro(), senha);
    	metodos.escrever(elementos.getConfirmasenha(), senha);
    	metodos.escrever(elementos.getPrimeironome(), nome);
    	metodos.escrever(elementos.getSobrenome(), sobrenome);
    	metodos.escrever(elementos.getNumerodetelefone(), telefone);
    	metodos.seleciona(elementos.getPais(), pais);
    	metodos.escrever(elementos.getCidade(), cidade);
    	metodos.escrever(elementos.getEndereco(), endereco);
    	metodos.escrever(elementos.getEstado(), estado);
    	metodos.escrever(elementos.getCodigopostal(), caixapostal);
    	metodos.clicar(elementos.getTermosdeaceite());
    	Thread.sleep(2000);
    	metodos.clicar(elementos.getRegistro());
    	metodos.esperar();
    	metodos.clicar(elementos.getJapossuiconta());
    	
    	
    }
	

}






