package Day14_04092023;

import ReuseableLibrary.ReusableAnnotations;
import ReuseableLibrary.ReuseableMethods_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T1_Staples_Xpath_Index extends ReusableAnnotations {


    @Test(priority = 1)
    public void ClickOnThirdIphonByXpathIndex() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to Staples home page");
        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        ReuseableMethods_Logger.sendKeysMethod(driver, "//*[@id='searchInput']", "iphone", logger, "Search Field");

        //click on the search icon
        ReuseableMethods_Logger.clickMethod(driver, "//*[@class='search-bar-input__searchIcon']", logger, "Search Icon");

        //click on third image by xpath index
        Thread.sleep(4000);
        ReuseableMethods_Logger.clickMethod(driver, "(//*[@class='standard-tile__image standard-tile__image_hover'])[3]", logger, "Iphone Image");

        Thread.sleep(2000);

    }//end of test 1


}//end of class