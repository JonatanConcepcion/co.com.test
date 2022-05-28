package co.com.test.tasks;

import co.com.test.interactions.PasarAVentana;
import co.com.test.userinterface.IrASeccionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.test.userinterface.IrASeccionPage.ESTADODESITUACION31MARZO;


public class IrASeccion implements Task {

    public static IrASeccion the() {
        return Tasks.instrumented(IrASeccion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IrASeccionPage.BOTON_TRANSPARENCIA),
                Click.on(IrASeccionPage.BOTON_PRESUPUESTO));

                actor.attemptsTo(PasarAVentana.numero(2),
                Click.on(IrASeccionPage.BOTON_ESTADOS_FINANCIEROS),
                Click.on(IrASeccionPage.BALANCES),
                Click.on(ESTADODESITUACION31MARZO));

        actor.attemptsTo(PasarAVentana.numero(3));



        ;


    }

}




