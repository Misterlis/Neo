import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class neo extends Main {
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Пироги')]")
    private SelenideElement buttonPIROGI;

    public neo clickbuttonPIROGI() {
        buttonPIROGI.click();
        $(byText("C мясом классический")).shouldBe(visible);
        $(byText("С мясом и тушеной капустой")).shouldBe(visible);
        return page(neo.class);
    }

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[4]/div[2]/div[3]/a[1]")
    private SelenideElement buttonCART;

    public neo clickbuttonCART() {
        buttonCART.click();
        return page(neo.class);
    }

    @FindBy(how = How.XPATH, using = "//a[@id='to_order']")
    private SelenideElement buttonCART2;

    public neo clickbuttonCART2() {
        buttonCART2.click();
        $(byText("Состав заказа")).shouldBe(visible);
        return page(neo.class);
    }


    @FindBy(how = How.XPATH, using = "//input[@name='SOF_USR_FIO']")
    private SelenideElement FIO;

    public neo input1() throws AWTException {
        FIO.sendKeys(input1);
        return page(neo.class);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='SOF_USR_EMAIL']")
    private SelenideElement email;

    public neo input2() throws AWTException {
        email.sendKeys(input2);
        return page(neo.class);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='SOF_USR_PHONE']")
    private SelenideElement SOF_USR_PHONE;

    public neo input3() throws AWTException {
        SOF_USR_PHONE.sendKeys(input3);
        return page(neo.class);
    }

    @FindBy(how = How.XPATH, using = "//input[@name='SOF_USR_ADDRESS']")
    private SelenideElement SOF_USR_ADDRESS;

    public neo input4() throws AWTException {
        SOF_USR_ADDRESS.sendKeys(input4);
        return page(neo.class);
    }


    @FindBy(how = How.XPATH, using = "//input[@name='SOF_DEVICES']")
    private SelenideElement SOF_DEVICES;

    public neo input5() throws AWTException {
        SOF_DEVICES.sendKeys(input5);
        return page(neo.class);
    }

    @FindBy(how = How.XPATH, using = "//textarea[@name='SOF_MESSAGE']")
    private SelenideElement SOF_MESSAGE;

    public neo input6() throws AWTException {
        SOF_MESSAGE.sendKeys(input6);
        return page(neo.class);

    }


    @FindBy(how = How.XPATH, using = "//input[@name='ORDER_SUBMIT']")
    private SelenideElement buttonOFORMIT;

    public neo clickbuttonOFORMIT() {
        buttonOFORMIT.click();
        $(byText("Ваш заказ успешно отправлен, наш менеджер свяжется с Вами в ближайшее время!")).shouldBe(visible);
        return page(neo.class);
    }


}