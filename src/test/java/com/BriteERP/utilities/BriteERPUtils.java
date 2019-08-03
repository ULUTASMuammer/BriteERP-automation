package com.BriteERP.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class BriteERPUtils {
    WebDriver driver;
    String actionButtonLocator= "//button[contains(text(),'Action')]";
    String okLocator= "//span[text()='Ok']";
    WebDriverWait wait = new WebDriverWait(driver,10);
    private static String usernameLocator="login";
    private static String passwordLocator="password";
    /**
     * Login into com.BriteERP
     *
     * @param driver
     * @param username
     * @param password
     */
    public static void login(WebDriver driver, String username, String password) {
        driver.findElement(By.id(usernameLocator)).sendKeys(username);
        //Keys.ENTER means click enter after entering password
        //in this way, we don't need to click login button
        driver.findElement(By.id(passwordLocator)).sendKeys(password, Keys.ENTER);
        BrowserUtils.waitFor(3);

    }
    /**
     * This method will navigate user to the specific module in Brite erp application.
     * For example: if tab is equals to CRM
     * Then method will navigate user to CRM page
     //     * @param module
     //     * @param driver
     * @param tab
     */
    public static void navigateToModule( String tab) {
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String tabLocator = "//span[contains(text(),'" + tab + "') and contains(@class, 'oe_menu_text')]";
        Driver.getDriver().findElement(By.xpath(tabLocator)).click();
    }
}