package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.ContactsPage;
import pages.MainPage;
import utils.WebDriverInit;

public class ContactsPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private ContactsPage contactsPage;

    @Before
    public void setUp() {
        driver = WebDriverInit.init();
        mainPage = new MainPage(driver);
        contactsPage = new ContactsPage(driver);
    }

    @Test
    public void clickContactsTest() {
        mainPage
                .open()
                .clickContactsLink();

        Assert.assertEquals("Заголовок страницы Контакты отличается",
                "Контакты",
                contactsPage.getTitleText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
