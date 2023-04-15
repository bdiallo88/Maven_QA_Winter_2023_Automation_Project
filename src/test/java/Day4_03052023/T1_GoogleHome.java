package Day4_03052023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleHome {
    public static void main(String[] args) throws InterruptedException {

        //set up driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver();

        // maximize driver
        driver.manage().window().maximize();

        //navigate to google home page
        driver.navigate().to("https://www.google.com");
        //wait for 2 seconds
        Thread.sleep(2000);

        //locate element for search field and type keyword BMW
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");

        //click on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();


        //capture the search result using.getText();
        String result = driver.findElement(By.xpath ("//*[@id='result-stats']")).getText();

                String[] arrayResult = result.split(" ");

        System.out.println("Search Number:" + arrayResult[1]);
        //waiting for 2 seconds
        // evey 10000 millisecond is 1 second
        //whenever you go to a new page or navigate, always use 2-3 seconds wait to pause your script a bit
        Thread.sleep(2000); //right click show context actions_add exception to method signature

        //quit driver
        driver.quit();

    }//end of main
}//end of class



