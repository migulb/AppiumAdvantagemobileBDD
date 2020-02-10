#language:pt
#coding: utf-8


Funcionalidade: Busca um produto pela Home

Contexto:
  Dado que estou na Home

  @BuscaHomeComSucesso
	Cenário: Busca Pela Home com Sucesso
	Quando clico em Headphones
	Então escolho o fone HP H2310

	
  @BuscaHomeComFalha
  Esquema do Cenário: Busca Pela Home com Falha
	Quando clico no Menu 
	E clico em login
	E digito meu usuario e senha "<Usuario>" "<Senha>"
	E clico em Login para entrar
	E clico em HeadPhones
	E clico no fone HP H2310 
	E clico em Quantity
	E adiciono um grande quantidade "<Quantidade>"
	E clico em APPLY
	E adiciono no Carrinho
	Então entro no carrinho e verifico a quantidade adicionada "<Quantidade>"
	
	Exemplos:
	
	|Usuario     |Senha    |Quantidade|
	|Usertest124 |Miguel96.|300       |
	
	

