package Automation_AI02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Assignment_2_BingSearch_LoopArray {

    public static void main(String[] args)  throws InterruptedException {


        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define your chrome driver that you will use for testing
        WebDriver driver = new ChromeDriver();

        //Set up Arraylist of Clothing
        ArrayList<String> Clothing = new ArrayList<>();
        Clothing.add("Fendi");
        Clothing.add("Gucci");
        Clothing.add("Prada");
        Clothing.add("Chanel");

       //iterate through the list of clothing and print out the search number for each clothing
        int i = 0;
        while(i < Clothing.size()) {


            //maximize driver
            driver.manage().window().maximize();

            //navigate to bing home
            driver.navigate().to("https://www.bing.com");

            //wait 2 seconds
            Thread.sleep(2000);

            //enter keyword Fendi to search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Clothing.get(i));

            //click on binge search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();

            // to navigate to new page
            Thread.sleep(2000);

            //capture search results by using .getText();
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();


            //print out only numbers
            String [] arrayResult = result.split(" ");
            //System.out.println("For " + Clothing.get (i) + " the search number is " + arrayResult[1]);

            if(arrayResult[0] =="About") {
                System.out.println("For " + Clothing.get(i) + " the search number is " + arrayResult[0]);
            } else {
                System.out.println("For " + Clothing.get(i) + " the search number is " + arrayResult[1]);
            }

            i++;

        }//end of loop
        driver.quit();

    }//end of main
}//end of class
