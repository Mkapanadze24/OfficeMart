package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement RegisterCart= $(byLinkText("ფასდაკლებები")),
     Addcart =$(byClassName("add_cart"),0),

    Mycart =$(byClassName("junior-span")),
    ContinueCart = $(".continue"),
    IurRegister = $("#pis"),
    PisRegister = $("#iur"),
    SendRegister = $("#btn2"),
    NameCompany = $("#კომპანიის სახელწოდება"),
    PersonalId = $(byClassName("prs__id "));
}
