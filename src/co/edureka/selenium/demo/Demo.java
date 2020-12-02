package co.edureka.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Demo {

        public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Exe Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://vns.lpnu.ua/login/index.php");
        driver.manage().window().maximize();
        String un = "oleksandra.boichuk.kn.2017";
        String pw = "04.02.2000";
        driver.findElement(By.id("username")).sendKeys(new CharSequence[]{un});
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{pw});
        driver.findElement(By.id("loginbtn")).click();
        String at = driver.getTitle();
        String et = "vns";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
        LocalDateTime StartTime = LocalDateTime.now();
        System.out.println("Start at "+ dtf.format(StartTime));


        WebDriverWait wait = new WebDriverWait(driver, 160000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class='list-group']")));


        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("End at "+ dtf.format(endTime));
}}