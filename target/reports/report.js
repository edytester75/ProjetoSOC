$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cenariodebusca.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Realizar Busca do blog e Busca Credenciado",
  "description": "Eu como tester vou realizar uma busca no blog\r\ne uma busca e exibir o perfil de um credenciado",
  "id": "realizar-busca-do-blog-e-busca-credenciado",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Pesquisa"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Busca no blog",
  "description": "",
  "id": "realizar-busca-do-blog-e-busca-credenciado;busca-no-blog",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@Pesquisa-Blog"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que acesso o site SOC blog",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "informo um assunto em procurar",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clico em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "abre tela de com resultado da pesquisa",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisaSteps.que_acesso_o_site_SOC_blog()"
});
formatter.result({
  "duration": 4821182700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.informo_um_assunto_em_procurar()"
});
formatter.result({
  "duration": 403947600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_em_pesquisar()"
});
formatter.result({
  "duration": 1311989400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.abre_tela_de_com_resultado_da_pesquisa()"
});
formatter.result({
  "duration": 294333400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Busca de Credenciado",
  "description": "",
  "id": "realizar-busca-do-blog-e-busca-credenciado;busca-de-credenciado",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 15,
      "name": "@Pesquisa-Credenciado"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "que ao entrar no site SOC",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "acesso no menu Funcionalidade",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "clico na opção Rede SOCNET",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "clico em Buscar credenciados",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "preencho o fitro para busca credenciado",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "clico no botão pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "seleciono o credenciado",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "Verificar perfil do credenciado",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisaSteps.que_ao_entrar_no_site_SOC()"
});
formatter.result({
  "duration": 1414946200,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.acesso_no_menu_Funcionalidade()"
});
formatter.result({
  "duration": 563621500,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_na_opção_Rede_SOCNET()"
});
formatter.result({
  "duration": 1450587900,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_em_Buscar_credenciados()"
});
formatter.result({
  "duration": 355804200,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.preencho_o_fitro_para_busca_credenciado()"
});
formatter.result({
  "duration": 1056294700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_botao_pesquisar()"
});
formatter.result({
  "duration": 354215800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.seleciono_o_credenciado()"
});
formatter.result({
  "duration": 3546521300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.verificoPerfilCredenciado()"
});
formatter.result({
  "duration": 278049100,
  "status": "passed"
});
});