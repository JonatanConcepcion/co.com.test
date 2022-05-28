package co.com.test.tasks;

import co.com.test.userinterface.AeronauticaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
        private AeronauticaPage aeronauticaPage;
        public static Performable thePage() {

            return Tasks.instrumented(OpenUp.class);

        }
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(aeronauticaPage));


        }




}

