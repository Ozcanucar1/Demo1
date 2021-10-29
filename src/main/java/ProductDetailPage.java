package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends pages.BasePage {

    By addToCartButtonLocator = By.id("pd_add_to_cart");
    By selectSizeButtonLocator = By.id("optionSizeTranslateLastpartItem");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }
    public void selectSize(){
        click(selectSizeButtonLocator);
    }
}
