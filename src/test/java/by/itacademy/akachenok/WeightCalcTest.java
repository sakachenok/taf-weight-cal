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

    @Test
    public void testFormWithValidValuesSmallWeightResult() {
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
        weightTextBoxWebElement.sendKeys("30");
        String genderFemaleRadioButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderFemaleRadioButtonBy = By.xpath(genderFemaleRadioButtonXpath);
        WebElement genderFemaleRadioButtonWebElement = driver.findElement(genderFemaleRadioButtonBy);
        genderFemaleRadioButtonWebElement.click();
        String calculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By calculateButtonBy = By.xpath(calculateButtonXpath);
        WebElement calculateButtonWebElement = driver.findElement(calculateButtonBy);
        calculateButtonWebElement.click();
        String smallWeightMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By smallWeightMessageBy = By.xpath(smallWeightMessageXpath);
        WebElement smallWeightMessageWebElement = driver.findElement(smallWeightMessageBy);
        String actual = smallWeightMessageWebElement.getText();
        Assertions.assertEquals("Слишком малая масса тела", actual);
    }

    @Test
    public void testFormWithValidValuesHighWeightResult() {
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
        weightTextBoxWebElement.sendKeys("70");
        String genderFemaleRadioButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderFemaleRadioButtonBy = By.xpath(genderFemaleRadioButtonXpath);
        WebElement genderFemaleRadioButtonWebElement = driver.findElement(genderFemaleRadioButtonBy);
        genderFemaleRadioButtonWebElement.click();
        String calculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By calculateButtonBy = By.xpath(calculateButtonXpath);
        WebElement calculateButtonWebElement = driver.findElement(calculateButtonBy);
        calculateButtonWebElement.click();
        String highWeightMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By highWeightMessageBy = By.xpath(highWeightMessageXpath);
        WebElement highWeightMessageWebElement = driver.findElement(highWeightMessageBy);
        String actual = highWeightMessageWebElement.getText();
        Assertions.assertEquals("Незначительный избыток массы тела", actual);
    }

    @Test
    public void testFormWithValidValuesOverWeightResult() {
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
        weightTextBoxWebElement.sendKeys("90");
        String genderFemaleRadioButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderFemaleRadioButtonBy = By.xpath(genderFemaleRadioButtonXpath);
        WebElement genderFemaleRadioButtonWebElement = driver.findElement(genderFemaleRadioButtonBy);
        genderFemaleRadioButtonWebElement.click();
        String calculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By calculateButtonBy = By.xpath(calculateButtonXpath);
        WebElement calculateButtonWebElement = driver.findElement(calculateButtonBy);
        calculateButtonWebElement.click();
        String overweightMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By overweightMessageBy = By.xpath(overweightMessageXpath);
        WebElement overweightMessageWebElement = driver.findElement(overweightMessageBy);
        String actual = overweightMessageWebElement.getText();
        Assertions.assertEquals("Значительный избыток массы тела, тучность", actual);
    }

    @Test
    public void testFormWithInvalidHeight() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String nameTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By nameTextBoxBy = By.xpath(nameTextBoxXpath);
        WebElement nameTextBoxWebElement = driver.findElement(nameTextBoxBy);
        nameTextBoxWebElement.click();
        nameTextBoxWebElement.sendKeys("Alla");
        String heightTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By heightTextBoxXpathBy = By.xpath(heightTextBoxXpath);
        WebElement heightTextBoxWebElement = driver.findElement(heightTextBoxXpathBy);
        heightTextBoxWebElement.click();
        heightTextBoxWebElement.sendKeys("350");
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
        String invalidHeightMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By invalidHeightMessageBy = By.xpath(invalidHeightMessageXpath);
        WebElement invalidHeightMessageWebElement = driver.findElement(invalidHeightMessageBy);
        String actual = invalidHeightMessageWebElement.getText();
        Assertions.assertEquals("Рост должен быть в диапазоне 50-300 см.", actual);
    }

    @Test
    public void testFormWithInvalidWeight() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String nameTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By nameTextBoxBy = By.xpath(nameTextBoxXpath);
        WebElement nameTextBoxWebElement = driver.findElement(nameTextBoxBy);
        nameTextBoxWebElement.click();
        nameTextBoxWebElement.sendKeys("Jena");
        String heightTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By heightTextBoxXpathBy = By.xpath(heightTextBoxXpath);
        WebElement heightTextBoxWebElement = driver.findElement(heightTextBoxXpathBy);
        heightTextBoxWebElement.click();
        heightTextBoxWebElement.sendKeys("170");
        String weightTextBoxXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By weightTextBoxBy = By.xpath(weightTextBoxXpath);
        WebElement weightTextBoxWebElement = driver.findElement(weightTextBoxBy);
        weightTextBoxWebElement.click();
        weightTextBoxWebElement.sendKeys("2");
        String genderFemaleRadioButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderFemaleRadioButtonBy = By.xpath(genderFemaleRadioButtonXpath);
        WebElement genderFemaleRadioButtonWebElement = driver.findElement(genderFemaleRadioButtonBy);
        genderFemaleRadioButtonWebElement.click();
        String calculateButtonXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By calculateButtonBy = By.xpath(calculateButtonXpath);
        WebElement calculateButtonWebElement = driver.findElement(calculateButtonBy);
        calculateButtonWebElement.click();
        String invalidWeightMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        By invalidWeightMessageBy = By.xpath(invalidWeightMessageXpath);
        WebElement invalidWeightMessageWebElement = driver.findElement(invalidWeightMessageBy);
        String actual = invalidWeightMessageWebElement.getText();
        Assertions.assertEquals("Вес должен быть в диапазоне 3-500 кг.", actual);
    }
}
