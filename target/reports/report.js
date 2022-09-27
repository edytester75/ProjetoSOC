$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cenariodebusca.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar Busca do blog e Busca Credenciado",
  "description": "Eu como tester vou realizar uma busca no blog\r\ne uma busca e exibir o perfil de um credenciado",
  "id": "realizar-busca-do-blog-e-busca-credenciado",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Busca no blog",
  "description": "",
  "id": "realizar-busca-do-blog-e-busca-credenciado;busca-no-blog",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 7,
      "name": "@Pesquisa-Blog"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que acesso o site SOC blog",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "informo um assunto em procurar",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "abre tela de com resultado da pesquisa",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisaSteps.que_acesso_o_site_SOC_blog()"
});
formatter.result({
  "duration": 6083495400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.informo_um_assunto_em_procurar()"
});
formatter.result({
  "duration": 66279600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_em_pesquisar()"
});
formatter.result({
  "duration": 1369420300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.abre_tela_de_com_resultado_da_pesquisa()"
});
formatter.result({
  "duration": 308869200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Busca de Credenciado",
  "description": "",
  "id": "realizar-busca-do-blog-e-busca-credenciado;busca-de-credenciado",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 14,
      "name": "@Pesquisa-Credenciado"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "que ao entrar no site SOC",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "acesso no menu Funcionalidade",
  "keyword": "Quando "
});
formatter.step({
  "line": 18,
  "name": "clico na opção Rede SOCNET",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "clico em Buscar credenciados",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "preencho o fitro para busca credenciado",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "clico no botão pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "seleciono o credenciado",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "Verificar perfil do credenciado",
  "keyword": "Então "
});
formatter.match({
  "location": "PesquisaSteps.que_ao_entrar_no_site_SOC()"
});
formatter.result({
  "duration": 1658644100,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.acesso_no_menu_Funcionalidade()"
});
formatter.result({
  "duration": 129818600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_na_opção_Rede_SOCNET()"
});
formatter.result({
  "duration": 1075540000,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_em_Buscar_credenciados()"
});
formatter.result({
  "duration": 1750702700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.preencho_o_fitro_para_busca_credenciado()"
});
formatter.result({
  "duration": 1834175600,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.clico_botao_pesquisar()"
});
formatter.result({
  "duration": 77215300,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.seleciono_o_credenciado()"
});
formatter.result({
  "duration": 3318677800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisaSteps.verificoPerfilCredenciado()"
});
formatter.result({
  "duration": 41716000,
  "status": "passed"
});
});