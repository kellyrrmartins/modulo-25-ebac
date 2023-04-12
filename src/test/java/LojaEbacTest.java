import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LojaEbacTest {
    static  ChromeDriver driver;

    @BeforeTest
    public  static  void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/kelly/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    public void deveAcessarHomePage() {
        driver.get("http://lojaebac.ebaconline.art.br/");
        Assert.assertEquals(driver.getTitle(), "EBAC – Shop – Página de teste");
    }
    @AfterTest
    public  static  void tearDown() {
        driver.close();
    }
}
