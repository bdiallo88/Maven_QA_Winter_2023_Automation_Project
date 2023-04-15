package Automation_AI06;

import ReuseableLibrary.ReusableAnnotations;
import ReuseableLibrary.ReuseableMethods;
import org.testng.annotations.Test;

public class Fideliscare extends ReusableAnnotations {


    @Test(priority = 1)
    public void TestCaseOne() throws InterruptedException {
        //navigative to fideliscare.org
        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(1500);
        //Click on search element on top right
        ReuseableMethods.clickMethod(driver, "//*[@class='fal fa-search']", "search Icon");
        //Enter get dental coverage on the search.
        ReuseableMethods.sendKeysMethod(driver, "//*[@class='form-control search-input']", "Get Dental Coverage", "Search Field");
        //Click on search Icon
        ReuseableMethods.clickMethod(driver, "//*[@class='fal fa-search']", "search Icon");
        //Capture the search result
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@class='gsc-results-info-container']", "Search Results");
        //Split and only print search number
        String[] arrayResult = result.split(" ");
        System.out.println("Result: " + arrayResult[1]);
        //Click on Get General Coverage link
        ReuseableMethods.clickMethod(driver, "//*[@class='gs-title']", "Get Dental Coverage");

    }//end of test 1


    @Test(priority = 2)
    public void TestCaseTwo() throws InterruptedException {
        //switch  new tab
        ReuseableMethods.switchToTabByIndex(driver, 1, "Switching Tabs");
        //enter first name
        ReuseableMethods.sendKeysMethod(driver, "//*[@id='firstName']", "Shawn", "First Name");
        //enter last name
        ReuseableMethods.sendKeysMethod(driver, "//*[@id='lastName']", "Jones", "Last Name");
        //enter zip code
        ReuseableMethods.sendKeysMethod(driver, "//[@id='zipcode']", "11221", "Zipcode");
        //Select county
        ReuseableMethods.selectByTextMethod(driver, "//*[@id='county']", "Kings", "County");
        //enter phone number
        ReuseableMethods.sendKeysMethod(driver, "//*[@='phoneNumber']", "6465213211", "Phone Number");
        //Click on contact me checkbox
        ReuseableMethods.clickMethod(driver, "//*[@id='contactMe']", "Contact Me");
        //Click on contact me button
        //declare and define Mouse Actions
        ReuseableMethods.clickMethodByIndex(driver, "//*[text()='Contact Me", 2, "Contact Me Button");
        //Capture Thank You Submission
        Thread.sleep(5000);
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@class='content-section']", "Thank You for your submission");
        //Split and only print search number
        String[] arrayResult = result.split(" ");
        System.out.println("Message: " + result);
        driver.close();
    }//end of test 2


    @Test(priority = 3)
    public void TestCaseThree() throws InterruptedException {
        //switch back to default tab
        ReuseableMethods.switchToTabByIndex(driver, 0, "Default Tab");
        //Click on login
        ReuseableMethods.clickMethod(driver, "//*[@class='dropdown-toggle']", "login");
        //Click on 'Member Online Portal
        ReuseableMethods.clickMethod(driver, "//*[class@'=link-external']", "Member Online Portal");
        //Switch to tab
        ReuseableMethods.switchToTabByIndex(driver, 1, "Switching Tabs");
        //Capture and print out Helpful Hints to the right
        Thread.sleep(5000);
        String result = ReuseableMethods.captureTextMethod(driver, "//*[class='TipsMoreHelpItems']", "Helpful Hints");
        //Split and only print search number
        String[] arrayResult = result.split(" ");
        System.out.println("Message:" + result);
        driver.close();
    }//end of test 3
}//end of class

































