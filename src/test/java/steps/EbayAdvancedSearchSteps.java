package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.*;

public class EbayAdvancedSearchSteps {
    WebDriver driver = Hooks.driver; // Use the WebDriver from Hooks

    @Given("I am on the eBay Advanced Search page")
    public void navigateToAdvancedSearchPage() {
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }

    @When("I enter search keyword {string}")
    public void enterSearchKeyword(String keyword) {
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys(keyword);
    }

    @When("I set price range between {string} and {string}")
    public void setPriceRange(String minPrice, String maxPrice) {
        WebElement minPriceBox = driver.findElement(By.name("_udlo"));
        WebElement maxPriceBox = driver.findElement(By.name("_udhi"));
        minPriceBox.sendKeys(minPrice);
        maxPriceBox.sendKeys(maxPrice);
    }

    @When("I select {string} option")
    public void selectBuyingOption(String option) {
        Select buyingOption = new Select(driver.findElement(By.name("LH_ItemCondition")));
        buyingOption.selectByVisibleText(option);
    }

    @When("I click the {string} button")
    public void clickButton(String buttonName) {
        WebElement searchButton = driver.findElement(By.id("searchBtnLowerLnk"));
        searchButton.click();
    }

    @Then("I should see results matching {string} in the price range")
    public void verifyResults(String keyword) {
        WebElement results = driver.findElement(By.cssSelector(".srp-controls__count-heading"));
        assert results.getText().contains(keyword) : "Keyword not found in results.";
    }
}
