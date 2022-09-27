package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.ExecuteTest;

import java.time.Duration;

public class Utils extends ExecuteTest {

    public void esperarElemento(By element, int tempo) {
        WebElement elemento = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }
}
