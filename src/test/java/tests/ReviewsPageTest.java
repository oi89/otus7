package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ReviewsPage;
import utils.WebDriverInit;

public class ReviewsPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private ReviewsPage reviewsPage;

    @Before
    public void setUp() {
        driver = WebDriverInit.init();
        mainPage = new MainPage(driver);
        reviewsPage = new ReviewsPage(driver);
    }

    @Test
    public void clickReviewsTest() {
        mainPage
                .open()
                .clickReviewsLink();

        Assert.assertEquals("Заголовок страницы Отзывы отличается",
                "Отзывы",
                reviewsPage.getTitleText());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
