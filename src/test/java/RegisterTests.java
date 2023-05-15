import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends ChromeRunner {
    @Test
    @Step("კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით-{უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"}")
    public void CartAdd_Continue_Comes_Iur_Pis() {
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
    public void Iur_Nothing_Come_FieldRed() {
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
    public void PersonId_Nothing_Come_FieldRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput()
                .PersonalInput();
        Assert.assertTrue(registerPageSteps.PersonalId.is(Condition.empty));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"ფაქტიური მისამართი\"}")
    public void Address_Nothing_Come_FieldRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput()
                .AddressInput();
        Assert.assertTrue(registerPageSteps.Address.is(Condition.empty));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"}")
    public void Phone_Nothing_Come_FieldRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput()
                .PhoneInput();
        Assert.assertTrue(registerPageSteps.Phone.is(Condition.empty));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"როდის გსურთ შეკვეთის მიღება?\"}")
    public void Delivery_Nothing_Come_FieldRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput()
                .DeliveryInput();
        Assert.assertTrue(registerPageSteps.Delivery.is(Condition.empty));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"ელ.ფოსტა\"}")
    public void Email_Nothing_Come_FieldRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .SendInput()
                .EmailInput();
        Assert.assertTrue(registerPageSteps.Email.is(Condition.empty));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"კომპანიის სახელწოდება\" წითლდება . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს- {ველი აღარ უნდა იყოს წითელი}")
    public void CompanyName_Come_FielisNotdRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .NameCompanyInpus()
                .SendInput();
        Assert.assertTrue(registerPageSteps.NameCompany.is(Condition.visible));
    }

    @Test
    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" ტექსტური ტიპის მონაცემის შეყვანისას - {არ უნდა ჩაიწეროს ველში მნიშვნელობა}")
    public void Text_NoValue() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PersonalInpus()
                .SendInput();
        Assert.assertTrue(registerPageSteps.PersonalId.is(Condition.visible));
    }

    @Test
    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ 11 სიმბოლოზე ნაკლებ რიცხვით მნიშვნელობას და დავაჭერთ გაგზავნა ღილაკს- {უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"}")
    public void PersonalId_FielIsRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PersonalIns()
                .SendInput();
        Assert.assertFalse(registerPageSteps.PersonalId.is(Condition.empty));
    }

    @Test
    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ მაგ 12 სიმბოლს-{ველში მაინც უნდა ჩაიწეროს 11 სიმბოლო}")
    public void PersonalId_Max9() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PersonalIdInput();
        Assert.assertFalse(registerPageSteps.PersonalId.is(Condition.empty));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"საიდენტიფიკაციო კოდი\" წითლდება . თუ ველში ჩავწერთ რიცხვით მნიშვნელობას(დასაშვებია მხოლოდ 11 სიმბოლო) და კვლავ დავაკლიკებთ გაგზავნა ღილაკს-{ველი აღარ უნდა იყოს წითელი}")
    public void PersonalId_Max9_IsCorrect() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PersonalIds()
                .SendInput();
        Assert.assertTrue(registerPageSteps.PersonalId.is(Condition.visible));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ფაქტიური მისამართი\" წითლდება . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს- {ველი აღარ უნდა იყოს წითელი}")
    public void Address_Name_Is_Correct() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .AddressInputs()
                .SendInput();
        Assert.assertTrue(registerPageSteps.Address.is(Condition.visible));
    }

    @Test
    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" ტექტსური ტიპის მონაცემის შეყვანისას- {არ უნდა ჩაიწეროს ველში მნიშვნელობა}")
    public void Phone_IsNotCorrect_Text() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PhoneNomberInput();
        Assert.assertTrue(registerPageSteps.Phone.is(Condition.empty));
    }

    @Test
    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ 9 სიმბოლოზეზე ნაკლებ რიცხვით მნიშნელობას და დავაჭერთ გაგზავნა ღილაკს- {უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"}")
    public void Phone_IsNotCorrect_Min9number() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PhoneNomInput()
                .SendInput();
        Assert.assertFalse(registerPageSteps.Phone.is(Condition.visible));
    }

    @Test
    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ მაგ 12 სიმბოლს- {ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო}")
    public void Phone_Correct_Min9number() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PhoneNumberMin9();
        Assert.assertTrue(registerPageSteps.Phone.is(Condition.visible));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"საკონტაქტო ნომერი\" წითლდება თუ ველში ჩავწერთ 9 სიმბოლოიან რიცხვით მნიშვნელობას და კვლავ დავაჭერთ გაგზავნა ღილაკს {ველი აღარ უნდა იყოს წითელი}")
    public void Phone_Correct_Min9number_FileNotRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .PhoneNumberCorrect9()
                .SendInput();
        Assert.assertTrue(registerPageSteps.Phone.is(Condition.visible));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე ნაკლებია {ველი \"როდის გსურთ შეკვეთის მიღება?\" უნდა დარჩეს წითელი}")
    public void Delivery_Incorrect_Min5number_FileIsRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .DeliveryMin5()
                .SendInput();
        Assert.assertTrue(registerPageSteps.Delivery.is(Condition.visible));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე მეტია {ველი აღარ უნდა იყოს წითელი}")
    public void Delivery_correct_Min5number_FileNotRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .DeliveryIsCorrect();
        Assert.assertTrue(registerPageSteps.Delivery.is(Condition.visible));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დასაშვებ ფორმატში მნიშვნელობას test@gmail.com მაგალითად-{ველი აღარ უნდა იყოს წითელი}")
    public void Email_Correct_FileIsNotRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .EmailCorrect();
        Assert.assertTrue(registerPageSteps.Email.is(Condition.visible));

    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail.com-{ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი}")
    public void Email_Incorrect_FileIsRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .EmailIncorrect()
                .SendInput();
        Assert.assertTrue(registerPageSteps.Email.is(Condition.visible));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test@gmail-{ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი}")
    public void EmailName_Incorrect_FileIsRed() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .EmailIncorrectInput()
                .SendInput();
        Assert.assertTrue(registerPageSteps.Email.is(Condition.visible));
    }

    @Test
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail@-{ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი}")
    public void EmailName_Incorrect_FileIsRed1() {
        RegisterPageSteps registerPageSteps = new RegisterPageSteps();
        registerPageSteps.RegisterCartInput()
                .AddCartInput()
                .MyCartInput()
                .ContinueInput()
                .EmailIncorrectStep()
                .SendInput();
        Assert.assertTrue(registerPageSteps.Email.is(Condition.visible));
    }
}

