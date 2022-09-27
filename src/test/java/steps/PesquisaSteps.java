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

    Pages homePage = new Pages(driver);

    @Dado("^que acesso o site SOC blog$")
    public void que_acesso_o_site_SOC_blog() throws IOException {
        homePage.acessarAplicacao();
        homePage.CapturaScreenshot(driver, "Tela inicial.png");
    }

    @Quando("^informo um assunto em procurar$")
    public void informo_um_assunto_em_procurar() {
        driver.findElement(By.cssSelector(".elementor-search-form__container:nth-child(1) > .elementor-search-form__input")).
                sendKeys("IMPRENSA");
    }

    @Quando("^clico em pesquisar$")
    public void clico_em_pesquisar() {
        homePage.clicarBtnPesquisa();
    }

    @Então("^abre tela de com resultado da pesquisa$")
    public void abre_tela_de_com_resultado_da_pesquisa() throws IOException {

        homePage.resultadoPesquisa();
    }

    @Dado("^que ao entrar no site SOC$")
    public void que_ao_entrar_no_site_SOC() throws InterruptedException, IOException {
        homePage.acessarAplicacao();
    }

    @Quando("^acesso no menu Funcionalidade$")
    public void acesso_no_menu_Funcionalidade() {
        homePage.menuFuncionalidade();
    }

    @Quando("^clico na opção Rede SOCNET$")
    public void clico_na_opção_Rede_SOCNET() {
        homePage.menuRedeSOCNET();
    }

    @Quando("^clico em Buscar credenciados$")
    public void clico_em_Buscar_credenciados() throws InterruptedException {
        homePage.btnBuscarCredenciados();
    }

    @Quando("^preencho o fitro para busca credenciado$")
    public void preencho_o_fitro_para_busca_credenciado() {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ipt-busca-credenciado-2")));
        driver.findElement(By.cssSelector(".collapsed > .elemento-filtro:nth-child(1) .cbx-estilizado")).click();
        driver.findElement(By.cssSelector("#div-filtro-servicos .elemento-filtro:nth-child(1) .cbx-estilizado")).click();
        //driver.findElement(By.cssSelector(".btn:nth-child(2) > span:nth-child(1)")).click();
        driver.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("PREVENT SAFETY MEDICINA MEIO AMBIENTE LTDA");
    }

    @Quando("^clico no botão pesquisar$")
    public void clico_botao_pesquisar() {
        homePage.btnBuscaCredenciadoPesquisar();
    }

    @Quando("^seleciono o credenciado$")
    public void seleciono_o_credenciado() {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .cidade-empresa")));
        driver.findElement(By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .cidade-empresa")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    }

    @Então("^Verificar perfil do credenciado$")
    public static void verificoPerfilCredenciado() {
        String crednciado = driver.findElement(By.cssSelector(".detalhe-nome")).getText();
        Assert.assertEquals("PREVENT SAFETY MEDICINA MEIO AMBIENTE LTDA", crednciado);
    }
}
