import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Webdriver {
    public static void main(String[] args) {
        email();
    }
    public static void method1(){
            System.setProperty("webdriver.chrome.driver", "D:\\3rd YEar\\SE\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");

            //Get commands
            System.out.println("Page Title: +" + driver.getTitle());
            System.out.println("Current URL: +" + driver.getCurrentUrl());
            System.out.println("Page Title: +" + driver.getPageSource().toString().length());

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

            driver.close();

    }

    public static void method2(){
        System.setProperty("webdriver.chrome.driver", "D:\\3rd YEar\\SE\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://mail.google.com/mail/u/0/#inbox/1637667cfbc31696");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");

        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        driver.close();
    }

    public static void method3(){
        System.setProperty("webdriver.chrome.driver", "D:\\3rd YEar\\SE\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https:www.google.com");
        //Create Webelement Instance for textbox
        WebElement searchbox = driver.findElement(By.name("q"));
        //Enter search keyword in the google searchbox
        searchbox.sendKeys("AAU");
        searchbox.submit();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        //clear textbox
        searchbox.clear();
        //exit
        driver.close();
    }

    public static void facebook(){
        System.setProperty("webdriver.chrome.driver", "D:\\3rd YEar\\SE\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("yohannesfassil@gmail.com");
        WebElement ns = driver.findElement(By.id("pass"));
        ns.sendKeys("ytlfsnft");
        ns.submit();

        System.out.println("Successfully logged in");
        driver.get("https://www.facebook.com/groups/1432354863727185/?fref=nf");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        driver.findElement(By.id("userNavigationLabel")).click();
//
//        driver.findElement(By.partialLinkText("Log out")).click();
//        System.out.println("Successfully logged out");
    }
    public static void portal() {
        System.setProperty("webdriver.chrome.driver", "D:\\3rd YEar\\SE\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://portal.aait.edu.et");
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("UserName")).sendKeys("AtR/4122/08");
        WebElement ns = driver.findElement(By.id("Password"));
        ns.sendKeys("Ytlfsnft@4");
        ns.submit();
        System.out.println("Successfully logged in");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        driver.findElement(By.id("userNavigationLabel")).click();
    }

    public static void email() {
        System.setProperty("webdriver.chrome.driver", "D:\\3rd YEar\\SE\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.gmail.com");
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("yohannesfassil@gmail.com");
        WebElement ns = driver.findElement(By.name("password"));
        ns.sendKeys("ytlfsnft");
        ns.submit();
        System.out.println("Successfully logged in");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        driver.findElement(By.id("userNavigationLabel")).click();
    }
}