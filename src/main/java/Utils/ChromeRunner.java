package Utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class ChromeRunner {
    @BeforeMethod (description = "Configure browser before tests")
    public void setUp(){
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
        System.setProperty("Selenide.Browser.Size", "1980x1980");
        open("https://officemart.ge/ge");

    }
    @AfterMethod (description = "Close browser after tests")
    public void tearDown(){
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }}