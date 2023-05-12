package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement Search = $(byClassName("waves-effect")),
    SearchText = $(byName("search"));

}
