package starter.postcodes;

import com.google.inject.matcher.Matchers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;


import java.util.function.Consumer;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostCodeStepDefinitions {

    @Steps
    PostCodeAPI postCodeAPI;

    /* this method for put API . where you can update user information */

    @When("I look up a post code {word}")
    public void lookUpAPostCode(String process)
    {
        postCodeAPI.fetchLocationByPostCodeAndCountry(process);
    }

    @Then("the resulting should be <{int}> and body display")
    public void theResultingShouldBe(int arg0) {
      restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.log().body());



    }

    /*this method for Get user information*/

    @When("get info about user {int}")
    public void get_info_about_user(Integer id) {
        postCodeAPI.fetchuserinfo(id);
    }

    @Then("the resulting should be {int} and body  should be display update address")
    public void the_resulting_should_be_and_body_should_be_display_update_address(Integer int1) {
        restAssuredThat(response -> response.statusCode(int1));
        restAssuredThat(response -> response.log().body().body("lastname" , equalTo("awais")));
    }





//    @When("I look up a user info <process>")
//    public void i_look_up_a_user_info(String process)
//    {
//        postCodeAPI.checkuserinfo(process);
//        throw new io.cucumber.java.PendingException();
//    }
}



