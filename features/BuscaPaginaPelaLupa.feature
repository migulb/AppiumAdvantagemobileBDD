#language:pt
#coding: utf-8


Funcionalidade: Busca Pela Lupa

Contexto:

  Dado que estou na pagina inicial do app 

  @BuscaComSucesso
	Esquema do Cenário: Busca Pela Lupa com Sucesso
	E digito no campo de Busca "<Busca>"
	E aperto na lupa de pesquisa
	Então aperto no tablet desejado

	Exemplos:
	|Busca           |
	|HP ELITE X2 1011|
	
  @BuscaComFalha
  Esquema do Cenário: Busca Pela Lupa com Falha
  E digito no campo de Busca "<Busca>"
	Então clico na lupa de pesquisa
	
	Exemplos:
	|Busca|
	|mesa |
 

  