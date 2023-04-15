package Automation_AI04.Hotels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Hotels {
    public static void main(String[] args) throws InterruptedException {


        //set up  your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define your chrome driver that you will use for testing
        ChromeOptions options = new ChromeOptions();


        //add maximize for windows
        //options.addArguments("start-maximized");
        //add --kiosk for mac
        //OptionsWithArguments options;
        options.addArguments("--kiosk");
        //add incognito mode to option
        options.addArguments("incognito");
        //add options to run driver on the background(headless)
        //options.addArguments("headless");


        WebDriver driver = new ChromeDriver(options);


        //array list of states
        ArrayList<String> destination = new ArrayList<>();
        destination.add("New York");
        destination.add("New Jersey");
        destination.add("Maryland");


        //navigate to Hotels.com home page
        //loop for states
        int i;
        for (i = 0; i < destination.size(); i++) {

            driver.navigate().to("https://www.Hotels.com");

            Thread.sleep(1000);
            //Click on Going To
            WebElement destCity = driver.findElement(By.xpath("//*[@class='utik-fake-input uitk-form-field-trigger']"));
            destCity.click();

            try {
                destCity.click();
                Thread.sleep(1000);
                System.out.println("Successfully clicked on Going to");
            } catch (Exception e) {
                System.out.println("Unable to click on Going to" + e);
            }//end of exception for Going to


            WebElement destCity2 = driver.findElement(By.xpath("//*[@class='utik-fake-input uitk-form-field-trigger']"));

            try {
                destCity2.sendKeys(destination.get(i));
                System.out.println("Successfully sent states in search box");
            } catch (Exception e) {
                System.out.println("Unable to send states in search box" + e);
            }//end of exception for states

        }//end of loop


        //array list of adults to be added for travel info
        ArrayList<Integer> adults = new ArrayList<>();

        adults.add(2);
        adults.add(3);
        adults.add(4);

        //create arraylist of (-) and (+) buttons
        ArrayList<WebElement> button = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-step-input-button']")));

        //wait 2 seconds
        Thread.sleep(2000);
        //click (-) on adult
        button.get(0).click();

        //click (+) on adult from r=1 to adults.add(index i) value

        for (int r = 1; r < adults.get(i); r++) {
            button.get(1).click();
        }//end of loop
        
        
        //click child + button
        try {
            button.get(3).click();
            System.out.println("Able to click child + button");
        }catch (Exception e){
            System.out.println("Unable to click child + button" +e);
        }//end of exception for child+button
        
        
        //dropdown for child 
        WebElement childAge =driver.findElement(By.xpath("//*[@id='age-traveler_selector_children_age_selector-0-0']"));
        Select childDropdown = new Select (childAge);
        
        //close tab
        driver.close();
        
        
        //switch to original tab
         driver.getWindowHandles();



    }//end on main
}//end of class
