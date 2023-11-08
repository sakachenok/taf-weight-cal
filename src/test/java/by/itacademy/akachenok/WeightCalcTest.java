package by.itacademy.akachenok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {

    @Test
    public void testFormWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String CalculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By CalculateButtonBy = By.xpath(CalculateButtonXpath);
        WebElement CalculateButtonWebElement = driver.findElement(CalculateButtonBy);
        CalculateButtonWebElement.click();
        String FailureMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By FailureMessageBy = By.xpath(FailureMessageXpath);
        WebElement FailureMessageWebElement = driver.findElement(FailureMessageBy);
        String actual = FailureMessageWebElement.getText();
        Assertions.assertEquals("Не указано имя.\n" + "Рост должен быть в диапазоне 50-300 см.\n" + "Вес должен быть в диапазоне 3-500 кг.\n" + "Не указан пол.", actual);
    }
}
