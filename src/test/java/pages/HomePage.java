package pages;

import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.manage().window().maximize();
        driver.get(" https://ww2.soc.com.br/blog/");
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("n2-ss-18item2")).isDisplayed());
    }
    public void informarAssuntoParaPesquisa(){
        driver.findElement(By.cssSelector(".elementor-search-form__container:nth-child(1) > .elementor-search-form__input")).
                sendKeys("IMPRENSA");
    }

    public void clicarBtnPesquisa(){
        driver.findElement(By.cssSelector(".elementor-search-form__submit > .fas")).click();
    }

    public void resultadoPesquisa(){
        String texto_pesquisa = driver.findElement(By.cssSelector(".elementor-element-a57d20c .elementor-heading-title")).getText();
        Assert.assertEquals("Resultados da Pesquisa por: IMPRENSA", texto_pesquisa);
    }
    public void btnBuscarCredenciados(){
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Buscar credenciados")));
        driver.findElement(By.linkText("Buscar credenciados")).click();
    }

    public void menuFuncionalidade() {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Funcionalidades")));
        driver.findElement(By.linkText("Funcionalidades")).click();
    }
    public void menuRedeSOCNET() {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Rede SOCNET")));
        driver.findElement(By.linkText("Rede SOCNET")).click();

    }
    public void btnBuscaCredenciadoPesquisar() {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa-search")));
        driver.findElement(By.cssSelector(".fa-search")).click();
    }
    public void btnexibirPerfilCredenciado() {
        WebElement myDynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn-estreito")));
        driver.findElement(By.cssSelector(".btn-estreito")).click();
    }

}
