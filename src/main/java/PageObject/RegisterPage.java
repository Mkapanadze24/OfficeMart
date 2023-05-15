package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement RegisterCart= $(byLinkText("ფასდაკლებები")),
     AddCart =$(byClassName("add_cart"),0),

    MyCart =$(byClassName("junior-span")),
    ContinueCart = $(".continue"),
    IurRegister = $("#pis"),
    PisRegister = $("#iur"),
    SendRegister = $("#btn2"),
    NameCompany = $(byXpath("//*[@id=\"form2\"]/div[1]/input")),
    PersonalId = $(byClassName("iur-phone")),
    Address = $(byName("address"),0),
    Phone = $(byClassName("prs__id"),1),
    Delivery =$ (byClassName("iur_date")),
    Email =$(byName("email"));

}
