package StepObject;

import PageObject.RegisterPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegisterPageSteps extends RegisterPage {

    public RegisterPageSteps RegisterCartInput(){
        RegisterCart.shouldBe(Condition.visible, Duration.ofMillis(3000)).click();
        return this;
    }
    public RegisterPageSteps AddCartInput(){
        AddCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
    public RegisterPageSteps MyCartInput(){
        MyCart.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
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
    public RegisterPageSteps AddressInput(){
        Address.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }
   public RegisterPageSteps PhoneInput(){
        Phone.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
       return this;
}
public RegisterPageSteps DeliveryInput(){
    Delivery.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
    return this;
}
public RegisterPageSteps EmailInput(){
        Email.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
return this;
}
    public RegisterPageSteps NameCompanyInpus(){
        NameCompany.setValue("კომპანიის სახელწოდება");
        return this;
}
    public RegisterPageSteps PersonalInpus(){
        PersonalId.setValue("საიდენთიფიკაციო კოდი");
        return this;
}
     public RegisterPageSteps PersonalIns(){
      PersonalId.setValue("1234567890");
      return this;
}
   public RegisterPageSteps PersonalIdInput(){
   PersonalId.setValue("123456789125");
   return this;
}
   public RegisterPageSteps PersonalIds(){
        PersonalId.setValue("123456789");
        return this;
   }
   public RegisterPageSteps AddressInputs(){
        Address.setValue("Tbilisi");
        return this;
   }
  public RegisterPageSteps PhoneNomberInput(){
        Phone.setValue("Text");
        return this;
  }
  public RegisterPageSteps PhoneNomInput(){
        Phone.setValue("12345678");
        return this;
  }
  public RegisterPageSteps PhoneNumberMin9(){
        Phone.setValue("123456789123");
        return this;
  }
  public RegisterPageSteps PhoneNumberCorrect9(){
        Phone.setValue("123456789");
        return this;
  }
  public RegisterPageSteps DeliveryMin5(){
        Delivery.setValue("ორშა");
        return this;
  }
  public RegisterPageSteps DeliveryIsCorrect(){
        Delivery.setValue("ორშაბათი");
        return this;
  }
  public RegisterPageSteps EmailCorrect(){
        Email.setValue("test@gmail.com ");
        return this;
  }
  public RegisterPageSteps EmailIncorrect(){
        Email.setValue("test.gmail.com");
        return this;
  }
  public RegisterPageSteps EmailIncorrectInput(){
        Email.setValue("test@gmail");
        return this;
  }
  public RegisterPageSteps EmailIncorrectStep(){
        Email.setValue("test.gmail@");
        return this;
  }
}