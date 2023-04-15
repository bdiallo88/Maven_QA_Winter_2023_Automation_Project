package Automation_AI05;

import ReuseableLibrary.ReuseableMethods;
import org.openqa.selenium.WebDriver;

public class Best_Buy {
    public static void main(String[] args, String Dropdown) throws InterruptedException {



        //set up the chrome driver

        WebDriver driver = ReuseableMethods.defineChromeDriver();



        //navigate to staples home page
        driver.navigate().to("https://www.bestbuy.com");




        //type on search field using sendkeys method
        ReuseableMethods.sendKeysMethod(driver,"//*[@class='searchInput']","iphone","Search Field");



        //click on the search icon using click method
        ReuseableMethods.clickMethod(driver,"//*[@class='header-search-button']","Search Icon");


        //Dropdown by "Best Selling"//using selectByText method
        ReuseableMethods.selectByTextMethod(driver,"//[@class='tb-select']","Best Selling","Dropdown");


        //Click on the first Iphone using clickByIndex
        ReuseableMethods.clickMethodByIndex(driver,"//*[@class='product-image']",0,"Iphone Image");


        //Scroll to text Learn About Total tech.
        Thread.sleep(3000);
        //ReuseableMethods.scrollByElementMethod(driver,"//*[@id='container']","Dropdown");


        //Click on Add to Cart button using click method
        ReuseableMethods.clickMethod(driver,"//*[@class='fulfillment-add-to-cart-button']","Add to cart");


        //Print out amount of Cart Subtotal 3 items.Using Capture Text
        ReuseableMethods.captureTextMethod(driver,"//*[@class=_'none']", "Cart Subtotal (3 items)");
       // System.out.println("Toatal amount"+ result);


       //Continue shopping using mouseHover method
        //ReuseableMethods.mouseHover(driver,"//*[@class='c-button-link continue shopping']", "Countinue shopping", mouseHover);


       //Click on continue shopping using Click Method
        //ReuseableMethods.clickMethod(driver,"//*[@class='c-button-link continue shopping']", "continue shopping");
































    }//end of main
}//end of class
