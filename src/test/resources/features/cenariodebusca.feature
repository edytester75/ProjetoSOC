# language: pt

Funcionalidade: Realizar Busca do blog e Busca Credenciado
  Eu como tester vou realizar uma busca no blog
  e uma busca e exibir o perfil de um credenciado

  @Pesquisa-Blog
Cenário:Busca no blog
  Dado que acesso o site SOC blog
  Quando informo um assunto em procurar
  E clico em pesquisar
  Então abre tela de com resultado da pesquisa

  @Pesquisa-Credenciado
Cenário: Busca de Credenciado
  Dado que ao entrar no site SOC
  Quando acesso no menu Funcionalidade
  E clico na opção Rede SOCNET
  E clico em Buscar credenciados
  E preencho o fitro para busca credenciado
  E clico no botão pesquisar
  E seleciono o credenciado
  Então Verificar perfil do credenciado


