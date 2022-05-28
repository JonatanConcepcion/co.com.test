package co.com.test.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Verificar implements Question<Boolean> {
    private String nombreDocumento;

    public Verificar(String nombreDocumento) {
        this.nombreDocumento=nombreDocumento;
    }

    public static Verificar el(String nombreDocumento) {
        return new Verificar(nombreDocumento);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String titulo = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (titulo.contains(nombreDocumento)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}



