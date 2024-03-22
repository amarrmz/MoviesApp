package TestSteps.Movies;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static TestSteps.Movies.Hooks.wait;

public class Filter {

    @Given("User at main movies screen")
    public void User_at_main_movies_screen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/nameField"))).sendKeys("amar");

    }


    @When("User clicks on the details button")
    public void userClicksOnTheDetailsButton() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/btnLetsShop"))).click();

    }

    @Then("User should be redirected to details screen")
    public void userShouldBeRedirectedToDetailsScreen() {
        System.out.print("hello");
        Assert.assertTrue(false);
    }

    @When("User select filter movies by year")
    public void userSelectFilterMoviesByYear() {
    }

    @Then("Movies list should be displayed based on year")
    public void moviesListShouldBeDisplayedBasedOnYear() {
    }

    @When("User select filter movies by popularity")
    public void userSelectFilterMoviesByPopularity() {
    }

    @Then("Movies list should be displayed based on popularity")
    public void moviesListShouldBeDisplayedBasedOnPopularity() {
    }
}
