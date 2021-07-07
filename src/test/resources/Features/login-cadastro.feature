#language: pt
#Author: Nathalyalves15@live.com


Funcionalidade: Eu como usuario quero me cadastrar e efetuar login


 

  Cenario: Realizar cadastro
    Dado que eu esteja no site "http://advantageonlineshopping.com"
    Quando eu realizo o cadastro 
    Então eu conseguirei logar no site
   
  
  Cenario: Realizar login com informacoes invalidas 
    Dado que eu esteja no site "http://advantageonlineshopping.com"
    Quando eu realizo o login com <Nome de usuario> e <Senha> inavalidos
    Então eu vizualizarei uma <Mensagem> de erro 
    
     Exemplos: 
      | Nome do usuario    |  Senha              |  Mensagem                       |
      |   "Admin1234"      | "Banana.5626"       | "Usuário ou senha incorretos."  |
      |   "Admin78867"     |   "Banana"          |  "Usuário ou senha incorretos." |



   Cenario: Realizar login com sucesso
    Dado que eu esteja no site "http://advantageonlineshopping.com"
    Quando eu realizo o login com <Nome de usuario> e <Senha> corretos 
    Então eu acessarei o site com sucesso 
    
      Exemplos: 
      | Nome do usuario    |  Senha                   | 
      |   "Admin78867"     |   "Banana.5626"          | 
    
    