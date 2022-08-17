package stepDefinitions;

import com.learning.base.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.HomePage;


public class HomepageSteps extends Baseclass {

    public static final Logger log = Logger.getLogger(HomepageSteps.class);
    HomePage omePage = new HomePage(driver);
    @Given("^User redirects to the site.$")
    public void user_redirects_to_the_site() {

log.info("Redirection done");
    }
    @Then("^Verify website title$")
    public void verify_website_title() {

        log.info("Redirection was successful");
    }
    @And("^Verify website current url$")
    public void verify_website_current_url() {
        omePage.verifyUrl();
        log.info("Url is verified");

    }

    @Given("^User click on About us$")
    public void user_click_on_About_us() throws InterruptedException {
        omePage.clickonAboutus();
        log.info("click on About done");
    }
    @And("^Verify click on testimonial$")
    public void user_click_on_testimonial() {

        omePage.clickOnTestimonals();

        log.info("Click on Testimonals done");
    }

    @And("^Verify read all client names$")
    public void user_real_all_client_names() {
        // Write code here that turns the phrase above into concrete actions

        omePage.getClientName();
        log.info("Got the client names");
    }



}
