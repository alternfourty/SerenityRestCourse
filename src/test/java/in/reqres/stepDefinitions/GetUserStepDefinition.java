package in.reqres.stepDefinitions;

import in.reqres.questions.ServerResponseCode;
import in.reqres.tasks.users.GetUserTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static in.reqres.constants.Constants.URL_BASE_USER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserStepDefinition {
    @When("the user sends a request to the endpoint")
    public void theUserSendsARequestToTheEndpoint() {
        Actor user = Actor.named("user")
                .whoCan(CallAnApi.at(URL_BASE_USER));
        user.attemptsTo(
                GetUserTask.callUser()
        );
    }
    @Then("user will be able to see status code {int}")
    public void userWillBeAbleToSeeStatusCode(Integer int1) {
        Actor user = Actor.named("user");
        user.should(
                seeThat("Returned response code", ServerResponseCode.code(),equalTo(int1))
        );

    }
}
