package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IrASeccionPage extends PageObject {

    public static final Target BOTON_TRANSPARENCIA = Target.the("Presionar para ingresar a Transparencia").located(By.linkText("Transparencia"));
    public static final Target BOTON_PRESUPUESTO = Target.the("Presionar para ingresar A Presupuesto").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField\"]/table[2]/tbody/tr[5]/td/a"));

    public static final Target BOTON_ESTADOS_FINANCIEROS = Target.the("Boton para entrar a informacion financiera").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_MenuThirdLevel\"]/ul/li[3]/a"));
    public static final Target BALANCES = Target.the("Presionar Boton Balance").located(By.xpath("//*[@id='chordion']/div[2]/h3"));
    public static final Target ESTADODESITUACION31MARZO = Target.the("Ver Estado de situacion pdf").located(By.xpath("//*[@id=\"paging_container3\"]/ul/li[1]/div/div/div/a[1]"));





}
