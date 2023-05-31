import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.devtools.v111.webauthn.model.CredentialAsserted;
import org.openqa.selenium.support.ui.*;


public class test {
	private static final String CHROME_DRIVER_PATH = "‪c:\\webDev\\chromedriver_win32\\chromedriver.exe";
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";
	
    @Test
    public static void navertest() throws InterruptedException {
//    	ChromeOptions options = new ChromeOptions();
//    	options.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver();
        driver.get("https://map.naver.com/v5/search/%EC%8A%A4%ED%83%80%EB%B2%85%EC%8A%A4?c=15,0,0,0,dh");
//        driver.get("https://m.map.naver.com/search2/search.naver?query=%EC%8A%A4%ED%83%80%EB%B2%85%EC%8A%A4&sm=hty&style=v5");
        
        Thread.sleep(1000);
        
        System.out.println(driver.getTitle());
        driver.switchTo().frame("searchIframe");
        
        driver.findElement(By.cssSelector("#_pcmap_list_scroll_container")).click();
        
        List<WebElement> list = driver.findElements(By.cssSelector("li.UEzoS"));
        
        int len = list.size();
        
        while(true) {
        	driver.findElement(By.cssSelector("body")).sendKeys(Keys.END);
        	Thread.sleep(1000);
        	list = driver.findElements(By.cssSelector("li.UEzoS"));
        	
        	int afterlen = list.size();
        	
        	if(afterlen == len)
        		break;
        	
        	len = afterlen;
        }
        
        for(WebElement we : list) {
        	we.findElement(By.cssSelector("div.CHC5F a")).click();
        	Thread.sleep(1000);
        	driver.switchTo().defaultContent();
        	driver.switchTo().frame("entryIframe");
        	
        	System.out.println(driver.findElement(By.className("Fc1rA")).getText());
        	System.out.println(driver.findElement(By.className("LDgIH")).getText());
        	System.out.println(driver.findElement(By.className("zPfVt")).getText());
        	System.out.println(driver.findElement(By.className("CHmqa")).getText());
        	System.out.println("========================================================");
        	
        	driver.switchTo().defaultContent();
        	driver.switchTo().frame("searchIframe");
        }
        
        System.out.println("종료~");
        driver.quit();
    }
    
    public static void main(String[] args) throws InterruptedException {
    	navertest();
	}
}
