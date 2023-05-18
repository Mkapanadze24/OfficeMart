package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class BasketPageSteps extends BasketPage {
    @Step ("კალათაზე ღილაკის დაჭერა - {ირჩევს მითითებული კალათის პროდუქტს}")
    public BasketPageSteps BasketInput() {
        Basket.click();
        return this;
    }
    @Step (("კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერით- {უნდა გამოიტანოს შემდეგი შეტყობინება: \"პროდუქტი წარმატებით დაემატა კალათაში\"}"))
    public BasketPageSteps ChoseBasketInput() {
        Chosebasket.click();
        return this;
    }
@Step ("პროდუქტის დამატებით -{წარმატებით ემატება პროდუქტი კალათაში}")
    public BasketPageSteps AddproductInput() {
        Addproduct.click();
        return this;
    }
@Step (" ღილაკი ჩემი კალათაზე დაჭერით - {გადადის ჩემი კალათის გვერდზე}")
    public BasketPageSteps MyBasketInput() {
        MyBasket.click();
        return this;
    }
    @Step ("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს -{დამატებული პროდუქტის დასახელება}")
    public BasketPageSteps NameBasketInput() {
        NameBasket.click();
        return this;
    }
    @Step ("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის ფერი}")
    public BasketPageSteps ColorBasketInput() {
        ColorBasket.click();
        return this;
    }
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის კოდი}")
    public BasketPageSteps CodeBasketInput() {
        CodeBasket.click();
        return this;
    }
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის რაოდენობა}")
    public BasketPageSteps UnitBasketInput() {
        UnitBasket.click();
        return this;
    }
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს- {დამატებული პროდუქტის ფასი}")
    public BasketPageSteps PriceBasketInput() {
        PriceBasket.click();
        return this;
    }
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის ჯამი ( \"სულ)}")
    public BasketPageSteps AllBasketIpnut() {
        AllBasket.click();
        return this;
    }
 @Step("კალათაში გავზრდით არსებული ღილაკით პროდუქტის რაოდენობას - {პროდუქტი ემატება კალათაში}")
    public BasketPageSteps PlusBasketInput() {
        PlusBasket.click();
        return this;
    }
    @Step("თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    public BasketPageSteps TotalPriceInput() {
        TotalPriceBasket.click();
        return this;
    }
    @Step("თუ შევამცირებთ კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა შემცირდეს თითოეული ველის \"სულ\" მნიშვნელობა")
    public BasketPageSteps MinusBasketInput() {
        MinusBasket.click();
        return this;
    }
    @Step("შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, \"X\" ღილაკზე დაჭერით")
    public BasketPageSteps DeleteInput() {
        DeleteBasket.click();
        return this;
    }
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება")
    public BasketPageSteps ClearInput() {
        ClearBasket.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება- {\"კალათის გასუფთავება\" ღილაკზე დაჭერით გამოდის ტექსტი კალათა ცარიელია}")
    public BasketPageSteps EmptyInput() {
        EmptyBasket.is(Condition.disappear);
        return this;
    }
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება- {\"კალათის გასუფთავება\" ღილაკზე დაჭერით უნდა გაქრეს ღილაკი \"გაგრძელება\"}")
    public BasketPageSteps ContinueInput() {
        ContinueBasket.shouldBe(Condition.hidden);
        return this;
    }
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება-{\"კალათის გასუფთავება\" ღილაკზე დაჭერით უნდა გაქრეს ღილაკი \"კალათის გასუფთავება\"}")
    public BasketPageSteps ContinueBasketInput() {
        ContinueBasket.click();
        return this;
    }
}


