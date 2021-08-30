package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https:/www.walmart.com/");

        driver.navigate().refresh();

        String sayfaBasligi = driver.getTitle();
        if (sayfaBasligi.contains("Save")){
            System.out.println("Sayfa basligi Save iceriyor, test PASS");
        }else {
            System.out.println("Sayfa basligi Save icemiyor, test FAILED");
        }

        if (sayfaBasligi.equals("Walmart.com | Save Money.Live Better")){
            System.out.println("Sayfa basligi test PASS");
        }else{
            System.out.println("Sayfa basligi test FAILED");
            System.out.println("currnet title " + sayfaBasligi);
            System.out.println("Expected Title " + "Walmart.com | Save Money.Live Better");
        }

        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("walmart.com")){
            System.out.println("URL test PASS");
        }else{
            System.out.println("URL test FAILED");
        }







    }
}
