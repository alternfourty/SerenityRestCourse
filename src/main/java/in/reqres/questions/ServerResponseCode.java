package in.reqres.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ServerResponseCode implements Question<Object> {

    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }
    public static Question<Object> code(){
        return new ServerResponseCode();
    }
}
