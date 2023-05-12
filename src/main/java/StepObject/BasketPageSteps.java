package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class BasketPageSteps extends BasketPage {
    public BasketPageSteps BasketInput() {
        Basket.click();
        return this;
    }

    public BasketPageSteps ChoseBasketInput() {
        Chosebasket.click();
        return this;
    }

    public BasketPageSteps AddproductInput() {
        Addproduct.click();
        return this;
    }

    public BasketPageSteps MyBasketInput() {
        MyBasket.click();
        return this;
    }

    public BasketPageSteps NameBasketInput() {
        NameBasket.click();
        return this;
    }

    public BasketPageSteps ColorBasketInput() {
        ColorBasket.click();
        return this;
    }

    public BasketPageSteps CodeBasketInput() {
        ColorBasket.click();
        return this;
    }

    public BasketPageSteps UnitBasketInput() {
        UnitBasket.click();
        return this;
    }

    public BasketPageSteps PriceBasketInput() {
        PriceBasket.click();
        return this;
    }

    public BasketPageSteps AllBasketIpnut() {
        AllBasket.click();
        return this;
    }

    public BasketPageSteps PlusBasketInput() {
        PlusBasket.click();
        return this;
    }

    public BasketPageSteps TotalPriceInput() {
        TotalPriceBasket.click();
        return this;
    }

    public BasketPageSteps MinusBasketInput() {
        MinusBasket.click();
        return this;
    }

    public BasketPageSteps DeleteInput() {
        DeleteBasket.click();
        return this;
    }

    public BasketPageSteps ClearInput() {
        ClearBasket.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        ;
        return this;
    }

    public BasketPageSteps EmptyInput() {
        EmptyBasket.is(Condition.disappear);
        return this;
    }

    public BasketPageSteps ContinueInput() {
        ContinueBasket.shouldBe(Condition.hidden);
        return this;
    }

    public BasketPageSteps ContinueBasketInput() {
        ContinueBasket.click();
        return this;
    }
}


