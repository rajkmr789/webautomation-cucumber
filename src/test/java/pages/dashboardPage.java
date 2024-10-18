package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.WebDriverHelper;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;
import static support.DeviceCreation.driver;
import static support.PropertiesReader.CompanyNameTest;
import static support.PropertiesReader.yopMail_url;

public class dashboardPage {
    public dashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[contains(@class, 'fi-tenant-menu')]")
    WebElement menuOnLeftNav;


    @FindBy(xpath = "//span[contains(text(), 'Company Settings')]")
    WebElement companySettingsOptionInLeftNavOnDashboard;

    public void checkUserLandsOnDashbaord() throws InterruptedException {
       WebDriverHelper.waitUntilPageCompletelyLoad();
       Thread.sleep(5000);
       WebDriverHelper.waitUntilVisible(menuOnLeftNav, 30, 5);
    }

    public void checkCompanyNameShownOnLeftNav() {
        WebDriverHelper.waitUntilVisible(menuOnLeftNav, 15, 3);
        assertEquals("Furiosa", menuOnLeftNav.getText());
    }

    public void openCompanySettingsPage() throws InterruptedException {
        menuOnLeftNav.click();
        WebDriverHelper.waitUntilVisible(companySettingsOptionInLeftNavOnDashboard, 15, 3);
        companySettingsOptionInLeftNavOnDashboard.click();

    }
}
