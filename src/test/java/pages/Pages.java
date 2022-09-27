package pages;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Pages {
    WebDriver driver;

    public Pages(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() throws IOException {
        driver.manage().window().maximize();
        driver.get(" https://ww2.soc.com.br/blog/");
        Assert.assertTrue("Não acessou a aplicação", driver.findElement(By.id("n2-ss-18item2")).isDisplayed());
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

    public void CapturaScreenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Projetos Java\\ProjetoSOC\\IMG\\" + fileName + ""));
    }
}
