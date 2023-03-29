package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("/text-box");
        sleep(10000);
        // $("[id=userName]").setValue("Mrs Maria");
        $("#userName").setValue("Mrs Maria");
        $("#userEmail").setValue("kitty@gmail.com");
        $("#currentAddress").setValue("Baker Street, 221B");
        $("#permanentAddress").setValue("Kingsroad, Winterfell");
        $("#submit").click();

       $("#output").shouldHave(text("Mrs Maria"), text("kitty@gmail.com"),
                text("Baker Street, 221B"),text("Kingsroad, Winterfell"));
        $("#output #name").shouldHave(text("Mrs Maria"));
    }
}


