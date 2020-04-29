# language: pt
Funcionalidade: teste locadora
  Eu como usuario
  Quero cadastrar alugueis de filmes
  Para controlar precos e datas de entrega

  Cenario: Devo alugar um filme com sucesso
    Dado um filme
      | estoque | 2 	|
      | preco   | 3 	|
      |tipo 		|comum|
    Quando alugar
    Entao o preco do aluguel sera R$ 3
    E a data de entrega sera em 1 dia
    E o estoque do filme sera de 1 unidade

  Cenario: nao deve alugar filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Entao nao sera possivel alugar por falta de estoque
    E o estoque do filme sera de 0 unidade

  Esquema do Cenario: Deve dar condicoes conforme tipo de aluguel
    Dado um filme com estoque de 2 unidades
    E que o preco de alguel seja R$ <preço>
    E que o tipo de alugel seja <tipo>
    Quando alugar
    Entao o preco do aluguel sera R$ <valor_alguel>
    E a data de entrega sera em <qtsDias> dias
    E a pontuacao recebida sera <pontuacao> pontos

    Exemplos: 
      | preço | tipo      | valor_alguel | qtsDias | pontuacao |
      |     4 | extendido |            8 |       3 |         2 |
      |     4 | comum     |            4 |       1 |         1 |
      |    10 | extendido |           20 |       3 |         2 |
      |     5 | semanal   |           15 |       7 |         3 |
