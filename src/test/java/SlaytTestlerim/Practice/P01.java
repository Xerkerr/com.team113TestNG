package SlaytTestlerim.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

//- Birbirine bağımlı testler oluşturun.
//- beforeClass oluşturup setUp ayarlarini yapin.
//- Birbirine bağımlı testler oluşturarak
//- ilk once wisequarte'a gidin
//- sonra youtube'a bağımlı olarak google'a gidin
//- daha sonra amazon'a bağımlı olarak amazon' a gidin
//- driver'i kapatın.
// */
public class P01 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void wisequarter(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }
}
