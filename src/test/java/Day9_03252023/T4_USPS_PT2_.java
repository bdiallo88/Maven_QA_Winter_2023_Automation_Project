package Day9_03252023;

import ReuseableLibrary.ReuseableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T4_USPS_PT2_ {
    public static void main(String[] args)  throws InterruptedException {



        //on your test cases ypu will declare the webdriver commond you want to use

        WebDriver  driver = ReuseableMethods.defineChromeDriver();



        //navigate to usps.com home page
        driver.navigate().to("https://www.ups.com/us");


        //declare the explicit wait command
        WebDriverWait wait = new WebDriverWait(driver,20);

        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceofAllElementsLocatedBy is same as findElements
        ReuseableMethods.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");


        //click on Schedule a Pickup
        //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
        Thread.sleep(2000);
        ReuseableMethods.clickMethod(driver,"//*[text()='Schedule a Pickup']","Schedule a Pickup");




        //enter a tracking number on the box
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='tracknumlist']"))).sendKeys("1234455555");





    }//end of main
}//end of class
