package Stepdefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class google {
	
	

	

	    WebDriver driver;

	    @Given("I navigate to the Google homepage")
	    public void i_navigate_to_the_google_homepage() {
	        // Set the path to your WebDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	    }

	    @When("I enter {string} in the search bar")
	    public void i_enter_in_the_search_bar(String searchTerm) {
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys(searchTerm);
	    }

	    @When("I click on the search button")
	    public void i_click_on_the_search_button() {
	        WebElement searchButton = driver.findElement(By.name("btnK"));
	        searchButton.click();
	    }

	    @Then("I should see results related to {string}")
	    public void i_should_see_results_related_to(String searchTerm) {
	        assertTrue(driver.getPageSource().contains(searchTerm));
	        driver.quit();
	    }
	}


}
