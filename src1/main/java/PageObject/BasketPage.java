package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    public SelenideElement Basket = $(byLinkText("ფასდაკლებები")),
    Chosebasket =$(byXpath("/html/body/div[5]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/a")),
    Addproduct =$(byText("პროდუქტი წარმატებით დაემატა კალათაში")),
    MyBasket =$(byClassName("junior-span")),
    NameBasket = $(byClassName("item_head"),0),
    ColorBasket = $(byClassName("item_head"),1),
    CodeBasket =$(byClassName("item_head"),2),
    UnitBasket =$(byClassName("item_head"),3),
    PriceBasket=$(byClassName("item_head"),4),
    AllBasket=$(byClassName("item_head"),5),
    PlusBasket = $(byXpath("/html/body/div[5]/div/div[3]/div[5]/div/button[1]/i")),
    MinusBasket = $(byClassName("fa-minus")),
    TotalPriceBasket = $("#totalPrice"),
    DeleteBasket = $(byClassName("fa-times")),
    ClearBasket = $(byClassName("clear_btn"),1),
    EmptyBasket = $(byClassName("emptyCart"),1 ),
    ContinueBasket =$(byXpath("/html/body/div[5]/div/div[4]/div/div[2]/a"));



}
