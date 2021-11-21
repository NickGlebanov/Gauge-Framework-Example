package ru.sdetteam.easygauge.tests;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.thoughtworks.gauge.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GaugeTest {
    @BeforeClass()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 20000;
    }

    @Step("Goto mantis page")
    public void openURL (){
        open("http://192.168.0.29");
    }

//    @Step("Write login data <login> <pass>")
//    public void writeLogin(final String login, final String pass){
//        $(byId("username")).setValue(login);
//        $(byText("Войти")).click();
//        $(byId("password")).setValue(pass);
//        $(byText("Войти")).click();
//    }
}
