package ru.sdetteam.easygauge.tests;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.thoughtworks.gauge.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class GaugeTest {
    @BeforeClass()
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 20000;
    }


//    @Test
//    public void testGauge() {
//        openURL();
//        writeLogin("administration", "root");
//    }

    @Step("Goto mantis page")
    public void openURL (){
        open("http://192.168.0.38");
    }

    @Step("Write login data <login> <pass>")
    public void writeLogin(final String login, final String pass){
        $(byId("username")).setValue(login);
        $(byText("Войти")).click();
        $(byId("password")).setValue(pass);
        $(byText("Войти")).click();
    }
}
