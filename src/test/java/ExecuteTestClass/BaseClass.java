/*package ExecuteTestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	static Properties property;
	static FileInputStream f;

	public static void readProperty() throws IOException {
		property = new Properties();
		f = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Config.properties");
		property.load(f);
	}
                                                  
	public void beforeMethod(String browserValue) throws IOException {

		readProperty();
		if (browserValue.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserValue.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
}*/
package ExecuteTestClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public WebDriver driver;
    static Properties property;

    public static void readProperty() throws IOException {
        property = new Properties();
        try (FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Config.properties")) {
            property.load(f);
        }
    }

    @Parameters("browser")
    @BeforeMethod
    
    public void setup(String browserValue) throws IOException {

        readProperty();
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

        driver.get(property.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

        @AfterMethod
    public void tearDown() {
       
            driver.quit();
        }
    
}
