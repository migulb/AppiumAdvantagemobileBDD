#language:pt
#coding: utf-8


Funcionalidade: Cadastrar Usuario

Contexto:

  Dado que estou na pagina inicial do app 

  @BuscaComSucesso
	Esquema do Cenário: Busca Pela Lupa com Sucesso
	E digito no campo de Busca "<Busca>"
	E aperto na lupa de pesquisa
	E aperto no tablet desejado
	Então adiciono ao carrinho

	Exemplos:
	|Busca |
	|tablet|
	
  @BuscaComFalha
  Esquema do Cenário: Busca Pela Lupa com Falha
  E digito no campo de Busca "<Busca>"
	E aperto na lupa de pesquisa
	
	Exemplos:
	|Busca|
	|mesa |
 

  