package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {

   public WebDriver driver;

    public WebDriver getDriver() throws IOException {
        Properties properties = new Properties();
        File file = new File("src/main/resources/configuration/frameworkConfiguration.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        properties.getProperty("testenvironment");


        if (properties.getProperty("browser").equals("chrome")){
            driver = new ChromeDriver();
        } else if (properties.getProperty("browser").equals("edge")) {
            driver = new EdgeDriver();
        } else if (properties.getProperty("browser").equals("safari")) {
            driver = new SafariDriver();
        }else{
            throw new InvalidArgumentException("Please Enter valid browser name");
        }

        driver.get(properties.getProperty("testenvironment"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }

}
