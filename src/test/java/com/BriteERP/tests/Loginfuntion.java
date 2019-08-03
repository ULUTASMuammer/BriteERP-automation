package com.BriteERP.tests;

import com.BriteERP.utilities.BriteERPUtils;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class Loginfuntion extends TestBase {



    String username= ConfigurationReader.getProperty("username");
    String password= ConfigurationReader.getProperty("password");

   @Test
    public void openbrowser(){

        BriteERPUtils.login(driver,username,password);





    }
}
