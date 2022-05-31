import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class PrivatBank {

@Test
public void FirstP2PTest() {
    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://next.privat24.ua/money-transfer/card");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    By numberCardOne = By.xpath("//input[@data-qa-node='numberdebitSource']");
    By dataCardOne = By.xpath("//input[@data-qa-node='expiredebitSource']");
    By cvvCardOne = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    By firstNameCardOne = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    By lastNameCardOne = By.xpath("//input[@data-qa-node='lastNamedebitSource']");

    By numberCardTwo = By.xpath("//input[@data-qa-node='numberreceiver']");
    By firstNameCardTwo = By.xpath("//input[@data-qa-node='firstNamereceiver']");
    By lastNameCardTwo = By.xpath("//input[@data-qa-node='lastNamereceiver']");
    By amount = By.xpath("//input[@data-qa-node='amount']");
    By currency = By.xpath("//button[@data-qa-value='UAH']");
    By currencyEUR = By.xpath("//button[@data-qa-value='EUR']");
    By comment = By.xpath("//span[@data-qa-node='toggle-comment']");
    By commentEnter = By.xpath("//textarea[@data-qa-node='comment']");

    By confirButton = By.xpath("//button[@class='sc-VigVT hcHAAV']");

    driver.findElement(numberCardOne).sendKeys("4006 8956 8904 8337");
    driver.findElement(dataCardOne).sendKeys("0323");
    driver.findElement(cvvCardOne).sendKeys("480");
    driver.findElement(firstNameCardOne).sendKeys("Huan");
    driver.findElement(lastNameCardOne).sendKeys("Pedro");

    driver.findElement(numberCardTwo).sendKeys("4558 0328 5584 1715");
    driver.findElement(firstNameCardTwo).sendKeys("Elvis ");
    driver.findElement(lastNameCardTwo).sendKeys("Presli");
    driver.findElement(amount).sendKeys("500");
    driver.findElement(currency).click();
    driver.findElement(currencyEUR).click();
    driver.findElement(comment).click();
    driver.findElement(commentEnter).sendKeys("Это тебе на конфеты");

    driver.findElement(confirButton).click();

}

}
