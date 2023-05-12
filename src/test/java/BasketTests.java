import StepObject.BasketPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTests extends ChromeRunner {
    @Test
    @Step ("კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერით- {უნდა გამოიტანოს შემდეგი შეტყობინება: \"პროდუქტი წარმატებით დაემატა კალათაში\"}")
    public void Basket_add_successfully(){
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput();
        Assert.assertTrue(basketPageSteps.Addproduct.is(Condition.visible));
    }
    @Test
    @Step ("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის დასახელება}")
    public void Basket_add_product_name(){
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput()
                .MyBasketInput()
                .NameBasketInput();
        Assert.assertTrue(basketPageSteps.MyBasket.is(Condition.visible));
        Assert.assertTrue(basketPageSteps.NameBasket.is(Condition.visible));
    }
    @Test
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის ფერი}")
    public void Basket_add_product_color(){
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput()
                .MyBasketInput()
                .ColorBasketInput();
        Assert.assertTrue(basketPageSteps.ColorBasket.is(Condition.visible));
    }

    @Test
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის კოდი}")
    public void Basket_add_product_code(){
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput()
                .MyBasketInput()
                .CodeBasketInput();
        Assert.assertTrue(basketPageSteps.CodeBasket.is(Condition.visible));
    }

    @Test
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის რაოდენობა}")
    public void Basket_add_product_quantity(){
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput()
                .MyBasketInput()
                .UnitBasketInput();
        Assert.assertTrue(basketPageSteps.UnitBasket.is(Condition.visible));
    }

    @Test
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს- {დამატებული პროდუქტის ფასი}")
    public void Basket_add_product_price(){
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput()
                .MyBasketInput()
                .PriceBasketInput();
        Assert.assertTrue(basketPageSteps.PriceBasket.is(Condition.visible));
    }

    @Test
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლისას უნდა ჩანდეს - {დამატებული პროდუქტის ჯამი ( \"სულ)}")
    public void Basket_add_product_all() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .AddproductInput()
                .MyBasketInput()
                .AllBasketIpnut();
        Assert.assertTrue(basketPageSteps.AllBasket.is(Condition.visible));
    }
    @Test
    @Step("თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    public void Basket_add_product_total() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .PlusBasketInput()
                .TotalPriceInput();
        Assert.assertTrue(basketPageSteps.TotalPriceBasket.is(Condition.enabled));

    }
    @Test
    @Step("თუ შევამცირებთ კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა შემცირდეს თითოეული ველის \"სულ\" მნიშვნელობა")
    public void Basket_deduct_product_total() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .MinusBasketInput()
                .TotalPriceInput();
        Assert.assertTrue(basketPageSteps.TotalPriceBasket.is(Condition.enabled));
    }
    @Test
    @Step("შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, \"X\" ღილაკზე დაჭერით")
    public void Basket_delete_X_product() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .DeleteInput();
        Assert.assertTrue(basketPageSteps.DeleteBasket.is(Condition.visible));
    }
    @Test
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება")
    public void Basket_clear_all_product() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .ClearInput();
        Assert.assertFalse(basketPageSteps.ClearBasket.is(Condition.visible));
    }
    @Test
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება- {\"კალათის გასუფთავება\" ღილაკზე დაჭერით გამოდის ტექსტი კალათა ცარიელია}")
    public void Basket_empty() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .ClearInput()
                .EmptyInput();
        Assert.assertFalse(basketPageSteps.EmptyBasket.is(Condition.visible));
    }
    @Test
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება- {\"კალათის გასუფთავება\" ღილაკზე დაჭერით უნდა გაქრეს ღილაკი \"გაგრძელება\"}")
    public void Basket_clearproduct_continue() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .ClearInput()
                .ContinueInput();
        Assert.assertTrue(basketPageSteps.ContinueBasket.is(Condition.hidden));
    }
    @Test
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება-{\"კალათის გასუფთავება\" ღილაკზე დაჭერით უნდა გაქრეს ღილაკი \"კალათის გასუფთავება\"}")
    public void Basket_clearproduct_clearbasket() {
        BasketPageSteps basketPageSteps = new BasketPageSteps();
        basketPageSteps.BasketInput()
                .ChoseBasketInput()
                .MyBasketInput()
                .ClearInput();
        Assert.assertTrue(basketPageSteps.ClearBasket.is(Condition.hidden));

    }
}
