package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Pages;
import runner.ExecuteTest;

import java.io.IOException;
import java.time.Duration;

public class PesquisaSteps extends ExecuteTest {

    static Pages homePage = new Pages(driver);

    @Então("^Verificar perfil do credenciado$")
    public static void verificoPerfilCredenciado() throws IOException {
        String crednciado = driver.findElement(By.cssSelector(".detalhe-nome")).getText();
        Assert.assertEquals("PREVENT SAFETY MEDICINA MEIO AMBIENTE LTDA", crednciado);
        homePage.CapturaScreenshot(driver, "Verificando perfil credenciado");
    }

    @Dado("^que acesso o site SOC blog$")
    public void que_acesso_o_site_SOC_blog() throws IOException {
        homePage.acessarAplicacao();
        homePage.CapturaScreenshot(driver, "01_Tela inicial");
    }

    @Quando("^clico em pesquisar$")
    public void clico_em_pesquisar() {
        homePage.clicarBtnPesquisa();
    }

    @Quando("^informo um assunto em procurar$")
    public void informo_um_assunto_em_procurar() throws IOException {
        driver.findElement(By.cssSelector(".elementor-search-form__container:nth-child(1) > .elementor-search-form__input")).
                sendKeys("IMPRENSA");
        homePage.CapturaScreenshot(driver, "02_Inserindo pesquisa");
    }

    @Então("^abre tela de com resultado da pesquisa$")
    public void abre_tela_de_com_resultado_da_pesquisa() throws IOException {
        homePage.resultadoPesquisa();
        homePage.CapturaScreenshot(driver, "03_Tela de resultado");
    }

    @Dado("^que ao entrar no site SOC$")
    public void que_ao_entrar_no_site_SOC() throws InterruptedException, IOException {
        homePage.acessarAplicacao();
        homePage.CapturaScreenshot(driver, "01_Tela pesquisa credenciado");
    }

    @Quando("^acesso no menu Funcionalidade$")
    public void acesso_no_menu_Funcionalidade() throws IOException {

        homePage.menuFuncionalidade();
        homePage.CapturaScreenshot(driver, "02_Menu funcionalidade");
    }

    @Quando("^clico na opção Rede SOCNET$")
    public void clico_na_opção_Rede_SOCNET() throws IOException {
        homePage.menuRedeSOCNET();
        homePage.CapturaScreenshot(driver, "03_Acessando rede SOCNET");
    }

    @Quando("^clico em Buscar credenciados$")
    public void clico_em_Buscar_credenciados() throws IOException {
        homePage.btnBuscarCredenciados();
    }

    @Quando("^preencho o fitro para busca credenciado$")
    public void preencho_o_fitro_para_busca_credenciado() throws IOException {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ipt-busca-credenciado-2")));
        driver.findElement(By.cssSelector(".collapsed > .elemento-filtro:nth-child(1) .cbx-estilizado")).click();
        driver.findElement(By.cssSelector("#div-filtro-servicos .elemento-filtro:nth-child(1) .cbx-estilizado")).click();
        driver.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("PREVENT SAFETY MEDICINA MEIO AMBIENTE LTDA");
        homePage.CapturaScreenshot(driver, "Preenchendo filtro");
    }

    @Quando("^clico no botão pesquisar$")
    public void clico_botao_pesquisar() throws IOException {
        homePage.btnBuscaCredenciadoPesquisar();
        homePage.CapturaScreenshot(driver, "Clicando botão pesquisar");
    }

    @Quando("^seleciono o credenciado$")
    public void seleciono_o_credenciado() throws IOException {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .cidade-empresa")));
        driver.findElement(By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .cidade-empresa")).click();
        homePage.CapturaScreenshot(driver, "Selecionando credenciado");
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

    }
}
