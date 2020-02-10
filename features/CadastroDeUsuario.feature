#language:pt
#coding: utf-8

Funcionalidade: Cadastrar Usuario

Contexto:

  Dado a abertura do appAdvantage clico no menu esquerdo
  E clico em login e depois em SIGN UP TODAY para abrir a tela de cadastros

@CadadastroPositivo
  Esquema do Cenário: Cadastro com Sucesso
  E Digito Usuario "<Usuario>"
  E o Email "<Email>"
  E a Senha "<Senha>"
  E confirmo a Senha "<ConfirmaSenha>"
  E digito primeiro Nome "<PrimeiroNome>"
  E o ultimo nome "<UltimoNome>"
  E o telefone "<Telefone>"
  E o Pais
  E o estado "<Estado>"
  E o Endereco "<Endereco>"
  E a cidade "<Cidade>"
  E o CEP "<CEP>"
  E clico em confirmar no botão de Confirmar Cadastro
  Então clico no menu "<Usuario>"
   
  Exemplos: 
  |Usuario    |Email           | Senha      |ConfirmaSenha|PrimeiroNome|UltimoNome   |Telefone     |Estado         |Endereco      |Cidade         |CEP           |
  |Usertest138|miguel@email.com|Miguel96.   |Miguel96.    |Miguel      |Bruno        |(11)999999999|São Paulo      |Rua Tal de Tal|Taboão da Serra|09987899      |
   
@CadastroNegativo
Esquema do Cenário: Cadastro Negativo

  E Digito Usuario "<Usuario>"
  E o Email "<Email>"
  E a Senha "<Senha>"
  E confirmo a Senha "<ConfirmaSenha>"
  E digito primeiro Nome "<PrimeiroNome>"
  E o ultimo nome "<UltimoNome>"
  E o telefone "<Telefone>"
  E o Pais
  E o estado "<Estado>"
  E o Endereco "<Endereco>"
  E a cidade "<Cidade>"
  E o CEP "<CEP>" 
  E apos preencher todos os dados tento cadastrar um usuario ja existente
  Então clico no menu do lado esquerdo
 Exemplos:
  |Usuario    |Email           | Senha      |ConfirmaSenha|PrimeiroNome|UltimoNome  |Telefone       |Estado         |Endereco      |Cidade         |CEP           |
  |Usertest138|miguel@email.com|Miguel96.   |Miguel96.    |Miguel      |Bruno       |(11)999999999  |São Paulo      |Rua Tal de Tal|Taboão da Serra|09987899      |
