package Day10_03262023;

import ReuseableLibrary.ReuseableMethods;
import org.openqa.selenium.WebDriver;

public class Staples_Example {
    public static void main(String[] args) throws InterruptedException{


        //set up the chrome driver
        ReuseableMethods ReusableMethods;
        WebDriver driver = ReuseableMethods.defineChromeDriver();

        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        ReuseableMethods.sendKeysMethod(driver,"//*[@id='searchInput']","iphone","Search Field");

        //click on the search icon
        ReuseableMethods.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']","Search Icon");

        //click on first image by index
        ReuseableMethods.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,"Iphone Image");

        //click on add to the cart button
        ReuseableMethods.clickMethod(driver,"//*[@id='ctaButton']","Add to cart");

        //capture the starting price and print it out
        Thread.sleep (5000);
        String result = ReuseableMethods.captureTextMethod(driver,"//*[contains(text(),'starting at')]","Starting Price");

        System.out.println("My result is " + result);


    }//end of main

}//end of class
















