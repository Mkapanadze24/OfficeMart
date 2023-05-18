package StepObject;

import PageObject.SearchPage;
import io.qameta.allure.Step;

public class SearchPageSteps extends SearchPage {


    @Step("საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი - {გამოდის ჩასაწერი ველი}")
    public SearchPageSteps SearchInput(){
        Search.click();
        return this;
    }
    @Step("საძიებო ველში სწორი მონაცემებით ძებნა მაგ: კალამი ბურთულიანი - {დაბრუნებული მონაცემების სახელებში უნდა იყოს ძებნისას გადაცემული სიტყვა}")
    public SearchPageSteps SearchTextinput(String Text){
        SearchText.setValue("კალამი ბურთულიანი");
        return this;
    }

    @Step("საძიებო ველში არასწორი მონაცემებით ძებნა (მაგ: satesto)- {უნდა გამოიტანოს შედეგი ტექსტით: \"საძიებო სიტყვა 'satesto' ვერაფერი მოიძებნა\"}")
    public SearchPageSteps NoSearchTextInput (String Texts){
        SearchText.setValue("satesto");
        return this;
    }
}
