package StepObject;

import PageObject.RegisterPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegisterPageSteps extends RegisterPage {

    public RegisterPageSteps RegisterCartInput(){
        RegisterCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public RegisterPageSteps AddCartInput(){
        Addcart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public RegisterPageSteps MyCartInput(){
        Mycart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public RegisterPageSteps ContinueInput(){
        ContinueCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public RegisterPageSteps IurInput(){
        IurRegister.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public RegisterPageSteps PisInput(){
        PisRegister.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public RegisterPageSteps SendInput(){
        SendRegister.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }

    public RegisterPageSteps NameCompanyInput(){
        NameCompany.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public RegisterPageSteps PersonalInput(){
        PersonalId.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
}
