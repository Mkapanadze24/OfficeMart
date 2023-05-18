package StepObject;

import PageObject.RegisterPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

import java.time.Duration;

public class RegisterPageSteps extends RegisterPage {
    @Step ("რეგისტრაციის გვერდი{გადადის სარეგისტრაციო გვერდზე}")
    public RegisterPageSteps RegisterCartInput(){
        RegisterCart.shouldBe(Condition.visible, Duration.ofMillis(3000)).click();
        return this;
    }
    @Step ("კალათაში პროდუქტის დამატება- {ირჩევს კალათა ღილაკზე დაჭერით პროდუქტს}")
    public RegisterPageSteps AddCartInput(){
        AddCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step ("კალათაში პროდუქტის დამატების შემდეგ -  {ირჩევს ჩემ კალათას}")
    public RegisterPageSteps MyCartInput(){
        MyCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("კალათში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით - {ირჩევს გაგრძელება ღილაკს}")
    public RegisterPageSteps ContinueInput(){
        ContinueCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით-{უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"}")
    public RegisterPageSteps IurInput(){
        IurRegister.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    @Step("კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერით-{უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"}")
    public RegisterPageSteps PisInput(){
        PisRegister.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    @Step("გაგრძელება ღილაკზე დაჭერა {აგრძელებს მოქმედებას}")
    public RegisterPageSteps SendInput(){
        SendRegister.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში- {უნდა გაწითლდეს ველი \"კომპანიის სახელწოდება\"}")
    public RegisterPageSteps NameCompanyInput(){
        NameCompany.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში- {უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"}")
    public RegisterPageSteps PersonalInput(){
        PersonalId.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"ფაქტიური მისამართი\"}")
    public RegisterPageSteps AddressInput(){
        Address.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"}")
    public RegisterPageSteps PhoneInput(){
        Phone.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
       return this;
}
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"როდის გსურთ შეკვეთის მიღება?\"}")
    public RegisterPageSteps DeliveryInput(){
    Delivery.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
    return this;
}
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში -{უნდა გაწითლდეს ველი \"ელ.ფოსტა\"}")
    public RegisterPageSteps EmailInput(){
        Email.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
      return this;
}
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"კომპანიის სახელწოდება\" წითლდება . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს- {ველი აღარ უნდა იყოს წითელი}")
    public RegisterPageSteps NameCompanyInpus(){
        NameCompany.setValue("კომპანიის სახელწოდება");
        return this;
}
    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" ტექსტური ტიპის მონაცემის შეყვანისას - {არ უნდა ჩაიწეროს ველში მნიშვნელობა}")
    public RegisterPageSteps PersonalInpus(){
        PersonalId.setValue("საიდენთიფიკაციო კოდი");
        return this;
}
    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ 11 სიმბოლოზე ნაკლებ რიცხვით მნიშვნელობას და დავაჭერთ გაგზავნა ღილაკს- {უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"}")
    public RegisterPageSteps PersonalIns(){
      PersonalId.setValue("1234567890");
      return this;
}
    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ მაგ 12 სიმბოლს-{ველში მაინც უნდა ჩაიწეროს 11 სიმბოლო}")
    public RegisterPageSteps PersonalIdInput(){
    PersonalId.setValue("123456789125");
    return this;
}
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"საიდენტიფიკაციო კოდი\" წითლდება . თუ ველში ჩავწერთ რიცხვით მნიშვნელობას(დასაშვებია მხოლოდ 11 სიმბოლო) და კვლავ დავაკლიკებთ გაგზავნა ღილაკს-{ველი აღარ უნდა იყოს წითელი}")
    public RegisterPageSteps PersonalIds(){
        PersonalId.setValue("123456789");
        return this;
   }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ფაქტიური მისამართი\" წითლდება . თუ ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს- {ველი აღარ უნდა იყოს წითელი}")
    public RegisterPageSteps AddressInputs(){
        Address.setValue("Tbilisi");
        return this;
   }
    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" ტექტსური ტიპის მონაცემის შეყვანისას- {არ უნდა ჩაიწეროს ველში მნიშვნელობა}")
    public RegisterPageSteps PhoneNomberInput(){
        Phone.setValue("Text");
        return this;
  }
    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ 9 სიმბოლოზეზე ნაკლებ რიცხვით მნიშნელობას და დავაჭერთ გაგზავნა ღილაკს- {უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"}")
    public RegisterPageSteps PhoneNomInput(){
        Phone.setValue("12345678");
        return this;
  }
    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ მაგ 12 სიმბოლს- {ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო}")
    public RegisterPageSteps PhoneNumberMin9(){
        Phone.setValue("123456789123");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"საკონტაქტო ნომერი\" წითლდება თუ ველში ჩავწერთ 9 სიმბოლოიან რიცხვით მნიშვნელობას და კვლავ დავაჭერთ გაგზავნა ღილაკს {ველი აღარ უნდა იყოს წითელი}")
    public RegisterPageSteps PhoneNumberCorrect9(){
        Phone.setValue("123456789");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე ნაკლებია {ველი \"როდის გსურთ შეკვეთის მიღება?\" უნდა დარჩეს წითელი}")
    public RegisterPageSteps DeliveryMin5(){
        Delivery.setValue("ორშა");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე მეტია {ველი აღარ უნდა იყოს წითელი}")
    public RegisterPageSteps DeliveryIsCorrect(){
        Delivery.setValue("ორშაბათი");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დასაშვებ ფორმატში მნიშვნელობას test@gmail.com მაგალითად-{ველი აღარ უნდა იყოს წითელი}")
    public RegisterPageSteps EmailCorrect(){
        Email.setValue("test@gmail.com ");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail.com-{ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი}")
    public RegisterPageSteps EmailIncorrect(){
        Email.setValue("test.gmail.com");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test@gmail-{ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი}")
    public RegisterPageSteps EmailIncorrectInput(){
        Email.setValue("test@gmail");
        return this;
  }
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail@-{ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი}")
    public RegisterPageSteps EmailIncorrectStep(){
        Email.setValue("test.gmail@");
        return this;
  }
}