package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "C:\\Projetos Java\\ProjetoSOC\\src\\test\\resources\\features",
        tags = {"~@ignore"},
        glue = {"steps"}
)

public class ExecuteTest {

   public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.out.println("Iniciou ");

       driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Finalizou ");
        driver.quit();
    }
}
