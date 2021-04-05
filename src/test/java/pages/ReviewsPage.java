package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewsPage {
    @FindBy(css = "div[class^='PageTitle__Title']")
    private WebElement pageTitle;
    private WebDriver driver;

    public ReviewsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitleText() {
        return pageTitle.getText();
    }
}
