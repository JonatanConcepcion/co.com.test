package co.com.test.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PasarAVentana implements Interaction {
    private Integer numeroVentana;
    public PasarAVentana(Integer numeroVentana){
        this.numeroVentana = numeroVentana;
    }
    public static PasarAVentana numero(int numeroVentana){
        return new PasarAVentana(numeroVentana);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> allWindows= Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
        List<String> listOfAllWindows=new ArrayList<String>();
        listOfAllWindows.addAll(allWindows);
        Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(listOfAllWindows.get(numeroVentana-1));
    }
}
