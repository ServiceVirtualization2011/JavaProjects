import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static void main(String[] args) {
    	
    	// Download driver form 
    	System.setProperty("webdriver.chrome.driver","D:\\SeleniumProject\\drivers\\chrome\\chromedriver.exe");
    	WebDriver driver =  new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
      //  String baseUrl = "http://169.254.231.111:8080/testapi";
//        String tagName = "";
        
        driver.get(baseUrl);
//        tagName = driver.findElement(By.id("email")).getTagName();
        
        driver.findElement(By.id("email")).sendKeys("test@email.com");         //*[@id="email"] <==== Find from browser F-12
        driver.findElement(By.id("pass")).sendKeys("testpass");
        
        driver.findElement(By.id("loginbutton")).submit();

//        driver.findElement(By.)
//        System.out.println(tagName);
        driver.close();
        System.exit(0);
   
}
}