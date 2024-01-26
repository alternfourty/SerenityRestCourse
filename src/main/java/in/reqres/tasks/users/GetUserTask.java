package in.reqres.tasks.users;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/api/users?page=2").with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .log().all()
                )
        );
    }
    public static GetUserTask callUser(){
        return instrumented(GetUserTask.class);
    }
}
