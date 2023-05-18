import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends ChromeRunner {
    @Test
    @Description ("Case_18")
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
    @Description("Case_19")
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
    @Description("Case_20")
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
    @Description("Case_21")
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
    @Description("Case_22")
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
    @Description("Case_23")
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
    @Description("Case_24")
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
    @Description("Case_25")
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
    @Description("Case_26")
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
    @Description("Case_27")
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
    @Description("Case_28")
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
    @Description("Case_29")
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
    @Description ("Case_30")
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
    @Description("Case_31")
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
    @Description("Case_32")
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
    @Description("Case_33")
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
    @Description("Case_34")
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
    @Description("Case_35")
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
    @Description("Case_36")
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
    @Description("Case_37")
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
    @Description("Case_38")
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
    @Description("Case_39")
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
    @Description("Case_40")
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

