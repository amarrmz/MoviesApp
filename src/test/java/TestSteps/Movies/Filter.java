package TestSteps.Movies;

import com.google.common.collect.Ordering;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

import static TestSteps.Movies.Hooks.wait;

public class Filter {

    @Given("User at main movies screen")
    public void User_at_main_movies_screen() {
        //validate that user at main screen
        Assert.assertTrue(true);
    }


    @When("User clicks on the details button")
    public void userClicksOnTheDetailsButton() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))).click();

    }

    @Then("User should be redirected to details screen")
    public void userShouldBeRedirectedToDetailsScreen() {
        //validate that user at details screen
        Assert.assertTrue(false);
    }

    @When("User select filter movies by year")
    public void userSelectFilterMoviesByYear() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))).click();

    }

    @Then("Movies list should be displayed based on year")
    public void moviesListShouldBeDisplayedBasedOnYear() {
        List<WebElement> moviesList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("")));
        //convert list to integer
       /*
       List<Integer> moviesYear = new ArrayList<>();
        for (WebElement element : moviesList) {
            moviesYear.add(Integer.parseInt(element.getText()));
        }
        boolean sorted = Ordering.natural().isOrdered(moviesYear);
        //Validate Movies displayed by years
        Assert.assertTrue(sorted);
        */
    }

    @When("User select filter movies by popularity")
    public void userSelectFilterMoviesByPopularity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))).click();
    }

    @Then("Movies list should be displayed based on popularity")
    public void moviesListShouldBeDisplayedBasedOnPopularity() {
        List<WebElement> moviesList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("")));
        //Validate Movies displayed by popularity maybe same logic with first filter
    }
}
