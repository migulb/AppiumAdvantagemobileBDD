#language:pt
#coding: utf-8


Funcionalidade: Busca um produto pela Home

Contexto:

  @BuscaComSucesso
	Cenário: Busca Pela Lupa com Sucesso
	Dado que estou na Home clico em Headphones
	Então clico no fone HP H2310

	
  @BuscaComFalha
  Esquema do Cenário: Busca Pela Lupa com Falha
	Dado que estou na Home no menu
	E clico em login
	E digito meu usuario e senha "<Usuario>" "<Senha>"
	E clico em Login para entrar
	E clico em HeadPhones
	E clico no fone HP H2310 
	E clico em Quantity
	E adiciono um grande quantidade
	E clico em APPLY
	E adiciono no Carrinho
	Então entro no carrinho e verifico a quantidade adicionada
	
	Exemplos:
	
	|Usuario     |Senha    |
	|Usertest124 |Miguel96.|
	
	

