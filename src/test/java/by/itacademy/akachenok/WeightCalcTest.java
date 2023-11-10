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
        String calculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By calculateButtonBy = By.xpath(calculateButtonXpath);
        WebElement calculateButtonWebElement = driver.findElement(calculateButtonBy);
        calculateButtonWebElement.click();
        String failureMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By failureMessageBy = By.xpath(failureMessageXpath);
        WebElement failureMessageWebElement = driver.findElement(failureMessageBy);
        String actual = failureMessageWebElement.getText();
        Assertions.assertEquals("Не указано имя.\n" + "Рост должен быть в диапазоне 50-300 см.\n" + "Вес должен быть в диапазоне 3-500 кг.\n" + "Не указан пол.", actual);
    }
}
