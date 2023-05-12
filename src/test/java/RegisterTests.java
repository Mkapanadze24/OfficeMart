import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends ChromeRunner {
    @Test
    @Step("კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით-{უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"}")
    public void RegisterTests1() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                 .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .IurInput()
                .PisInput();
        Assert.assertTrue(registerPageSteps.IurRegister.is(Condition.appear));
        Assert.assertTrue(registerPageSteps.PisRegister.is(Condition.appear));
    }
    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში- {უნდა გაწითლდეს ველი \"კომპანიის სახელწოდება\"}")
    public void RegisterTests2() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput();
        Assert.assertFalse(registerPageSteps.NameCompany.is(Condition.empty));
    }
    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში- {უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"}")
    public void RegisterTests3() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput()
                .PersonalInput();
        Assert.assertFalse(registerPageSteps.PersonalId.is(Condition.empty));
    }
}