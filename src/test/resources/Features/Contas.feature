# language: pt

Funcionalidade: Contas
Como um usuario
Quero cadastrar contas
Para distribuir meu dinheiro de forma organizada.

Cenario: Deve inserir uma conta com sucesso
Dado que estou acessando a aplicacao
Quando inserir o usuario "teste1010@gmail.com">
E a senha "123456"
E seleciono entrar
Entao visualizo a pagina inicial
Quando seleciono contas
E seleciono adicionar
E informo a conta "Conta de Teste"
E seleciono Salvar
Entao a conta e inserida com sucesso.

@ignore
Cenario: Nao deve inserir uma conta sem nome
Dado que estou acessando a aplicacao
Quando inserir o usuario "<teste1010@teste.com>"
E a senha "<123456>"
E seleciono entrar
Entao visualizo a pagina inicial
Quando seleciono contas
E seleciono adicionar
E seleciono salvar
Entao sou notificado que o nome da conta e obrigatorio

@ignore
Cenario: Nao deve inserir uma conta com nome ja existente
Dado que estou acessando a aplicacao
Quando inserir o usuario "<seu usuario">
E a senha "<sua senha>"
E seleciono entrar
Entao visualizo a pagina inicial
Quando seleciono contas
E seleciono adicionar
E informo a conta "Conta de Teste"
E seleciono salvar
Entao sou notificado que ja tem uma conta com esse nome

