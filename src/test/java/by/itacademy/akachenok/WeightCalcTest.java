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

    @Test
    public void testFormWithValidValuesIdealResult() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String nameTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By nameTextBoxBy = By.xpath(nameTextBoxXpath);
        WebElement nameTextBoxWebElement = driver.findElement(nameTextBoxBy);
        nameTextBoxWebElement.click();
        nameTextBoxWebElement.sendKeys("Sveta");
        String heightTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By heightTextBoxXpathBy = By.xpath(heightTextBoxXpath);
        WebElement heightTextBoxWebElement = driver.findElement(heightTextBoxXpathBy);
        heightTextBoxWebElement.click();
        heightTextBoxWebElement.sendKeys("161");
        String weightTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By weightTextBoxBy = By.xpath(weightTextBoxXpath);
        WebElement weightTextBoxWebElement = driver.findElement(weightTextBoxBy);
        weightTextBoxWebElement.click();
        weightTextBoxWebElement.sendKeys("50");
        String genderFemaleRadioButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderFemaleRadioButtonBy = By.xpath(genderFemaleRadioButtonXpath);
        WebElement genderFemaleRadioButtonWebElement = driver.findElement(genderFemaleRadioButtonBy);
        genderFemaleRadioButtonWebElement.click();
        String calculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By calculateButtonBy = By.xpath(calculateButtonXpath);
        WebElement calculateButtonWebElement = driver.findElement(calculateButtonBy);
        calculateButtonWebElement.click();
        String idealWeightMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By idealWeightMessageBy = By.xpath(idealWeightMessageXpath);
        WebElement idealWeightMessageWebElement = driver.findElement(idealWeightMessageBy);
        String actual = idealWeightMessageWebElement.getText();
        Assertions.assertEquals("Идеальная масса тела", actual);
    }
}
